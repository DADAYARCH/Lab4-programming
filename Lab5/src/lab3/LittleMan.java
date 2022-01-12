package lab3;

import java.util.Objects;

public class LittleMan extends Human{
    private String name;
    private String move1;

    @Override
    public String getName() {
        return " объект  " + name + " ";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getMove1() {
        return " выполняет действие " + move1 + " ";
    }

    public void setMove1(String move1) {
        this.move1 = move1;
    }

    public LittleMan(String name, String move1){
        setName(name);
        setMove1(move1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LittleMan littleMan = (LittleMan) o;
        return Objects.equals(name, littleMan.name) && Objects.equals(move1, littleMan.move1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, move1);
    }
}

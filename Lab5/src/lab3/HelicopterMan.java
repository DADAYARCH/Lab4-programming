package lab3;

import java.util.Objects;

public class HelicopterMan extends Human{
    private String name;
    private String move1, move2, move3, move4;


    public void setMove(String move1, String move2, String move3){
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
    }

    public void setMove(String move1, String move2, String move3, String move4){
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    public String getMove1() {
        return (" выполнил действие " + move1 + " ");
    }

    public String getMove2() {
        return (" выполнил действие " + move2 + " ");
    }

    public String getMove3() {
        return " выполнил действие "  + move3 + " ";
    }

    @Override
    public String getName() {
        return " объект " + name + " ";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public HelicopterMan(String name, String move1, String move2, String move3) {
        setName(name);
        setMove(move1, move2, move3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelicopterMan that = (HelicopterMan) o;
        return Objects.equals(name, that.name) && Objects.equals(move1, that.move1) && Objects.equals(move2, that.move2) && Objects.equals(move3, that.move3);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, move1, move2, move3);
    }


    public HelicopterMan(String name, String move1, String move2, String move3, String move4) {
        setName(name);
        setMove(move1, move2, move3, move4);
    }
}

package lab3;

import java.util.Objects;

public class SleepCinderela extends Human {
    private String name;
    private String move1, move2, move3, move4;
    private PartOfThe part;

    public void setPart(PartOfThe part){
        this.part = part;
    }

    public String getPart(){
        return " часть объекта " + part + " ";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return " объект  " + name+" ";
    }

    public String getMove1() {
        return move1;
    }

    public String getMove2() {
        return " выполняет действие " + move2 + " ";
    }

    public String getMove3() {
        return " выполняет действие " + move3 + " ";
    }

    public String getMove4() {
        return " выполняет действие " + move4 + " ";
    }

    public void setMove(String move1, String move2, String move3, String move4) {
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    public SleepCinderela(String name, String move1, String move2, String move3, String move4, PartOfThe part){
        setName(name);
        setMove(move1,move2,move3,move4);
        setPart(part);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SleepCinderela that = (SleepCinderela) o;
        return Objects.equals(name, that.name) && Objects.equals(move1, that.move1) && Objects.equals(move2, that.move2) && Objects.equals(move3, that.move3) && Objects.equals(move4, that.move4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, move1, move2, move3, move4);
    }
}

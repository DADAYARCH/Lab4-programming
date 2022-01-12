package lab3;

import java.util.Objects;

public class Kolbasa implements InterfaceStuff{
    private String name;
    private String move1;
    private PartOfThe part;

    @Override
    public String getName() {
        return " объект  " + name ;
    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getMove1() {
        return " выполнил действие "+ move1 + " ";
    }

    public void setMove1(String move1) {
        this.move1 = move1;
    }

    @Override
    public MaterialType getMaterial() {
        return null;
    }

    @Override
    public void setMaterial(MaterialType material) {

    }

    public void setPart(PartOfThe part){
        this.part = part;
    }

    public String getPart(){
        return " часть объекта " + part + " ";
    }

    public Kolbasa(String name, String move1, PartOfThe part){
        setName(name);
        setMove1(move1);
        setPart(part);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kolbasa kolbasa = (Kolbasa) o;
        return Objects.equals(name, kolbasa.name) && Objects.equals(move1, kolbasa.move1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, move1);
    }
}

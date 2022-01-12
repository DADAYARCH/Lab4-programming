package lab3;

import java.util.Objects;

public class BrrBrr implements InterfaceStuff{
    private String name;
    private String move1;
    private String color;
    private MaterialType material;
    private PartOfThe part;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return " объект " + name + " ";
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return " " + color + " ";
    }

    @Override
    public void setMaterial(MaterialType material) {
        this.material = material;
    }

    @Override
    public MaterialType getMaterial() {
        return material;
    }

    public void setMove1(String move1){
        this.move1 = move1;
    }

    public String getMove1(){
        return " выполняет действие " + move1 + " ";
    }

    public void setPart(PartOfThe part){
        this.part = part;
    }

    public String getPart(){
        return " часть объекта " + part + " ";
    }

    public BrrBrr(String name, String move1, String color, MaterialType material, PartOfThe part){
        setName(name);
        setMove1(move1);
        setColor(color);
        setMaterial(material);
        setPart(part);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrrBrr brrBrr = (BrrBrr) o;
        return Objects.equals(name, brrBrr.name) && Objects.equals(move1, brrBrr.move1) && Objects.equals(color, brrBrr.color) && Objects.equals(material, brrBrr.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, move1, color, material);
    }
}

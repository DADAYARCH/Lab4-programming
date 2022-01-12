package lab3;

import java.util.Objects;

public class Shifaner implements InterfaceName {
    private String name;

    @Override
    public String getName() {
        return " объект  " + name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Shifaner(String name){
        setName(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shifaner shifaner = (Shifaner) o;
        return Objects.equals(name, shifaner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

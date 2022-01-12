package lab3;

import java.util.Objects;

public class Tarelka implements InterfaceName {
    private String name;

    @Override
    public String getName() {
        return " объект "+name+" ";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Tarelka(String name){
        setName(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarelka tarelka = (Tarelka) o;
        return Objects.equals(name, tarelka.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "lab3.Tarelka{" +
                "name='" + name + '\'' +
                '}';
    }
}

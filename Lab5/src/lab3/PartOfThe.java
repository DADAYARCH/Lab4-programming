package lab3;

public enum PartOfThe {
    KLUV("клюв"), SLICE("кусочек"), HAND("ручка");

    String name;

    @Override
    public String toString() {
        return this.name;
    }

    PartOfThe(String name){
        this.name = name;
    }
}

package lab3;

public enum MaterialType {
    STEEL("стальной"), GLASS("стеклянный"),
    WOOD("деревянный"), PLASTIC("пластмасовый"),
    PORCELAIN("фарфоровый"), RUBBER("резиновый"),
    CLOTH("тканевый"), METAL("металический"),
    PAPER("бумажный");

    String name;

    @Override
    public String toString() {
        return this.name;
    }

    MaterialType(String name){
        this.name = name;

    }
}

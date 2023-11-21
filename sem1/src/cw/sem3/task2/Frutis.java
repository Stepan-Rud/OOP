package cw.sem3.task2;

public enum Frutis {
    APPLE("Яблоко"), ORANGE("Апельсин"), PINAPPLE("Ананас"), BANANA("Банан"), PEAR("Персик");
    private String name;

    Frutis(String name) {
        this.name = name;
    }
    Frutis() {
    }

    public String getName() {
        return this.name;
    }
}

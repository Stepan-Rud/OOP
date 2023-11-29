package hw.museim;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Exhibits oneHuman = new HumanAncestors("Leonard", 500.0, new PeriodOfExistence("SilverAge"),"excellent language skills");
        Exhibits onePlants = new AncientPlants("Lotos",2000.0, new PeriodOfExistence("Old Babylonian"), "perennial herbaceous plants");
        Exhibits oneAnimal = new AncientAnimals("mamont", 50000000.0, new PeriodOfExistence("Pliocene period"), "elephant");
        Employees securiti = new Securiti("Igor", 20.0, 2);
        Employees guide1 = new Guide("Irina", 23.2, 5);
        Employees guide2 = new Guide("Olga", 25.2, 4);
        Museim  museim = new Museim(Arrays.asList(oneHuman, oneAnimal, onePlants), Arrays.asList(securiti,guide1, guide2));
        System.out.println(museim.searchByExhibitAge(500.0));
        System.out.println("Количество сотрудников музея " + museim.size(museim.getEmployees()));
    }
}

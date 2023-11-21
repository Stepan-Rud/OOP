package cw.sem2.mainAnimal.animalRunSwim;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal animals[] = {
                new HomeCat("Vasya", 8),
                new Tiger("Sharhan", 12),
                new Dog("Dik", 7)
        };
        for (Animal element : animals) {
            element.run(100 + new Random().nextInt(800));
            element.swim(1 + new Random().nextInt(15));
        }
    }
}

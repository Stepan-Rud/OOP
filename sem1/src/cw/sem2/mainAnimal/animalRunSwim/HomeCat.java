package cw.sem2.mainAnimal.animalRunSwim;

public class HomeCat extends Cat{
    public static int count;
    public HomeCat(String name, Integer age) {
        super(name, age);
        count++;
    }
}

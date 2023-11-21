package cw.sem2.mainAnimal.animalRunSwim;

public class Cat extends Animal{
    public static int count;
    public Cat(String name, Integer age) {
        super(name, age, 200, 0);
        count++;
    }

//    @Override
//    protected void run(int distance) {
//        if (distance < maxRunDistance){
//            System.out.println(name + " пробежал " + distance + " метров");
//        }
//        else System.out.println(name + " не смог пробежать " + distance + " метров");
//
//    }

    @Override
    protected void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }
}

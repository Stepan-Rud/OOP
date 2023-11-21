package cw.sem2.mainAnimal.animalRunSwim;

public class Dog extends Animal{
    public Dog(String name, Integer age) {
        super(name, age, 500, 10);
    }

//    @Override
//    protected void run(int distance) {
//        if (distance <= maxRunDistance){
//            System.out.println(name + " пробежал " + distance + " метров");
//        }
//        else System.out.println(name + " не смог пробежать " + distance + " метров");
//    }

    @Override
    protected void swim(int distance) {
        if (distance <= maxSwimDistance){
            System.out.println(name + " проплыл " + distance + " метров");
        }
        else System.out.println(name + " не смог проплыть " + distance + " метров");
    }
}

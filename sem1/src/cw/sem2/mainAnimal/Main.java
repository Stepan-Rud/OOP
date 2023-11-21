package cw.sem2.mainAnimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1) Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую
        Cat cat1 = new Cat();
        cat1.setName("Васька");
        cat1.setColor("Рыжий");
        cat1.setAge(-10);
        Cat cat2Type = new Cat("Бол", "Так себе", 8);
        Cat cat2 = new Cat("Петька", "Черный", 16);
        System.out.println("Кот 1 по имени: " + cat1.getName() + "\nЦвета: " + cat1.getColor() + "\nЛет: " + cat1.getAge()+"\n");
        System.out.println("Кот 2 по имени: " + cat2.getName() + "\nЦвета: " + cat2.getColor() + "\nЛет: " + cat2.getAge()+"\n"+cat2Type.character("пидор")+"\n" + cat2Type.face("чмо"));
        Animal dog1 = new Dog("Шарик", "Чёрный", 5 );
//        cat1.animalInfo();
//        Animal animal = new Animal() {
//            @Override
//            protected void animalInfo() {
//                System.out.println("awe");
//            }
//        };
//        System.out.println(animal.getClass().getName());
        Animal[] animals = {cat2, cat1, dog1};
        for (Animal animall : animals) {
            animall.animalInfo();
        }
        Animal animal = new Cat();
        cat1.clubok();
        System.out.println("\n");
        for (Animal animall : animals) {
            if (animall instanceof Cat) {
                ((Cat) animall).clubok();
            }
            else System.out.println(animall.name + " не умеет заворачиваться");
        }
    }

}
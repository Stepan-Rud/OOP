package cw.sem2.mainAnimal;

public class Dog extends Animal {
    private String color;
    private Integer age;


    public Dog(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    @Override
    protected void animalInfo() {
        System.out.println("Имя собаки: " + toString());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


package cw;

public class Animal {
    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    protected String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    protected void animalInfo() {
        System.out.println("Name animal - " + name);
    }

    protected void voice() {
        System.out.println("the animal makes a sound");
    }

    protected void jump() {
        System.out.println("the animal jump");
    }
}

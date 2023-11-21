package cw.sem2.mainAnimal;

public abstract class Animal {
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

    protected abstract void animalInfo();

    protected void voice() {
        System.out.println("the animal makes a sound");
    }

    protected void jump() {
        System.out.println("the animal jump");
    }
}

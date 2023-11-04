package cw;

public class Cat extends Animal {
    private String color;
    private Integer age;


    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Cat(String name, String type) {
        this.color = color;
        this.age = age;
    }

    public Cat() {

    }



    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String character(String character) {
        if(character != "pidor"){
            return "Ваш кот умница";
        }
        else return "Ваш кот пидор";
    }

    public String face(String type) {
        if(type != "чмо"){
            return "Ваш кот красавчик";
        }
        else return "Ваш кот чмо";
    }
    @Override
    protected void animalInfo() {
        super.animalInfo();
    }

    @Override
    protected void voice() {
        super.voice();
    }

    @Override
    protected void jump() {
        super.jump();
    }
}

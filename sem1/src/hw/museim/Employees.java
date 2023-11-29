package hw.museim;

public class Employees extends Parametrs{
    private Integer experience;

    public Employees(String name, Double age, Integer experience) {
        super(name, age);
        this.experience = experience;
    }
}

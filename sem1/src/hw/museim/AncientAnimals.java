package hw.museim;

public class AncientAnimals extends Exhibits{
    private String kindOfAnimal;

    public AncientAnimals(String name, Double age, PeriodOfExistence period, String kindOfAnimal) {
        super(name, age, period);
        this.kindOfAnimal = kindOfAnimal;
    }

    @Override
    public String toString() {
        return "AncientAnimals" +
                getName() + " " + getAge() +
                " " + getPeriod() + kindOfAnimal+ '\'' +
                '}' + "\n";
    }
}

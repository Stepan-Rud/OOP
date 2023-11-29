package hw.museim;

public class AncientPlants extends Exhibits{
    private String kindOfPlants;

    public AncientPlants(String name, Double age, PeriodOfExistence period, String kindOfPlants) {
        super(name, age, period);
        this.kindOfPlants = kindOfPlants;
    }

    @Override
    public String toString() {
        return "AncientPlants" +
                getName() + " " + getAge() +
                " " + getPeriod() + kindOfPlants + '\'' +
                '}' + "\n";
    }
}

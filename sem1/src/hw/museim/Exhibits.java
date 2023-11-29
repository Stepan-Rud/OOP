package hw.museim;

public class Exhibits extends Parametrs{
    private PeriodOfExistence period;

    public Exhibits(String name, Double age, PeriodOfExistence period) {
        super(name, age);
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public Double getAge() {
        return age;
    }

    public PeriodOfExistence getPeriod() {
        return period;
    }

    @Override
    public String toString() {
        return "Exhibits{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", period=" + period +
                '}';
    }
}

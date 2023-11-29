package hw.museim;

public class HumanAncestors extends Exhibits{
    private String languageSkills;

    public HumanAncestors(String name, Double age, PeriodOfExistence period, String languageSkills) {
        super(name, age, period);
        this.languageSkills = languageSkills;
    }

    @Override
    public String toString() {
        return "HumanAncestors " + getName() + " " + getAge() +
                " " + getPeriod() + languageSkills + '\'' +
                '}' + "\n";
    }
}

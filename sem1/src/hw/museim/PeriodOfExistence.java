package hw.museim;

public class PeriodOfExistence implements Period {
    private String period;

    public PeriodOfExistence(String period) {
        this.period = period;
    }

    @Override
    public String getPeriod(Exhibits exhibits) {
        return period;
    }

    @Override
    public String toString() {
        return  period;
    }
}

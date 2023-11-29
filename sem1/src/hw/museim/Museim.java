package hw.museim;

import java.util.List;
import java.util.stream.Collectors;

public class Museim implements SearchExhibits, Size{
    private List<Exhibits> exhibits;
    private List<Employees> employees;

//    public Museim(List<Exhibits> exhibits) {
//        this.exhibits = exhibits;
//    }

    public Museim(List<Exhibits> exhibits, List<Employees> employees) {
        this.exhibits = exhibits;
        this.employees = employees;
    }

    @Override
    public List<Exhibits> searchByExhibitName(String nameExhibit) {
        return exhibits.stream().filter(el -> el.getName().equals(nameExhibit)).collect(Collectors.toList());
    }
    @Override
    public List<Exhibits> searchByExhibitAge(Double age) {
        return exhibits.stream().filter(el -> el.getAge().equals(age)).collect(Collectors.toList());
    }
    @Override
    public List<Exhibits> searchByExhibitPeriod(String namePeriod) {
        return exhibits.stream().filter(el -> el.getPeriod().equals(namePeriod)).collect(Collectors.toList());
    }

    @Override
    public Integer size(List<Employees> employees) {
        int count = 0;
        for (Employees employee : employees) {
            count++;
        }
        return count;
    }

    public List<Employees> getEmployees() {
        return employees;
    }
}


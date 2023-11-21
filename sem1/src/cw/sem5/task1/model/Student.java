package cw.sem5.task1.model;

public class Student extends User {
    private Integer id;

    public Student(String name, String secondName, Integer year, Integer id) {
        super(name, secondName, year);
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "Студент с именем - " + getName() + ", Фамилия - " + getSecondName() +  ", id = " + id ;
    }
}

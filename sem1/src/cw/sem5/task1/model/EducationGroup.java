package cw.sem5.task1.model;

import java.util.ArrayList;
import java.util.List;

public class EducationGroup {
    private int groupNo;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public EducationGroup(int groupNo, String name, Teacher teacher) {
        this.groupNo = groupNo;
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }
    public EducationGroup(){};

    public EducationGroup(int groupNo, String name) {
        this.groupNo = groupNo;
        this.name = name;
    }

    public EducationGroup(int groupNo) {
        this.groupNo = groupNo;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudent(Student student){
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void deleteStudent(int position){
        students.remove(position);
    }

    @Override
    public String toString() {
        return  groupNo +
                ", название: " + name;
    }

    public int getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getStudents(List<Student> students) {
        this.students = students;
    }
}

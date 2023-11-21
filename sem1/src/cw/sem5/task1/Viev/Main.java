package cw.sem5.task1.Viev;

import cw.sem5.task1.controller.Controller;
import cw.sem5.task1.model.EducationGroup;
import cw.sem5.task1.model.Student;
import cw.sem5.task1.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller =  new Controller();
        Student student1 = controller.createStudent(new Student("Ivan", "Ivanov", 2001, 1));
        Student student2 = controller.createStudent(new Student("Petr", "Petrov", 2003, 2));
        Student student3 = controller.createStudent(new Student("Fedya", "Sumkin", 2002, 3));
        Teacher teacher1 = controller.createTeacher(new Teacher("Boris", "Shihkin", 1968, 1));
        EducationGroup group1 = controller.createEducationGroup(new EducationGroup(1, "Vasilki", teacher1));
        EducationGroup group2 = controller.createEducationGroup(new EducationGroup(2, "Romashki", teacher1));
        group2.addStudent(student3);
        group1.addStudent(student1);
        group1.addStudent(student2);
        List<EducationGroup> listEducGroup = controller.createListEduc(group1);
        listEducGroup = controller.createListEduc(group2);
        controller.printTeacherEducGroup(group1);
        controller.printStudents(student1);
        controller.returnStudents();
        controller.printEducationGroup(group1);
        controller.printListStudents(group1);
        controller.printListEduc(listEducGroup);
//        group1.deleteStudent(0);
    }
}

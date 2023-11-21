package cw.sem5.task1.Viev;

import cw.sem5.task1.model.EducationGroup;

import java.util.List;

public class EducationGroupView {
    public void printEducGroup(EducationGroup educ) {
        System.out.println("Группа обучающихся № " + educ);
    }
    public void printListStudentsEducGroup(EducationGroup educ){
        System.out.println(educ.getStudents());
    }
    public void printTeacherEducGroup(EducationGroup educ){
        System.out.println(educ.getTeacher());
    }
    public void printListEducGroup(List<EducationGroup> educGroup) {
        for (EducationGroup group : educGroup) {
            System.out.println(group);
        }
    }
}

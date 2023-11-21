package cw.sem5.task1.controller;

import cw.sem5.task1.Viev.EducationGroupView;
import cw.sem5.task1.Viev.StudentView;
import cw.sem5.task1.Viev.TeacherView;
import cw.sem5.task1.model.EducationGroup;
import cw.sem5.task1.model.Student;
import cw.sem5.task1.model.Teacher;
import cw.sem5.task1.model.User;
import cw.sem5.task1.service.EducationGroupService;
import cw.sem5.task1.service.UserService;

import java.util.List;

//    Создать package – controller. Работу продолжаем в нем
//� Создать класс Controller агрегирующий в себе необходимые классы в виде
//    полей, а инициализируем прям в поле.
//� Создаем метод созданиеСтудента – реализующий логику, путем вызова
//    соответствующих методов интерфейсов:
//            � Создания Студента в сервисе
//� Возвращение всех студентов в сервисе
//� Вызов view и передача списка найденных студентов
public class Controller {
    private UserService userService;
    private StudentView studentView;
    private EducationGroupService educationGroupService;
    private EducationGroupView educView;
    private TeacherView teacherView;

    public Controller() {
        this.userService = new UserService();
        this.studentView = new StudentView();
        this.educationGroupService = new EducationGroupService();
        this.educView = new EducationGroupView();
    }

    public Student createStudent(Student student){
        return (Student)userService.create(student);
    }
    public Teacher createTeacher(Teacher teacher){
        return (Teacher)userService.create(teacher);
    }
    public EducationGroup createEducationGroup(EducationGroup group){
        return (EducationGroup) educationGroupService.creatEducGroup(group);
    }

    public List<User> returnStudents(){
        return userService.read();
    }
    public List<EducationGroup> createListEduc(EducationGroup group){return educationGroupService.createListEducGroup(group);}

    public void printStudents(Student student){
        studentView.printStudent(student);
    }
    public void printTeacher(Teacher teacher){
        teacherView.printTeacher(teacher);
    }
    public void printEducationGroup(EducationGroup educGroup){
        educView.printEducGroup(educGroup);
    }
    public void printListStudents(EducationGroup educGroup){
        educView.printListStudentsEducGroup(educGroup);
    }
    public void printTeacherEducGroup(EducationGroup educGroup){
        educView.printTeacherEducGroup(educGroup);
    }
    public void printListEduc(List<EducationGroup> listGroup){
        educView.printListEducGroup(listGroup);
    }
}


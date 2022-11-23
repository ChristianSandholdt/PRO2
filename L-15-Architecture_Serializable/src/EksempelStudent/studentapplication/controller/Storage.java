package EksempelStudent.studentapplication.controller;

import EksempelStudent.studentapplication.model.Student;

import java.util.List;

public interface Storage {
    List<Student> getStudents();
    void storeStudent(Student student);
    void deleteStudent(Student student);
}

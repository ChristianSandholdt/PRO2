package E2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentNo;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, int studentNo) {
        this.name = name;
        this.studentNo = studentNo;
    }

    public int getStudentNo(){
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentNo=" + studentNo +
                '}';
    }
}

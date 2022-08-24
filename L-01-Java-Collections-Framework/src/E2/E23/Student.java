package E2.E23;

import java.util.LinkedHashSet;
import java.util.Set;

public class Student {
    private String name;
    private int studentNo;
    private Set<Integer> grades = new LinkedHashSet<>();

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

    public Set<Integer> getGrades() {
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

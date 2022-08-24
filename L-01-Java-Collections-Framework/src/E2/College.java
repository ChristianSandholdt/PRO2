package E2;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;

    private List<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }

    public College(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public double calcAverage(){
        double max = 0;
        double sum = 0;
        for (Student s : students) {
            for (Integer i : s.getGrades()) {
                max += i;
                sum++;
            }
        }
        return max/sum;
    }

    public Student findStudent(int studentNo) {
        Student p = null;
        for (Student s : students) {
            if (s.getStudentNo() == studentNo) {
                p = s;
            }
        }
        return p;
    }

    @Override
    public String toString() {
        return toString();
    }
}

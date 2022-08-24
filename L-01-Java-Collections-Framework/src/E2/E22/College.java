package E2.E22;


import java.util.LinkedHashSet;
import java.util.Set;

public class College {
    private String name;

    private Set<Student> students = new LinkedHashSet<>();

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

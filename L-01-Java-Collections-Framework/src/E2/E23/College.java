package E2.E23;


import java.util.LinkedHashMap;
import java.util.Map;

public class College {
    private String name;

    private Map<Integer, Student> students = new LinkedHashMap<>();

    public String getName() {
        return name;
    }

    public College(String name) {
        this.name = name;
    }



    public void addStudent(Student student){
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public double calcAverage(){
        double max = 0;
        double sum = 0;
        for (Student s : students.values()) {
            for (Integer i : students.keySet()) {
                max += i;
                sum++;
            }
        }
        return max/sum;
    }

    public Student findStudent(int studentNo) {
        Student p = null;
        for (Student s : students.values()) {
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

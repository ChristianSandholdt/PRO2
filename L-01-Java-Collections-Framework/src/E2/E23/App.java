package E2.E23;

public class App {
    public static void main(String[] args) {

        Student s1 = new Student("Roberto", 123);
        Student s2 = new Student("Joe",321);

        s1.addGrade(10);
        s1.addGrade(7);

        s2.addGrade(12);
        s2.addGrade(4);

        College c1 = new College("EAAA");

        c1.addStudent(s1);
        c1.addStudent(s2);

        System.out.println(c1.calcAverage());
        System.out.println(c1.findStudent(123));
        System.out.println(c1.findStudent(222));
    }
}

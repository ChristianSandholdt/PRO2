package E2;

public class App {
    public static void main(String[] args) {

        Student s1 = new Student("Martin",12345);
        s1.addGrade(12);
        s1.addGrade(2);
        s1.addGrade(10);
        s1.addGrade(10);

        Student s2 = new Student("Mohamed", 54321);
        s2.addGrade(12);
        s2.addGrade(7);
        s2.addGrade(12);

        College c1 = new College("EAAA");

        c1.addStudent(s1);
        c1.addStudent(s2);

        System.out.println(c1.calcAverage());

        System.out.println(c1.findStudent(12345));

        //8.5
        //10.33

        //expected samlet 9,415


    }
}

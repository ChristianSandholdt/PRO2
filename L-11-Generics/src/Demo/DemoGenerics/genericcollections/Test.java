package Demo.DemoGenerics.genericcollections;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Person a = new Person("");
        Mechanic m = new Mechanic("", 3);
        a = m; // allowed, because Person is superclass to Mechanic
//        m = a; // not allowed, because Mechanic is not a superclass to Person

        //---------------------------------------------------------------------

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Hans"));
        persons.add(new Person("Anders"));

        ArrayList<Mechanic> mechanics = new ArrayList<Mechanic>();
        mechanics.add(new Mechanic("Mads", 250));
        mechanics.add(new Mechanic("Keld", 280));

//        persons = mechanics; // not allowed, because ArrayList<Person> is NOT a superclass to ArrayList<Mechanic>
//        mechanics = persons; // not allowed, because ArrayList<Mechanic> is NOT a superclass to ArrayList<Person>

//        System.out.print("print1(persons): ");
//        print1(persons);
//        System.out.println();
////        print1(mechanics); // not allowed, because ArrayList<Person> is not a superclass to ArrayList<Mechanic>
//
//        System.out.println("print2(mechanics): ");
//        print2(mechanics);
//        System.out.println();
////        print2(persons); // not allowed, because ArrayList<Mechanic> is not a superclass to ArrayList<Person>

        System.out.println("print3(persons): ");
        print3(persons); // allowed, because ArrayList<? extends Person> is a superclass to ArrayList<Person>
        System.out.println();
        System.out.print("print3(mechanics) :");
        print3(mechanics); // allowed, because ArrayList<? extends Person> is a superclass to ArrayList<Mechanic>
        System.out.println();

        //---------------------------------------------------------------------

        List<String> strings = new ArrayList<>(List.of("Kurt", "Viggo"));
        List<Integer> integers = new ArrayList<>(List.of(1, 2));
        System.out.println(strings.getClass()); // java.util.ArrayList, type erasure of <String>
        System.out.println(integers.getClass()); // java.util.ArrayList, type erasure of <Integer>
        System.out.println(strings.getClass() == integers.getClass()); // true
    }

    public static void print1(ArrayList<Person> list) {
        for (Person p : list) {
            System.out.print(p + "  ");
        }
        System.out.println();
    }

    public static void print2(ArrayList<Mechanic> list) {
        for (Mechanic m : list) {
            System.out.print(m + "  ");
        }
        System.out.println();
    }

    public static void print3(ArrayList<? extends Person> list) {
        for (Person p : list) {
            System.out.print(p + "  ");
        }
        System.out.println();
    }
}

package Demo.DemoGenerics.genericmethods;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("Ib");
        Person p2 = new Person("Ulla");
        Person p3 = new Person("Per");

        Mechanic m1 = new Mechanic("Keld", 200);
        Mechanic m2 = new Mechanic("Hans", 300);
        Mechanic m3 = new Mechanic("Jens", 400);

        Person maxP = max(p1, p2, p3);
        System.out.println(maxP);
        System.out.println();

        Mechanic maxM = max(m1, m2, m3);
        System.out.println(maxM);
        System.out.println();

//        System.out.println(max("Ib", "Ulla", "Per"));
//        System.out.println(max(2, 7, 4));
//        System.out.println(max(3.1, 2.0, 1.4));
//        System.out.println();

        //---------------------------------------------------------------------

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        Person maxPL = max(persons);
        System.out.println(maxPL);

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(m1);
        mechanics.add(m2);
        mechanics.add(m3);

        Mechanic maxML = max(mechanics);
        System.out.println(maxML);
    }

//    public static Person max(Person x, Person y, Person z) {
//        Person result = x;
//        if (y.compareTo(result) > 0) {
//            result = y;
//        }
//        if (z.compareTo(result) > 0) {
//            result = z;
//        }
//        return result;
//    }
//
//    public static Mechanic max(Mechanic x, Mechanic y, Mechanic z) {
//        Mechanic result = x;
//        if (y.compareTo(result) > 0) {
//            result = y;
//        }
//        if (z.compareTo(result) > 0) {
//            result = z;
//        }
//        return result;
//    }

    public static <T extends Comparable<? super T>> T max(T x, T y, T z) {
        T result = x;
        if (y.compareTo(result) > 0) {
            result = y;
        }
        if (z.compareTo(result) > 0) {
            result = z;
        }
        return result;
    }

//    // Pre: List is not empty.
//    public static Person max(List<Person> list) {;
//        Person result = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i).compareTo(result) > 0)
//                result = list.get(i);
//        }
//        return result;
//    }

    // Pre: List is not empty.
    public static<T extends Comparable<? super T>> T max(List<T> list) {;
        T result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(result) > 0)
                result = list.get(i);
        }
        return result;
    }
}

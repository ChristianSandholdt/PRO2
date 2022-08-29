package Ex1.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );
        System.out.println(persons);
        System.out.println();


        System.out.println("A");
        System.out.println(findFirst(persons, fireOgFyrre));
        System.out.println("B");
        System.out.println(findFirst(persons, startsWithS));
        System.out.println("C");
        System.out.println(findFirst(persons,moreThanOneI));
        System.out.println("D");
        System.out.println(findFirst(persons,ageEqualToNameLength));
        System.out.println();
        System.out.println("F");
        System.out.println(findAll(persons,nameContainsI));
        System.out.println("G");
        System.out.println(findAll(persons, nameStartsWithS));
        System.out.println("H");
        System.out.println(findAll(persons,lengthOfFive));
        System.out.println("I");
        System.out.println(findAll(persons,overSixUnderForty));
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }

    public static List<Person> findAll(List<Person> list, Predicate<Person> filter){
        List<Person> arrP = new ArrayList<>();
     for (Person p : list){
         if (filter.test(p)){
             arrP.add(p);
         }
     }
     return arrP;
    }

    //A
    static Predicate<Person> fireOgFyrre = person -> {
        return person.getAge() == 44;
    };
    //B
    static Predicate<Person> startsWithS = person -> {
        return person.getName().startsWith("S");
    };
    //C
    static Predicate<Person> moreThanOneI = person -> {
        return person.getName().indexOf("i") != person.getName().lastIndexOf("i");
    };
    //D
    static Predicate<Person> ageEqualToNameLength = person -> {
        return person.getAge() == person.getName().length();
    };
    //F
    static Predicate<Person> nameContainsI = person -> {
        return person.getName().contains("i");
    };

    static Predicate<Person> nameStartsWithS = person -> {
        return person.getName().startsWith("S");
    };

        static Predicate<Person> lengthOfFive = person -> {
        return person.getName().length() == 5;
    };

        static Predicate<Person> overSixUnderForty = person -> {
            return person.getName().length() > 5 && person.getAge() < 40;
        };



}

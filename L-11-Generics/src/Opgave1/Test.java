package Opgave1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        Person<String> p1 = new Person<>("Jordan",21);
        Person<String> p2 = new Person<>("Jordon",22);
        Person<String> p3 = new Person<>("Roberto",23);
        Person<String> p4 = new Person<>("Mohamed",24);
        Person<FullName> p5 = new Person<>(new FullName("Andrew","Robertson"),25);
        Person<FullName> p6 = new Person<>(new FullName("Trent","Alexander"),26);
        Person<FullName> p7 = new Person<>(new FullName("Harvey","Elliot"),27);
        Person<FullName> p8 = new Person<>(new FullName("Curtis","Jones"),28);


        System.out.println(p1.compareTo(p2));

        if (p1.compareTo(p2) < 0){
            System.out.println(p1 + "<" + p2);
        } else if (p1.compareTo(p2) == 0){
            System.out.println(p1 + "=" + + 2);
        } else {
            System.out.println(p1 + ">" + p2);
        }
        System.out.println();

        ArrayList<Person<FullName>> fullNamePersons = new ArrayList<>(List.of(p5,p6,p7,p8));

        System.out.println(fullNamePersons);
        Collections.sort(fullNamePersons);
        System.out.println(fullNamePersons);


        ArrayList<Person> persons = new ArrayList<>(List.of(p1,p2,p3,p4));

        System.out.println();


        System.out.println(persons);
        persons.sort(Person::compareTo);
        System.out.println(persons);

    }





}

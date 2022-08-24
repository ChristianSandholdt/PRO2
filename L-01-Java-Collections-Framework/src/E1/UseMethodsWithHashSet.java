package E1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UseMethodsWithHashSet {
    public static void main(String[] args) {

        //A
        Set<Integer> numbers = new HashSet<>();

        //B + C
        numbers.add(34);
        numbers.add(12);
        numbers.add(23);
        numbers.add(45);
        numbers.add(67);
        numbers.add(34);
        numbers.add(98);
        System.out.println(numbers);

        //D + F
        numbers.add(23);
        System.out.println(numbers);

        //G
        numbers.remove(67);
        System.out.println(numbers);

        //H
        System.out.println(numbers.contains(23));

        //I
        System.out.println(numbers.size());



    }
}

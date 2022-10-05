package Opgave2;

import java.util.HashSet;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {

        //Unions - Plusser begge lister sammen uden duplikater da det er sets
        System.out.println("Unions");
        HashSet<Integer> ints1 = new HashSet<>(List.of(1,2,3,4,5));
        HashSet<Integer> ints2 = new HashSet<>(List.of(1,2,3,4,5,6));
        HashSet<Integer> ints3 = new HashSet<>(List.of(5,6,7,8,9));
        System.out.println(unionOfSets(ints1,ints2));

        HashSet<String> strings1 = new HashSet<>(List.of("Kat","Hat","Mat"));
        HashSet<String> strings2 = new HashSet<>(List.of("Hus","Mus","Kat"));
        HashSet<String> strings3 = new HashSet<>(List.of("Lus","Mus","Hus"));
        System.out.println(unionOfSets(strings1,strings2));
        System.out.println();

        //Intersections - Dem som er fælles for de to lister
        System.out.println("Intersections");
        System.out.println(intersectionOfSets(ints1,ints2));
        System.out.println(intersectionOfSets(strings1,strings2));
        System.out.println();

        //Differences
        System.out.println("Differences");
        System.out.println(differenceInSets(ints1,ints2));
        System.out.println(differenceInSets(strings1,strings2));
        System.out.println();

        //Add two sets to one set
        System.out.println("Add two sets to one set");
        System.out.println(addToOneSet(strings1,strings2,strings3));
        System.out.println(addToOneSet(ints1,ints2,ints3));


    }

    public static<E> HashSet<E> unionOfSets(HashSet<E> set1, HashSet<E> set2){
        HashSet<E> temp = new HashSet<>();
        temp.addAll(set1);
        temp.addAll(set2);
        return temp;
    }

    public static<E> HashSet<E> intersectionOfSets(HashSet<E> set1,HashSet<E> set2){
        HashSet<E> temp = new HashSet<>();
        for (E e : set1) {
            if (set2.contains(e)){
                temp.add(e);
            }
        }
        return temp;
    }

    public static <E> HashSet<E> differenceInSets(HashSet<E> set1, HashSet<E> set2){
        HashSet<E> temp = new HashSet<>();
        temp.addAll(set1);
        temp.addAll(set2);

        for (E e : set1){
                if (set2.contains(e)){
                    temp.remove(e);

            }
        }
        return temp;
    }

    public static <E> HashSet<E> addToOneSet(HashSet<E> set1, HashSet<E> set2, HashSet<E> set3){
        set3.addAll(set1);
        set3.addAll(set2);
        return set3;
    }



}

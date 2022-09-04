package Ex3;

import java.util.*;

public class Opgave3 {
    public static void main(String[] args) {

        //A
        System.out.println("Opgave A");
        List<Integer> tal = List.of(1,2,3,4,5,6,7,8);


        Iterator<Integer> iterator = tal.iterator();

        //Kigger efter at så længe iteratoren har en næste værdi at kigge på så printer man den ud.
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println();


        //Obs benytter ikke iterator som der står i opgaven og som der bliver gjort i opgave a.
        System.out.println("Opgave b");
        Map<Integer,Integer> map = new HashMap<>();

        map.put(2,4);
        map.put(3,9);
        map.put(4,16);
        map.put(5,25);
        map.put(6,36);

        for (Map.Entry<Integer, Integer> set : map.entrySet()){
            System.out.printf("("+ set.getKey() + " " + set.getValue() + ")" +"\n");
        }

        Iterator<Map.Entry<Integer,Integer> > iteratorMap = map.entrySet().iterator();
        System.out.println();
        System.out.println();


        System.out.println("Opgave B med iterator");
        while (iteratorMap.hasNext()){
            Map.Entry<Integer,Integer> nyMap = (Map.Entry<Integer,Integer>) iteratorMap.next();

            System.out.printf("("+ nyMap.getKey() + " " + nyMap.getValue() + ")" +"\n");
        }

    }
}

package E4;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class E4 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Opgave A");

        File in = new File("L-01-Java-Collections-Framework/src/E4/text");
        int count = 0;
        try (Scanner scanner = new Scanner(in)) {
            Set<String> words = new TreeSet<>();
            scanner.useDelimiter("[^A-ZÆØÅa-zæøå'-]+");
            while (scanner.hasNext()){
                String word = scanner.next();
                count++;
                words.add(word);
            }

            System.out.println("A");
            System.out.println("Total number of words: " + count);
            System.out.println(words);
            System.out.println("Different words: " + words.size());
        }
//opgave b printer ikke alle ord med value over 1000 ud
        System.out.println("Opgave B");
        Map<String, Integer> map = new TreeMap<>();
        File in1 = new File("L-01-Java-Collections-Framework/src/E4/text");
        try (Scanner scanner = new Scanner(in1)) {
            scanner.useDelimiter("[^A-ZÆØÅa-zæøå'-]+");
            while (scanner.hasNext()){
                int sum = 0;
                String word = scanner.next();
                sum++;
                map.put(word, sum);
        }
            System.out.println(map.size());
    }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() > 1000){
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
}

}

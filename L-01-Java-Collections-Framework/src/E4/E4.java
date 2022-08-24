package E4;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class E4 {
    public static void main(String[] args) throws FileNotFoundException {

        File in = new File("L-01-Java-Collections-Framework/src/E4/text");
        try (Scanner scanner = new Scanner(in)) {
            Set<String> words = new TreeSet<>();
            ArrayList<String> arrWords = new ArrayList<>();
            while (scanner.hasNext()){
                String word = scanner.next().toLowerCase();
                words.add(word);
                arrWords.add(word);
            }

            System.out.println("A");
            System.out.println("Total number of words: " + arrWords.size());
            System.out.println("Different words: " + words.size());
        }

        File in1 = new File("L-01-Java-Collections-Framework/src/E4/text");
        try (Scanner scanner = new Scanner(in1)) {
            Map<String, Integer> map = new TreeMap<>();
            int sum = 0;
            while (scanner.hasNext()){
                String word = scanner.next();
                map.put(word, sum++);
        }
//            int i = 0;
//            for (String word : map.keySet()){
//                i++;
//                if (i>= 1000){
//                    System.out.println();
//                }
//            }
            System.out.println(map.size());
            System.out.println(sum);
    }
}

}

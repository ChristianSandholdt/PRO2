package Ex4.ex4student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Ex4 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        System.out.println(runners);
        System.out.println();

        ListIterator<Runner> iterator = runners.listIterator();

        //B

        while (iterator.hasNext()){
            if (iterator.next().getLapTime() >= 40){
                iterator.remove();
            }
        }
        System.out.println(runners);

        //D
        // System.out.println(removeIf(runners, slowerThanForty));

        //E
        System.out.println(runners.removeIf(runner -> runner.getLapTime() >= 40));
        System.out.println(runners);

    }
    //C
    public static boolean removeIf(List<Runner> runners, Predicate<Runner> filter){
        runners.removeIf(runner -> runner.getLapTime() >= 40);
        System.out.println(runners);
        return false;
    }

    static Predicate<Runner> slowerThanForty = runner -> {
        return runner.getLapTime() >= 40;
    };



}
package OpgaveIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {



    public static void main(String[] args) {

        ArrayedList a = new ArrayedList(10);

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);


        Iterator it = a.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

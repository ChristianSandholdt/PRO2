package ex2;

public class ex2Demo {

    public static void main(String[] args) {
        ex2Test();

    }

    public static void ex2Test(){
        CircularArrayQueue<String> list = new CircularArrayQueue<>();

        System.out.println("Add elements to list");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");

        System.out.println();

        System.out.println("Print list size");
        System.out.println(list.size());
        System.out.println();


        System.out.println("Remove an element");
        list.remove();

        System.out.println("Print list size after remove");
        System.out.println(list.size());
        System.out.println();

        System.out.println("Check if list is empty");
        System.out.println(list.isEmpty());
        System.out.println();

        System.out.println("Print list elements");
        System.out.println(list.toString());
        System.out.println();

        System.out.println("Print first element");
        System.out.println(list.element());
        System.out.println();

        System.out.println("Show array can circle instead of expanding");
        list.remove();
        list.remove();
        list.remove();
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("12");
        System.out.println(list.toString());

        System.out.println("Clear list...");
        list.clear();
        System.out.println("List cleared");
        System.out.println("List is empty? " + list.isEmpty());
        System.out.println("Elements in list = " + list.toString());
        System.out.println(list.size());

    }
}

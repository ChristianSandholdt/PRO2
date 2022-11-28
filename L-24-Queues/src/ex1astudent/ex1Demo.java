package ex1astudent;

import java.lang.reflect.Array;

public class ex1Demo {

    public static void main(String[] args) {
        SingleLinkedQueue<String> list = new SingleLinkedQueue<>();

        //ex1Test();

        //ex2Test();

        ex3Test();

    }

    public static void ex3Test(){
        ArrayQueue<String> list = new ArrayQueue<>(10);

        System.out.println("Add elements to list");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("12");
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

        System.out.println("Clear list...");
        list.clear();
        System.out.println("List cleared");
        System.out.println("List is empty? " + list.isEmpty());
        System.out.println("Elements in list = " + list.toString());
        System.out.println(list.size());
    }

    public static void ex2Test(){
        DoubleLinkedQueue<String> list = new DoubleLinkedQueue<>();

        System.out.println("Add elements to list");
        list.add("1");
        list.add("2");
        list.add("3");
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

        System.out.println("Clear list");
        list.clear();
        System.out.println("List cleared");
        System.out.println("List is empty? " + list.isEmpty());
        System.out.println("Elements in list = " + list.toString());
    }

    public static void ex1Test(){
        SingleLinkedQueue<String> list = new SingleLinkedQueue<>();

        //Add elements
        System.out.println("Add elements");
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println();

        //Print list size
        System.out.println("Print list size");
        System.out.println(list.size());

        //Remove element
        System.out.println("Remove an element");
        list.remove();
        System.out.println("Print size after removal");
        System.out.println(list.size());
        System.out.println();

        //Is list empty
        System.out.println("Check if list is empty");
        System.out.println(list.isEmpty());
        System.out.println();

        //Print list
        System.out.println("Print list elements");
        System.out.println(list.toString());
        System.out.println();

        //Get first element in list
        System.out.println("Return first element in list");
        System.out.println(list.element());
        System.out.println();

        //Clear list
        System.out.println("Clear list");
        list.clear();
        System.out.println("Print list after clear");
        System.out.println(list.toString());
    }

}

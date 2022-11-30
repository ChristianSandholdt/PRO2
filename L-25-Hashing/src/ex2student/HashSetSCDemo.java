package ex2student;

public class HashSetSCDemo {
    public static void main(String[] args) {
        HashSetSC<Integer> list = new HashSetSC<>(11);

        System.out.println("Add elements");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println();

        System.out.println("Print list size");
        System.out.println(list.size());
        System.out.println();

        System.out.println("Remove element 1");
        list.remove(1);
        System.out.println();

        System.out.println("Print size after removal");
        System.out.println(list.size());
        System.out.println();

        System.out.println("Print list elements");
        System.out.println(list);
        System.out.println();
        System.out.println(list.size());
    }
}

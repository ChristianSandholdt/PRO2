package ex1astudent;

public class ex1Demo {

    public static void main(String[] args) {
        SingleLinkedQueue<String> list = new SingleLinkedQueue<>();

        //Add elements
        list.add("1");
        list.add("2");
        list.add("3");

        //Print list size
        System.out.println(list.size());

        //Remove element
        list.remove();
        System.out.println(list.size());

        //Is list empty
        System.out.println(list.isEmpty());

        //Print list
        System.out.println(list.toString());

        //Get first element in list
        System.out.println(list.element());

        //Clear list
        list.clear();
        System.out.println(list.toString());

    }
}

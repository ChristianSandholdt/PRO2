package opgave2;

public class ex2Demo {
    public static void main(String[] args) {
        SortedDLL list = new SortedDLL();


        list.add("Aabe");
        list.add("Papegøje");
        list.add("Struds");
        list.add("Abe");
        list.add("Elefant");
        list.printElements();
        //Remove
        System.out.println(list.remove("Struds"));

        System.out.println();
        list.printElements();

    }
}

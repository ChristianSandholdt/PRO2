package opgave2;

public class ex2Demo {
    public static void main(String[] args) {
        SortedDLL list = new SortedDLL();


//        list.add("Papegøje");
//        list.add("Aabe");
//        list.add("Struds");
        list.add("Elefant");
        list.add("Abe");
        list.add("Citron");
        list.printElements();
        //Remove

        System.out.println();
//        System.out.println(list.remove("Struds"));

        System.out.println();
        list.printElements();

    }
}

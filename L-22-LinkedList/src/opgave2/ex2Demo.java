package opgave2;

public class ex2Demo {
    public static void main(String[] args) {
        SortedDLL list = new SortedDLL();


        list.add("Papegøje");
        list.add("Struds");
        list.add("Frø");
        list.add("Elefant");
        list.add("Søko");
        list.add("Solsort");
        list.add("Abe");
        list.add("Citron");
        list.add("Tiger");
        list.printElements();
        //Remove

        System.out.println();
        System.out.println("Remove struds");
        list.remove("Struds");
        list.printElements();
        System.out.println();

        System.out.println("Remove last element");
        System.out.println(list.removeLast());
        list.printElements();
        System.out.println();

        System.out.println("Count elements");
        System.out.println(list.count());
    }
}

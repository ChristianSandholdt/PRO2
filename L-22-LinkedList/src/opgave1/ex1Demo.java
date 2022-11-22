package opgave1;

public class ex1Demo {

    public static void main(String[] args) {
        SortedLL list = new SortedLL();


        list.add("Paris");
        list.add("Rom");
        list.add("Berlin");
        list.add("Doha");
        list.add("Zurich");
        list.printElements();
        list.removeLast();
        System.out.println();
        list.printElements();
        list.remove("Doha");
        System.out.println();
        list.printElements();

        System.out.println(list.count());


    }
}

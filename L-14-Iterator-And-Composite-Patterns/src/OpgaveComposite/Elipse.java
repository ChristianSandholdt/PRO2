package OpgaveComposite;

public class Elipse extends ShapesComponent {

    private String name;

    private double a; // Mindste radius

    private double b; // Største radius
    public Elipse(String name, double a, double b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String draw() {
        return toString();
    }


    public double calcCirc(){
        return 2 * Math.PI * Math.sqrt((a*a+b*b)/2);
    }
    public static void main(String[] args) {
        Elipse e = new Elipse("Martin",2,3);

        e.draw();
        System.out.println(e.calcCirc());
    }




}


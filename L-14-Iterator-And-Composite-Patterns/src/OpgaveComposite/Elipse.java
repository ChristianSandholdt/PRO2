package OpgaveComposite;

public class Elipse extends ShapesComponent {

    private String name;

    private final double a; // Mindste radius

    private final double b; // Største radius
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

    @Override
    public String draw() {
        return super.draw();
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


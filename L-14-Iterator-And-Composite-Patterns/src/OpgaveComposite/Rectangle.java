package OpgaveComposite;

public class Rectangle extends ShapesComponent{

    private String name;
    private double a;
    private double b;
    public Rectangle(String name, double a, double b){
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


    public String draw(){
        return toString();
    }

    public double calcCirc(){
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("R1",2,4);

        System.out.println(r1.calcCirc());

    }
}

package OpgaveComposite;

public class Triangle extends ShapesComponent{

    private String name;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name,double side1, double side2, double side3){
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

    public double calcCirc() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle("T1",2,3,4);

        t1.draw();
        System.out.println(t1.calcCirc());
    }

}

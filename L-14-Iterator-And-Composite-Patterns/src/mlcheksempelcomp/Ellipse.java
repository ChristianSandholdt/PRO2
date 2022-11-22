package mlcheksempelcomp;

public class Ellipse extends Figure
{
    private double a, b;

    public Ellipse(String name, double a, double b)
    {
        super(name);
        this.a = a;
        this.b = b;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    @Override
    public void draw()
    {
        System.out.print("Ellipse " + this.getName());
    }

    @Override
    public double calcCirc()
    {
        return Math.PI * (a + b);
    }

}

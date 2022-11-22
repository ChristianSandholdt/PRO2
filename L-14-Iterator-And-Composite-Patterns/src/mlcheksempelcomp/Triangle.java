package mlcheksempelcomp;
public class Triangle extends Figure
{
    private double a, b, c;

    public Triangle(String name, double a, double b, double c)
    {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public double getC()
    {
        return c;
    }

    @Override
    public void draw()
    {
        System.out.print("Triangle " + this.getName());
    }

    @Override
    public double calcCirc()
    {
        return a + b + c;
    }

}

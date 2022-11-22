package mlcheksempelcomp;
public class Rectangle extends Figure
{
    private double l, h;

    public Rectangle(String name, double l, double h)
    {
        super(name);
        this.l = l;
        this.h = h;
    }

    public double getL()
    {
        return l;
    }

    public double getH()
    {
        return h;
    }

    @Override
    public void draw()
    {
        System.out.print("Rectangle " + this.getName());
    }

    @Override
    public double calcCirc()
    {
        return 2 * l + 2 * h;
    }

}

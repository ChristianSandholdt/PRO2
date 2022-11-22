package mlcheksempelcomp;

public abstract class Figure
{
    private String name;

    public Figure(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public abstract void draw();

    public abstract double calcCirc();

}

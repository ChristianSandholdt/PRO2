package OpgaveComposite;

public abstract class ShapesComponent {

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getName();
    }

    public String draw(){
        return toString();
    }

}

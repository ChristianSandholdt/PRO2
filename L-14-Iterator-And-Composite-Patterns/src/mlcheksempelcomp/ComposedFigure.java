package mlcheksempelcomp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

public class ComposedFigure extends Figure implements Iterable<Figure>
{
    private List<Figure> figures = new ArrayList<Figure>();

    public ComposedFigure(String navn)
    {
        super(navn);
    }

    @Override
    public void draw()
    {
        System.out.print("Composite " + this.getName() + " (");
        for (Figure f : figures) {
            f.draw();
            System.out.print(", ");
        }
        System.out.print(")");
    }

    @Override
    public double calcCirc()
    {
        double sum = 0;
        for (Figure f : figures) {
            sum += f.calcCirc();
        }
        return sum;
    }

    //-------------------------------------------------------------------------

    public void add(Figure f)
    {
        figures.add(f);
    }

    public void remove(Figure f)
    {
        figures.remove(f);
    }

    //-------------------------------------------------------------------------

    @Override
    public Iterator<Figure> iterator()
    {
        return new ComposedFigureIterator();
    }

    private class ComposedFigureIterator implements Iterator<Figure>
    {
        private Stack<Iterator<Figure>> stack = new Stack<Iterator<Figure>>();

        public ComposedFigureIterator()
        {
            stack.push(figures.iterator());
        }

        @Override
        public boolean hasNext()
        {
            if (stack.isEmpty()) {
                return false;
            }
            else {
                Iterator<Figure> it = stack.peek();
                if (it.hasNext()) {
                    return true;
                }
                else {
                    stack.pop();
                    return this.hasNext();
                }
            }
        }

        @Override
        public Figure next()
        {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }

            Iterator<Figure> it = stack.peek();
            Figure f = it.next();
            if (f instanceof ComposedFigure) {
                ComposedFigure cf = (ComposedFigure) f;
                stack.push(cf.iterator());
            }
            return f;
        }

        @Override
        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }
}

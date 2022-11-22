package mlcheksempelcomp;

import java.util.Iterator;

public class Ex2App {

    public static void main(String[] args) {
        ComposedFigure drawing = new ComposedFigure("Drawing");

        drawing.add(new Ellipse("E1", 20, 10));
        drawing.add(new Triangle("T1", 3, 4, 5));

        ComposedFigure part = new ComposedFigure("Part");
        part.add(new Ellipse("E2", 10, 10));
        part.add(new Rectangle("R2", 40, 20));
        part.add(new Triangle("T2", 6, 8, 10));
        drawing.add(part);

        drawing.add(new Rectangle("R1", 20, 30));

        System.out.println("Drawing all figures:");
        drawing.draw();
        System.out.println();
        System.out.println();

        System.out.printf("Total circumference: %.2f\n", drawing.calcCirc());
        System.out.println();

        System.out.printf("%s has a circumference of %.2f\n", part.getName(), part.calcCirc());
        System.out.println();

        int count = 0;
        String names = "";
        Iterator<Figure> it = drawing.iterator();
        while (it.hasNext()) {
            Figure f = it.next();
            count++;
            names += f.getName() + ", ";
        }

//        int count = 0;
//        String names = "";
//        for (Figure f : drawing) {
//            count++;
//            names += f.getName() + ", ";
//        }

        System.out.println("Count of figures in " + drawing.getName() + ": " + count);
        System.out.println("Names in " + drawing.getName() + ": " + names);
        System.out.println();
    }
}

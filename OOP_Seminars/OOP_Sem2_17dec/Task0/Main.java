package OOP_Seminars.OOP_Sem2_17dec.Task0;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new SquareShape(10));
        shapes.add(new SquareShape(1));
        shapes.add(new CircleShape(10));

        for (Shape shape : shapes) {
            System.out.printf("%s area = %f, perimeter = %f\n", shape, shape.getArea(), shape.getPerimeter());
        }



    }
    
}

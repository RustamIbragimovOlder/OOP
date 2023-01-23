package OOP_Seminars.OOP_Sem7_20jan.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Iterable<Shape> shapes = Arrays.asList (
            new SquareShape (1),
            new CircleShape (1)
        );
        for (Shape shape : shapes)
            System.out.println(shape.getArea ());
    }
    
}

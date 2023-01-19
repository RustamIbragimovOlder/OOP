package ocp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Iterable<Shape> shapes = Arrays.asList(
            new SquareShape (),
            new CircleShape (),
            new TriangleShape(),
            new SquareShapeVar2('$'),
            new SquareShapeVar2('*'),
            new CircleShape (),
            new SquareShape ()
        );

        for (Shape shape : shapes)
            shape.draw ();
    }
}
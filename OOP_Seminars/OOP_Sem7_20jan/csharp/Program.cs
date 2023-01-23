interface Shape {
    float Area { get; }
}

class SquareShape : Shape {
    private float side;

    public SquareShape (float side) {
        this.side = side;
    }

    public float Area {
        get => side * side;
    }
}

class CircleShape : Shape {
    private float radius;

    public CircleShape (float radius) {
        this.radius = radius;
    }

    public float Area {
        get => (float) Math.PI * radius * radius;
    }
}

class Program {
    public static void Main () {
        IEnumerable<Shape> shapes = new Shape[] {
            new SquareShape (1),
            new CircleShape (1)
        };

        foreach (Shape shape in shapes)
            System.Console.WriteLine(shape.Area);
    }
}


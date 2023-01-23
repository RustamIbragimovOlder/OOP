
class Shape {
    getArea () { throw new Error ("You must implement getArea()"); }
}

class SquareShape extends Shape {
    constructor (side) {
        super ();
        this.side = side;
    }

    getArea () { return this.side * this.side; }
}

class CircleShape extends Shape {
    constructor (radius) {
        super ();
        this.radius = radius;
    }

    getArea () { return Math.PI * this.radius * this.radius; }
}

shapes = [new SquareShape (1), new CircleShape (1)]

for (const shape of shapes)
    console.log (shape.getArea ())

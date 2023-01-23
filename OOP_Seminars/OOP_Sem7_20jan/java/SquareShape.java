package OOP_Seminars.OOP_Sem7_20jan.java;

class SquareShape implements Shape {
    float side;

    public SquareShape (float side) {
        this.side = side;
    }

    @Override
    public float getArea () { return side * side; }
}

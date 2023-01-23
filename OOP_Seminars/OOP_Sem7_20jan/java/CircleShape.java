package OOP_Seminars.OOP_Sem7_20jan.java;

class CircleShape implements Shape {
    float radius;

    public CircleShape(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }
}

package OOP_Seminars.OOP_Sem2_17dec.Task0;

public class CircleShape extends Shape {

    private float radius;
    
    public CircleShape(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public float getPerimeter() {
        return 2 * (float) Math.PI * radius;
    }

    @Override
    public String toString() {
        return "CircleShape [radius=" + radius + "]";
    }

   
    
}

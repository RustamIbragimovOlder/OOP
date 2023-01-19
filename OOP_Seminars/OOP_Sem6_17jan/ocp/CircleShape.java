package ocp;

public class CircleShape implements Shape {
    @Override
    public void draw() {
        System.out.println(" # ");
        System.out.println("###");
        System.out.println(" # ");
        System.out.println();
    }
}
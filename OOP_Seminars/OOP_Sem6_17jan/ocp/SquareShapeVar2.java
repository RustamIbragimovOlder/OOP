package ocp;

public class SquareShapeVar2 implements Shape {

    private char color;

    public SquareShapeVar2(char color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("%c%c%c\n", color, color, color);
        System.out.printf("%c%c%c\n", color, color, color);
        System.out.printf("%c%c%c\n", color, color, color);
        System.out.println();
        
    }

    
    
}

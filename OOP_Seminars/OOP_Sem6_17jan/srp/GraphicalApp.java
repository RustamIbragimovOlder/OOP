package srp;

public class GraphicalApp {
    public static void main(String[] args) {
        DrawRectangle drawRectangle = new DrawRectangle(new CalcRectangle(3, 3));
        drawRectangle.draw();
        
    }
}


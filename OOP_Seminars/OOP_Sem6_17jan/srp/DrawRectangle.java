package srp;

public class DrawRectangle {

    private CalcRectangle rectangle;

    public DrawRectangle(CalcRectangle rectangle) {
        this.rectangle = rectangle;
    }

    // графическая задача
    public void draw() {
        GraphicsLibrary.drawRectangle(0, 0, rectangle.getWidth(), rectangle.getHeight(), '#');
    }

}

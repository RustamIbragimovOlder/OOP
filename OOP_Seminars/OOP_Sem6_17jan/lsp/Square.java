package lsp;

public class Square implements Shape {

    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public void setWidth(float width) {
        this.side = width;
        // this.height = width;  // квадрат должен оставаться квадратом
    }

    @Override
    public void setHeight(float height) {
        this.side = height;
        // this.height = height;  // квадрат должен оставаться квадратом
    }

    public float getWidth() {
        return side;
    }

    public float getHeight() {
        return side;
    }

    @Override
    public float getArea () {
        return side * side;
    }



}
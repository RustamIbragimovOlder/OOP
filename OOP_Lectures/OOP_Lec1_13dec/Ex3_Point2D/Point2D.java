package OOP_Lectures.OOP_Lec1_13dec.Ex3_Point2D;

/** 
 * Это точка 2D
*/
public class Point2D {
    private int x, y; // Это координата х и у

    /**
     * Это конструктор ...
     * @param valueX это координата Х
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }
    public Point2D() {
        this(0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    
    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    
    private String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }
    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    // ctor
    // get; set;
    // docs
    //
}
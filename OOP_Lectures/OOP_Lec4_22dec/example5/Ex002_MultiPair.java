
public class Ex002_MultiPair {
    public static void main(String[] args) {
        MultiPair<Integer, String> mp1 = new MultiPair<>(123, "str");
        System.out.println(mp1);

        var mp2 = new MultiPair<>(true, false);
        System.out.println(mp2);

    }
}

class MultiPair<X, Y> {
    X x;
    Y y;

    public MultiPair(X arg1, Y arg2) {
        x = arg1;
        y = arg2;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x.toString() + " " + y.toString();
    }
}

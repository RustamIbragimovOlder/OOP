public class Ex001_Pair {
    public static void main(String[] args) {

        System.out.println("+");
        String s1 = "123";
        String s2 = "qwe";
        Pair<String> pair = new Pair<String>(s1, s2);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.swap();

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}

class Pair<T> {

    T first;
    T second;

    public Pair(T t1, T t2) {
        this.first = t1;
        this.second = t2;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }
}

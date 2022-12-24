package OOP_Lectures.OOP_Lec4_22dec.example2;

public class MultiParameterized<E1, E2, E3> {

    public E1 value1;
    public E2 value2;
    public E3 value3;
    public MultiParameterized(E1 e1,E2 e2, E3 e3) {
        this.value1 = e1;
        this.value2 = e2;
        this.value3 = e3;
    }
    @Override
    public String toString() {
        return String.format("E1 type: %s  E2 type: %s  E3 type: %s  ", 
        value1.getClass().getSimpleName(),
        value2.getClass().getSimpleName(),
        value3.getClass().getSimpleName()
        );
    }
}

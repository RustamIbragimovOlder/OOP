package OOP_Lectures.OOP_Lec4_22dec.example4.V1;

public abstract class Content {
    public String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

package OOP_Lectures.OOP_Lec3_20dec.example2.ExBeverage;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}

package OOP_Lectures.OOP_Lec3_20dec.example4.ExBeverage;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage 
            implements Iterable<Ingredient> {
    public List<Ingredient> components;
    int index;
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){
        components.add(component);
    }

}
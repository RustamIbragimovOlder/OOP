package OOP_Lectures.OOP_Lec3_20dec.example2.ExBeverage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Beverage implements Iterator<Ingredient> {
    List<Ingredient> components;
    int index;
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){
        components.add(component);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }
    
    @Override
    public Ingredient next() {
        return components.get(index++);
    }
}
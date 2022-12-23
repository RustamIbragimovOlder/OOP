package OOP_Lectures.OOP_Lec3_20dec.example7;

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

    public void addComponent(Ingredient component) {

        if (!(components.indexOf(component) != -1))
            components.add(component);
    }

}
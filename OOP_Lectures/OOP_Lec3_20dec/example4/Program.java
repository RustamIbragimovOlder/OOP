package OOP_Lectures.OOP_Lec3_20dec.example4;

import OOP_Lectures.OOP_Lec3_20dec.example4.ExBeverage.*;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}

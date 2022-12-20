package OOP_Lectures.OOP_Lec2_16dec.Example4;

public class Dwarf extends Druid {
    
    public Dwarf(String name, int hp) {
        super();
        System.out.println("Вызван Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("", 0);
        System.out.println("Вызван Dwarf()");
    }
   
}
package OOP_Lectures.OOP_Lec2_16dec.Example4;

public class Program {
    public static void main(String[] args) {
        // Иерархия вызова конструкторов
        System.out.println("\nDwarf dw1 = new Dwarf()");
        Dwarf dw1 = new Dwarf();

        System.out.println("\nDruid dw2 = new Dwarf();");
        Druid dw2 = new Dwarf();

        System.out.println("\nBaseHero dw3 = new Dwarf();");
        BaseHero dw3 = new Dwarf();
    }    
}
package OOP_Lectures.OOP_Lec1_13dec.Ex6_Mag_Priest_2;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());
        
        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

        hero3.GetDamage(hero2.Attack());
        hero3.GetDamage(hero3.Attack());
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());
        //hero3.GetDamage(hero3.Attack());
    }
}
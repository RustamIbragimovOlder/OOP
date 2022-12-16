package OOP_Lectures.OOP_Lec1_13dec.Ex5_Mag_Priest_1;

import java.util.Random;

public class Priest { // жрец
    private static final String HERO_PRIEST_D = "Hero_Priest #%d";
    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int elixir;
    private int maxElixir;

    static {
        Priest.number = 0;
        Priest.r = new Random();
    }

    public Priest(String name, int hp, int elixir) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.elixir = elixir;
        this.maxElixir = elixir;
    }

    public Priest() {
        this(String.format(HERO_PRIEST_D, ++Priest.number),
        Priest.r.nextInt(100, 200),
        Priest.r.nextInt(50, 150));
    }

    public int Attack() {
        int damage = Priest.r.nextInt(20, 30);
        this.elixir -= (int)(damage * 0.8);
        if (elixir < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d Elixir:  %d Type: %s",
                this.name, this.hp, this.elixir, this.getClass().getSimpleName());
    }
    
    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}

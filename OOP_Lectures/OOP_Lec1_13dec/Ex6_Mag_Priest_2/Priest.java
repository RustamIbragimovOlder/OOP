package OOP_Lectures.OOP_Lec1_13dec.Ex6_Mag_Priest_2;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxElixir = Magician.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.elixir -= (int) (damage * 0.8);
        if (elixir < 0)
            return 0;
        else
            return damage;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}

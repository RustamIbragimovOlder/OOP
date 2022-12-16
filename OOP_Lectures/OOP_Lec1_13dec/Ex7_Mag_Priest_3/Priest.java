package OOP_Lectures.OOP_Lec1_13dec.Ex7_Mag_Priest_3;
 
public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxElixir = Magician.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}

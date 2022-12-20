// название, повреждение, скорострельность,
// количество зарядов в обойме, звук при выстреле

package OOP_Seminars.OOP_Sem2_17dec.Task1;

public abstract class Weapon {

    public abstract String getName(); // название
    public abstract float getDamage(); // повреждение
    public abstract float getRateFire(); // скорострельность
    public abstract int getNumberChargesInClip(); // количество зарядов в обойме
    public abstract String getSoundWhenShot(); // звук при выстреле


    
}

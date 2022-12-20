package OOP_Seminars.OOP_Sem2_17dec.Task1;

public class GunWeapon extends Weapon {
    
    @Override
    public String getName() {
        return "Eagle";
    }

    @Override
    public float getDamage() {
        return 10.0f;
    }

    @Override
    public int getNumberChargesInClip() {
        return 8;
    }

    @Override
    public float getRateFire() {
        return 20.0f;
    }

    @Override
    public String getSoundWhenShot() {
        return "puff";
    }

    @Override
    public String toString() {
        return "GunWeapon []";
    }

    
    
}

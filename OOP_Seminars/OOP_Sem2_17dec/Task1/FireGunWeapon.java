package OOP_Seminars.OOP_Sem2_17dec.Task1;

public class FireGunWeapon extends Weapon {

    @Override
    public String getName() {
        return "Fire Gun";
    }

    @Override
    public float getDamage() {
        return 75.0f;
    }


    @Override
    public int getNumberChargesInClip() {
        return 1;
    }

    @Override
    public float getRateFire() {
        return 6.0f;
    }

    @Override
    public String getSoundWhenShot() {
        return "fire sound";
    }

    @Override
    public String toString() {
        return "FireGunWeapon []";
    }



    
    
}

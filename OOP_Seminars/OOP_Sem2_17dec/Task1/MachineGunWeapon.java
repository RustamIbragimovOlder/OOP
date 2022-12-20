package OOP_Seminars.OOP_Sem2_17dec.Task1;

public class MachineGunWeapon extends Weapon {

    @Override
    public String getName() {
        return "AK74";
    }

    @Override
    public float getDamage() {
        return 50.0f;
    }


    @Override
    public int getNumberChargesInClip() {
        return 30;
    }

    @Override
    public float getRateFire() {
        return 150.0f;
    }

    @Override
    public String getSoundWhenShot() {
        return "bang-bang";
    }

    @Override
    public String toString() {
        return "MachineGunWeapon []";
    }

    
    
}

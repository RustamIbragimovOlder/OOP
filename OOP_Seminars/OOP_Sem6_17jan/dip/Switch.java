package dip;

public class Switch {
    
    private ElectricalAppliances device;

    public Switch(ElectricalAppliances device) {
        this.device = device;
    }

    public void toggle () {
        if (device.getIsOn())
            device.turnOff ();
        else
            device.turnOn ();
    }
}


package OOP_PracticalTasks.OOP_PT4_27dec;

public class BeginsWithA extends Module<String> {

    @Override
    public boolean isGood(String item) {
        return item.startsWith("J");
    }
    
}

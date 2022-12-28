package OOP_PracticalTasks.OOP_PT4_27dec;

public class IsEven extends Module<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }
}

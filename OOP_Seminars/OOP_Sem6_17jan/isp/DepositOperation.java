package isp;

public class DepositOperation {
    private DepositUI depositUI;

    public DepositOperation(DepositUI depositUI) {
        this.depositUI = depositUI;
    }

    public void execute () {
        int amount = depositUI.getDepositSum();
        // ...
        System.out.println("Деньги зачислены на счёт");
    }
}
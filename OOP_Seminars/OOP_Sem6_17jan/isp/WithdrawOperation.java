package isp;

public class WithdrawOperation {
    private WithdrawUI withdrawUI;

    public WithdrawOperation(WithdrawUI withdrawUI) {
        this.withdrawUI = withdrawUI;
    }

    public void execute () {
        int amount = withdrawUI.getWithdrawSum();
        // ...
        System.out.println("Заберите деньги");
    }
}
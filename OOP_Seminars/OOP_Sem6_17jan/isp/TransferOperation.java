package isp;

public class TransferOperation {
    private TransferUI transferUI;

    public TransferOperation(TransferUI transferUI) {
        this.transferUI = transferUI;
    }

    public void execute () {
        int amount = transferUI.getTransferSum();
        String targetClient = transferUI.getTransferTarget();
        // ...
        System.out.println("Деньги переведены!");
    }
}
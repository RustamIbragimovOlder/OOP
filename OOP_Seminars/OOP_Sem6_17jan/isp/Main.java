package isp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DepositOperation dop = new DepositOperation(new ConsoleUI(new Scanner(System.in)));
        dop.execute();
        TransferOperation top = new TransferOperation(new ConsoleUI(new Scanner(System.in)));
        top.execute();
        WithdrawOperation wop = new WithdrawOperation(new ConsoleUI(new Scanner(System.in)));
        wop.execute();
    }
    
}

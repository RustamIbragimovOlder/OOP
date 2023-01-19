package isp;

import java.util.Scanner;

public class ConsoleUI implements UI {
    private Scanner scanner;

    public ConsoleUI(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int getWithdrawSum() {
        System.out.print("Сколько снять? ");
        return scanner.nextInt();
    }

    @Override
    public int getDepositSum() {
        System.out.print("Сколько положить? ");
        return scanner.nextInt();
    }

    @Override
    public int getTransferSum() {
        System.out.print("Сколько перевести? ");
        return scanner.nextInt();
    }

    @Override
    public String getTransferTarget() {
        System.out.print("Кому перевести? Введите ФИО: ");
        return scanner.nextLine();
    }
}
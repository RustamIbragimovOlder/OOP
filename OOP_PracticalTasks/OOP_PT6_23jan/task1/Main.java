// Чтобы разблокировать телефон, пользователь может выбрать один из способов:
// • Без пароля
// • С пин-кодом (4-значное число)
// • По отпечатку пальца (кодируется строкой)
// • По распознаванию лица (кодируется строкой)
// Программист написал класс Unlocker, в котором хранятся поля от всех способов сразу:
// class Unlocker {
// private int mode; // режим
// private int pin; // на случай пин-кода
// private String fingerprint; // на случай отпечатка пальца
// private String faceID; // на случай лица
// }
// Здесь нарушен принцип SRP: класс имеет несколько незаивисимых причин меняться.
// Напишите решение, которое будет соответствовать SRP и OCP
// (мы хотим в будущем добавлять новые способы разблокировки).

package OOP_PracticalTasks.OOP_PT6_23jan.task1;

public class Main {
    public static void main(String[] args) {

        NoPassword noPassword = new NoPassword("любая клавиша");
        PinCode pinCode = new PinCode(0000);
        FingerPrint fingerPrint = new FingerPrint("палец");
        FaceID faceID = new FaceID("лицо");

        System.out.println("Разблокировка телефона без пароля:");
        noPassword.unlock();
        System.out.println();

        System.out.println("Разблокировка телефона через пин-код:");
        pinCode.unlock();
        System.out.println();

        System.out.println("Разблокировка телефона по отпечатку пальца:");
        fingerPrint.unlock();
        System.out.println();

        System.out.println("Разблокировка телефона по лицу:");
        faceID.unlock();
        System.out.println();

    }

}

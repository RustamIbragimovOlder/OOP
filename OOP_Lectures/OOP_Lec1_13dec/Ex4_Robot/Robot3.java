package OOP_Lectures.OOP_Lec1_13dec.Ex4_Robot;

import java.util.ArrayList;

public class Robot3 {

    enum State {
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    /** Уровень робота */
    private int level;

    /** Имя робота */
    private String name;

    private State state;

    /**
     * Создание робота
     * 
     * @param name  Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    private Robot3(String name, int level) {
        System.out.println(Character.isDigit(name.charAt(0)));
        if ((name.isEmpty()
                || Character.isDigit(name.charAt(0)))
                || Robot3.names.indexOf(name) != -1)

        {
            this.name =
             String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }

        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;

    }

    // #region другие конструкторы

    // public Robot3(String name)
    // {
    // if ((name.isEmpty()
    // || Character.isDigit(name.charAt(0)))
    // || Robot3.names.indexOf(name) == -1)

    // { this.name = String.format("DefaultName_%d", defaultIndex++); }
    // else { this.name = name; }

    // Robot3.names.add(this.name);
    // this.level = 1;
    // this.state = State.Off;
    // }

    // public Robot3()
    // {
    // this.name = String.format("DefaultName_%d", defaultIndex++);
    // Robot3.names.add(this.name);
    // this.level = 1;
    // this.state = State.Off;
    // }

    // #endregion

    // #region правильные конструкторы

    public Robot3(String name) {
        this(name, 1);
    }

    public Robot3() {
        this("");
    }

    // #endregion

    // Методы вкл\выкл подсистем

    public void power() {
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    /** Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /** Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /** Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /** Работа */
    public void work() {
        if (this.state == State.On) {
            System.out.println("Working...");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }
}

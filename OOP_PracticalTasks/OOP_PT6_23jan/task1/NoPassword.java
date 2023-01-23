package OOP_PracticalTasks.OOP_PT6_23jan.task1;

public class NoPassword implements UnlockMethod {

    private String nopassword;

    public NoPassword(String nopassword) {
        this.nopassword = nopassword;
    }

    public String getNopassword() {
        return nopassword;
    }

    @Override
    public void unlock() {
        System.out.println("Нажмите любую клавишу...");
        System.out.println("Телефон разблокирован");
    }

}


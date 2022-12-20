package OOP_Seminars.OOP_Sem2_17dec.task2;

public class DisignerEmployee extends Employee {

    @Override
    public String getJobTitle() {
        return "Disigner";
    }

    @Override
    public int getSalary() {
        return 75_000;
    }

    @Override
    public void work() {
        System.out.println("Designer draws a new interior");
        System.out.println("Я дизайнер. Я тоже работаю.");
    }

}

package OOP_Seminars.OOP_Sem2_17dec.task2;

public class ProgrammerEmployee extends Employee {

    @Override
    public String getJobTitle() {
        return "Programmer";
    }

    @Override
    public int getSalary() {
        return 100_000;
    }

    @Override
    public void work() {
        System.out.println("The programmer writes the code");
        System.out.println("Я программист. Я работаю.");        
    }
 
}

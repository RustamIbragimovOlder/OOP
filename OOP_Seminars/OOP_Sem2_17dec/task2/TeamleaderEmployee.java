package OOP_Seminars.OOP_Sem2_17dec.task2;

import java.util.ArrayList;
import java.util.List;

public class TeamleaderEmployee extends Employee {

    private List<Employee> employees = new ArrayList<>();

    public TeamleaderEmployee(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String getJobTitle() {
        return "Teamleader";
    }

    @Override
    public int getSalary() {
        return 150_000;
    }

    @Override
    public void work() {
        System.out.println("Makes his subordinates work");
        System.out.println("Меня заставили работать и я всех заставлю работать");
        for (Employee employee : employees) {
            employee.work();
        }
    }

    @Override
    public String toString() {
        return "TeamleaderEmployee [employees=" + employees + "]";
    }
    
    
    
}

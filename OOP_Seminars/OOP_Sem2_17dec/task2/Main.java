// Создайте базовый класс Наёмный работник (Employee).
// У работника есть методы: должность, зарплата и функция работать
// (он печатает что-то вроде «Программист пишет код»).
// Создайте унаследованные классы работников: Программист, Дизайнер.
// Переопределите их методы.
// Создайте Фирму — коллекцию работников. Заставьте всех работников работать.
// Создайте новый вид работника — Руководитель.
// У руководителя есть коллекция его подчинённых.
// Когда вы заставляете Руководителя работать, он заставляет работать своих подчинённых.
// Добавьте Руководителя в фирму и проверьте, что всё работает.

package OOP_Seminars.OOP_Sem2_17dec.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        TeamleaderEmployee boss = new TeamleaderEmployee(employees);
        employees.add(new ProgrammerEmployee());
        employees.add(new DisignerEmployee());

        // for (Employee employee : employees) {
        //     employee.work();            
        // }

        boss.work();
        
    }
    
}

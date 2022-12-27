// 1. Класс Группа содержит в себе коллекцию Студентов.
// По группе можно перемещаться с помощью итератора.
// (Это повторяет 1-ю задачу из классной работы).
// Остальные задачи надстраиваются поверх неё.
// 2. Создайте класс GroupListIterator,
// который позволяет перемещаться по группе в обоих направлениях.
// Он реализует интерфейс ListIterator<Student>.
// Добавьте в Группу метод listIterator (),
// который позволяет начать итерацию с помощью GroupListIterator.
// 3. Создайте класс ReverseIterator,
// который работает как итератор по группе в обратном направлении:
// • Он отслеживает текущую позицию в переборе
// • Он изначально выставлен на конечную позицию
// • Он движется справа налево
// Проверьте, как он работает.

package OOP_PracticalTasks.OOP_PT3_26dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {
    public static void main(String[] args) {

    List<Student> list = new ArrayList<>(Arrays.asList(
        new Student(100, "Иванов Иван", "11.01.2001", 4.5f), 
        new Student(101, "Сидорова Мария", "12.02.2002", 4.7f), 
        new Student(102, "Семенова Анна", "13.03.2003", 4.9f), 
        new Student(103, "Кузнецов Александр", "14.04.2004", 4.2f), 
        new Student(104, "Петров Петр", "15.05.2005", 3.8f)));

        StudentGroup studentGroup = new StudentGroup(list);
        
        // for (Student student : studentGroup) {
        //     System.out.println(student);
            
        // }

        System.out.println("------------");
        System.out.println("Проверка работы StudentGroupIterator => ");
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------");
        System.out.println("Проверка работы GroupListIterator => ");
        System.out.println("В одну сторону => ");
        Iterator<Student> listIteratorPrevious = studentGroup.listIterator(2);
        while (((ListIterator<Student>) listIteratorPrevious).hasPrevious()) {
            System.out.println(((ListIterator<Student>) listIteratorPrevious).previous());
        }
        System.out.println("В другую сторону => ");
        Iterator<Student> listIteratorNext = studentGroup.listIterator(2);
        while (((ListIterator<Student>) listIteratorNext).hasNext()) {
            System.out.println(((ListIterator<Student>) listIteratorNext).next());
        }

        System.out.println("------------");
        System.out.println("Проверка работы ReverseIterator => ");
        Iterator<Student> reverseIterator = studentGroup.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

    }

}
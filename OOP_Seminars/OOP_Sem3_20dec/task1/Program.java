// 1. Создайте класс Student. У студента есть имя, дата рождения и средний балл.
// Переопределите функцию toString ( ).
// 2. Создайте класс StudentGroup. Она содержит коллекцию студентов.
// 3. Для коллекции StudentGroup создайте парный класс итератора: StudentGroupIterator.
// Он реализует интерфейс Iterator<Student>. Он отслеживает текущую позицию в итерации.
// 4. Класс StudentGroup реализует интерфейс Iterable<Student>.
// Это позволяет начать итерацию по группе.


package OOP_Seminars.OOP_Sem3_20dec.task1;

import java.util.Arrays;
// import java.util.Iterator;

public class Program {
    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup(Arrays.asList(
            new Student("Иванов", "12.04.2000", 4.5f), 
            new Student("Сидорова", "26.11.1999", 4.7f),
            new Student("Петров", "02.01.2001", 3.8f)));
        
        // StudentGroupIterator studentIt = new StudentGroupIterator(studentGroup);

        // Iterator<Student> studentIt = studentGroup.iterator();

        // while (studentIt.hasNext()) {
        //     System.out.println(studentIt.next());
        // }
        

        for (Student student : studentGroup) {
            System.out.println(student);
            
        }


    }
    
}

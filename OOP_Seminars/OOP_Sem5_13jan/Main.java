// 1. Создайте три класса в пакете data: User, Teacher, Student.
// User содержит поля, общие для студента и преподавателя.
// Student и Teacher добавляют поля, специфичные для этих классов.
// Из соображений времени не делайте класс Teacher и связанные с ним классы.
// Создайте два класса в пакете util: DataWriter и DataReader.
// Они позволяют сохранить в файл коллекцию студентов и преподавателей,
// а также загрузить их из файлов.
// Создайте в пакете service: интерфейс DataService и два детских класса: StudentService и TeacherService.
// Сервис скрывает в себе коллекцию объектов.
// Интерфейс содержит операции:
// добавить нового студента или учителя;
// сохранить всех в файл;
// загрузить всех из файла.

// 2. Создайте класс StudentView, который позволяет распечатать студентов из объекта StudentService.
// Какие архитектурные изменения стоит внести, если вы подозреваете,
// что в будущем предстоит добавить аналогичный класс TeacherView?

// 3. Создайте класс StudentController. Он позволяет пользователю выбирать следующие команды:
// Загрузить список студентов из файла;
// Добавить нового студента;
// Распечатать текущий список студентов;
// Сохранить студентов в файл;
// Сделайте так, чтобы загрузка студентов происходила автоматически при старте программы.
// Сделайте так, чтобы сохранение студентов происходило автоматически перед выходом из программы.
// Какие изменения надо внести в архитектуру, если вы ожидаете,
// что впоследствии нужно будет написать класс TeacherController?

// 4. Напишите аналогичные классы TeacherService и TeacherController.

package OOP_Seminars.OOP_Sem5_13jan;

import static OOP_Seminars.OOP_Sem5_13jan.model.util.DataWriter.dataWrite;

import java.util.Arrays;
import java.util.List;
import OOP_Seminars.OOP_Sem5_13jan.model.data.Student;
import OOP_Seminars.OOP_Sem5_13jan.model.service.StudentService;
import OOP_Seminars.OOP_Sem5_13jan.view.StudentView;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Иван", "Иванов", "ГБ", "Разработчик", 1),
            new Student("Степан", "Степанов", "ГБ", "Разработчик", 3),
            new Student("Петр", "Петров", "ГБ", "Разработчик", 2));

            dataWrite(students);

            StudentService studentService = new StudentService(students);
            new StudentView().printStudents(studentService);
        
        
    }
    
}

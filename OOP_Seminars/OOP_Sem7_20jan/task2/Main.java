// 1. Создайте три класса в пакете data: User, Teacher, Student.
// User содержит поля, общие для студента и преподавателя.
// Student и Teacher добавляют поля, специфичные для этих классов.
// Из соображений времени не делайте класс Teacher и связанные с ним классы.
// Создайте два класса в пакете util: DataWriter и DataReader.
// Они позволяют сохранить в файл коллекцию студентов и преподавателей,
// а также загрузить их из файлов.
// Создайте в пакете service: интерфейс DataService и два детских класса:
// StudentService и TeacherService.
// Сервис скрывает в себе коллекцию объектов.
// Интерфейс содержит операции:
// добавить нового студента или учителя;
// сохранить всех в файл;
// загрузить всех из файла.

// 2. Создайте класс StudentView,
// который позволяет распечатать студентов из объекта StudentService.
// Какие архитектурные изменения стоит внести, если вы подозреваете,
// что в будущем предстоит добавить аналогичный класс TeacherView?

// 3. Создайте класс StudentController.
// Он позволяет пользователю выбирать следующие команды:
// Загрузить список студентов из файла;
// Добавить нового студента;
// Распечатать текущий список студентов;
// Сохранить студентов в файл;
// Сделайте так, чтобы загрузка студентов происходила автоматически при старте программы.
// Сделайте так, чтобы сохранение студентов происходило автоматически перед выходом из программы.
// Какие изменения надо внести в архитектуру, если вы ожидаете,
// что впоследствии нужно будет написать класс TeacherController?

// 4. Напишите аналогичные классы TeacherService и TeacherController.

package OOP_Seminars.OOP_Sem7_20jan.task2;

// import java.util.Arrays;
// import java.util.List;
import OOP_Seminars.OOP_Sem7_20jan.task2.controller.StudentController;
// import OOP_Seminars.OOP_Sem7_20jan.task2.model.data.Student;
import OOP_Seminars.OOP_Sem7_20jan.task2.model.service.StudentService;
import OOP_Seminars.OOP_Sem7_20jan.task2.view.StudentView;

public class Main {
    public static void main(String[] args) {


        // StudentService studentService = new StudentService();
        // studentService.addUser(new Student("Ivan", "Ivanov", 25, 1, 3.5f));
        // studentService.addUser(new Student("Petr", "Petrov", 35, 2, 4.0f));
        // studentService.addUser(new Student("Sidor", "Sidorov", 45, 3, 4.5f));
         
        // studentService.save();
        
        // studentService.load();
        
        // new StudentView(studentService).showUsers();


        StudentService model = new StudentService();
        StudentController studentController = new StudentController(model, new StudentView(model));

        studentController.showMenu();



    }

}

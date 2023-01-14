package OOP_Seminars.OOP_Sem5_13jan.view;

// import java.util.List;

import OOP_Seminars.OOP_Sem5_13jan.model.data.Student;
import OOP_Seminars.OOP_Sem5_13jan.model.service.StudentService;

public class StudentView {

    public void printStudents(StudentService students) {
        for (Student student : students.getStudents()) {
            System.out.println(student);
        }
    }
    
}

package OOP_Seminars.OOP_Sem5_13jan.model.service;

import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.List;
import OOP_Seminars.OOP_Sem5_13jan.model.data.Student;
import OOP_Seminars.OOP_Sem5_13jan.model.util.DataReader;
import OOP_Seminars.OOP_Sem5_13jan.model.util.DataWriter;

public class StudentService implements DataService<Student> {

    private List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    @Override
    public void addUser(Student student) {
        students.add(student);
        
    }

    @Override
    public void loadUsers(String path) {
        students = DataReader.dataRead(path);
        
    }

    @Override
    public void saveUsers(String path) {
        DataWriter.dataWrite(students);
        
    }

    public List<Student> getStudents() {
        List<Student> copy = new ArrayList<>();
        for (Student student : students) {
            copy.add(student);
            
        }
        return copy;
    }

    
    
}

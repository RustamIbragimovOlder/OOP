package OOP_Seminars.OOP_Sem7_20jan.task2.model.service;

import java.util.ArrayList;
import java.util.List;
import OOP_Seminars.OOP_Sem7_20jan.task2.model.data.Student;
import OOP_Seminars.OOP_Sem7_20jan.task2.model.util.DataReader;
import OOP_Seminars.OOP_Sem7_20jan.task2.model.util.DataWriter;

public class StudentService implements DataService<Student> {

    private final String path = "studentDB.txt";

    private List<Student> students = new ArrayList<>();

    public List<Student> getUsers() {
        return new ArrayList<>(students);
    }

    @Override
    public void addUser(Student student) {
        students.add(student);
    }

    @Override
    public void save() {
        DataWriter.dataWrite(students);
    }

    @Override
    public void load() {
        students = DataReader.dataRead(path);
    }
}

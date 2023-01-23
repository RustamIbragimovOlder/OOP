package OOP_Seminars.OOP_Sem7_20jan.task2.model.service;

import java.util.ArrayList;
import java.util.List;
import OOP_Seminars.OOP_Sem7_20jan.task2.model.data.Teacher;
// import OOP_Seminars.OOP_Sem7_20jan.task2.model.util.DataReader;
import OOP_Seminars.OOP_Sem7_20jan.task2.model.util.DataWriter;

public class TeacherService implements DataService<Teacher> {

    // private final String path = "teacherDB.txt";

    private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getUsers() {
        return new ArrayList<>(teachers);
    }

    @Override
    public void addUser(Teacher teacher) {
        teachers.add(teacher);
        
    }

    @Override
    public void save() {
        DataWriter.dataWrite(teachers);
    }

    @Override
    public void load() {
        // teachers = DataReader.dataRead(path);
    }


}



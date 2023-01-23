package OOP_Seminars.OOP_Sem5_13jan.model.service;

import java.util.ArrayList;
import java.util.List;

import OOP_Seminars.OOP_Sem5_13jan.model.data.Teacher;
// import OOP_Seminars.OOP_Sem5_13jan.model.util.DataReader;
import OOP_Seminars.OOP_Sem5_13jan.model.util.DataWriter;

public class TeacherService implements DataService<Teacher> {

    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public void addUser(Teacher teacher) {
        teachers.add(teacher);
        
    }

    @Override
    public void loadUsers(String path) {
        // teachers = DataReader.dataRead("teacher.txt");
        
    }

    @Override
    public void saveUsers(String path) {
        DataWriter.dataWrite(teachers);
        
    }

    public Teacher[] getTeachers() {
        return null;
    }

    

    
    
}

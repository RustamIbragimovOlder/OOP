package OOP_Seminars.OOP_Sem7_20jan.task2.view;

import OOP_Seminars.OOP_Sem7_20jan.task2.model.data.Student;
import OOP_Seminars.OOP_Sem7_20jan.task2.model.service.DataService;

public class StudentView extends UserView<Student> {

    public StudentView(DataService<Student> model) {
        super(model);
    }

    @Override
    public void showUsers() {
        // TODO Auto-generated method stub
        super.showUsers();
    }

    
}
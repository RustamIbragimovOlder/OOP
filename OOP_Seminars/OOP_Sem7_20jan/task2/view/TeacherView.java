package OOP_Seminars.OOP_Sem7_20jan.task2.view;

import OOP_Seminars.OOP_Sem7_20jan.task2.model.data.Teacher;
import OOP_Seminars.OOP_Sem7_20jan.task2.model.service.DataService;

public class TeacherView extends UserView<Teacher> {

    public TeacherView(DataService<Teacher> model) {
        super(model);
    }
}
    

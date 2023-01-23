package OOP_Seminars.OOP_Sem7_20jan.task2.view;

import OOP_Seminars.OOP_Sem7_20jan.task2.model.data.User;
import OOP_Seminars.OOP_Sem7_20jan.task2.model.service.DataService;

public abstract class UserView<U extends User> {
    private DataService<U> model;

    public UserView(DataService<U> model) {
        this.model = model;
    }

    public void showUsers() {
        for (U user : model.getUsers()) {
            System.out.println(user);
        }
    }
}

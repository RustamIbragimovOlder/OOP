package OOP_PracticalTasks.OOP_PT7_final_project.view;

import OOP_PracticalTasks.OOP_PT7_final_project.model.data.User;
import OOP_PracticalTasks.OOP_PT7_final_project.model.service.UserService;

public abstract class UserView<C extends User> {

    private UserService<C> model;

    public UserView(UserService<C> model) {
        this.model = model;
    }

    public void showContacts() {
        for (C contact : model.getContact()) {
            System.out.println(contact);
        }
    }

}

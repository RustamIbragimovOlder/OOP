package OOP_PracticalTasks.OOP_PT7_final_project.model.service;

import java.util.List;
import OOP_PracticalTasks.OOP_PT7_final_project.model.data.User;

public interface UserService<C extends User> {

    void addContact(C contact);

    void save();

    void load();

    List<C> getContact();

}

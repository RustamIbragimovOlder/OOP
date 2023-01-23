package OOP_Seminars.OOP_Sem7_20jan.task2.model.service;

import java.util.List;

import OOP_Seminars.OOP_Sem7_20jan.task2.model.data.User;

public interface DataService<U extends User> {

    void addUser(U user);

    void save();

    void load();

    List<U> getUsers();
}

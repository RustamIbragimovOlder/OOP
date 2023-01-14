package OOP_Seminars.OOP_Sem5_13jan.model.service;

import OOP_Seminars.OOP_Sem5_13jan.model.data.User;

public interface DataService<U extends User> {

    void addUser(U user);
    void saveUsers(String path);
    void loadUsers(String path);

    
}

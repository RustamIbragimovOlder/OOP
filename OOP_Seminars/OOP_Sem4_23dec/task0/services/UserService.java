package OOP_Seminars.OOP_Sem4_23dec.task0.services;

import OOP_Seminars.OOP_Sem4_23dec.task0.models.User;

public class UserService<U extends User> {

    public U login (String username, String password) {
        return null;
    }

    public U register (String username, String password) {
        return null;
    }

    public void showProfile (U user) {
        System.out.println(user.getUsername());

    }
    
}

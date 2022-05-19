package tp_authentification;

import tp_authentification.LoginForm;
import tp_authentification.models.User;

import java.util.ArrayList;

public class Auth {
    static User signin(LoginForm credentials, ArrayList<User> users){
        for(User user:users){
            if(credentials.getEmail().equals(user.getEmail()) && credentials.getPassword().equals(user.getPassword())){
                return user;
            }
        }
        return null;
    }

    static boolean register(){
        return false;
    }
}

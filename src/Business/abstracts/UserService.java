package Business.abstracts;

import Entities.concretes.User;

public interface UserService {

    void signUp(User user);
    void logIn(User user);
    void logOut(User user);
    void signUpWithGoogle(User user);


}

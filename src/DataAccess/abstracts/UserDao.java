package DataAccess.abstracts;

import Entities.concretes.User;

import java.util.List;

public interface UserDao {

    void signUp(User user);
    void logIn(User user);
    void logOut(User user);
    void update(User user);
    void delete(User user);
    User get(int id);
    List<User> getAll(int id);

}

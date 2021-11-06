package DataAccess.concretes;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateProductDao implements UserDao {

    List<User> users = new ArrayList<>();



    @Override
    public void signUp(User user) {
        System.out.println("Kullanici sisteme kayd olundu : "+user.getFirstName());
    }

    @Override
    public void logIn(User user) {
        System.out.println("Kullanici giris yapti : "+user.getFirstName());
    }

    @Override
    public void logOut(User user) {
        System.out.println("Kullanici cikis yapti : "+user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanici bilgileri guncellendi : "+user.getFirstName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanici sistemden silindi : "+user.getFirstName());
    }

    @Override
    public User get(int id) {
        return users.get(id);
    }

    @Override
    public List<User> getAll(int id) {
       for(User user : users){
            users.get(id);
       }
       return this.users;
    }


}

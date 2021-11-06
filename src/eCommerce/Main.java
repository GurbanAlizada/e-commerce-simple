package eCommerce;

import Business.abstracts.UserService;
import Business.concretes.MailVerificationManager;
import Business.concretes.NameVerificationManager;
import Business.concretes.UserManager;
import Core.concretes.GoogleManagerAdapter;
import DataAccess.concretes.HibernateProductDao;
import Entities.concretes.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1 , "Gurban" , "Alizada" , "gurbanalizda@gmail.com" , "12345678");
        UserService userService1 = new UserManager(new HibernateProductDao() , new NameVerificationManager() ,new MailVerificationManager()  , new GoogleManagerAdapter());
        //userService1.signUp(user1);
        userService1.signUpWithGoogle(user1);
        userService1.logIn(user1);
        userService1.logOut(user1);

        System.out.println("****************************************************************************************");

        User user2 = new User(1 , "Gurban" , "Alizada" , "gurbanalizda7@gmail.com" , "12345678");
        UserService userService2 = new UserManager(new HibernateProductDao() , new NameVerificationManager() ,new MailVerificationManager()  , new GoogleManagerAdapter());
        userService2.signUp(user2);
        // userService2.signUpWithGoogle(user2);
        userService2.logIn(user2);
        userService2.logOut(user2);

    }
}

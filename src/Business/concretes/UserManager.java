package Business.concretes;

import Business.abstracts.MailVerificationService;
import Business.abstracts.NameVerificationService;
import Business.abstracts.UserService;
import Core.abstracts.GoogleService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {

    List<User> userList = new ArrayList<>();


    private UserDao userDao;
    private NameVerificationService nameVerificationService;
    private MailVerificationService mailVerificationService;
    private GoogleService googleService ;



    public UserManager(UserDao userDao, NameVerificationService nameVerificationService,
                       MailVerificationService mailVerificationService,
                       GoogleService googleService) {
        this.userDao = userDao;

        this.nameVerificationService = nameVerificationService;
        this.mailVerificationService = mailVerificationService;
        this.googleService = googleService;
    }



    @Override
    public void signUp(User user) {
        if(!nameVerificationService.firstNameVerification(user)){
            System.out.println("Ad en az iki harfden olusmalidir");
        }else if(!(nameVerificationService.lastNameVerification(user))){
            System.out.println("Soyad en az iki harfden olusmalidir");
        }else if(!mailVerificationService.mailVerification(user)){
            System.out.println("Daha once kullanilmis ve ya hatali mail adresi");
        }else if(!mailVerificationService.passwordVerification(user)){
            System.out.println("Sifre en az 2 karakterden olusmalidir");
        }else{
            this.userDao.signUp(user);
            System.out.println("Mail dogrulamasi gonderildi");
            userList.add(user);
        }
    }

    @Override
    public void signUpWithGoogle(User user) {
        if(mailVerificationService.gmailVerification(user)==true && mailVerificationService.passwordVerification(user)==true && nameVerificationService.firstNameVerification(user)==true){
            this.googleService.signUpWithGoogle(user);
            userList.add(user);
        }else {
            System.out.println("Lutfen dogru google hesabi ile giris yapin");
        }
    }



    @Override
    public void logIn(User user) {
        this.userDao.logIn(user);
    }


    @Override
    public void logOut(User user) {
        this.userDao.logOut(user);
    }



}

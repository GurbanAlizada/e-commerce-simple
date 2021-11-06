package Business.concretes;

import Business.abstracts.NameVerificationService;
import Entities.concretes.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameVerificationManager implements NameVerificationService {


    @Override
    public boolean firstNameVerification(User user) {

        String regex = "^[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getFirstName());
        if(matcher.matches()){
            return true;
        }
            return false;

    }

    @Override
    public boolean lastNameVerification(User user) {
        String regex = "^[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getLastName());
        if(matcher.matches()){
            return true;
        }
             return false;


    }
}

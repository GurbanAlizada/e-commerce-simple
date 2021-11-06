package Business.concretes;

import Business.abstracts.MailVerificationService;
import Entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailVerificationManager implements MailVerificationService {

     List<String> mailList = new ArrayList<String>();


    @Override
    public boolean mailVerification(User user) {

        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(user.getEmail());

        if(matcher.matches()==true && mailList.contains(user.getEmail())==false){
            mailList.add(user.getEmail());
            return true;
        }
        return false;
    }

    @Override
    public boolean passwordVerification(User user) {

        String regex = "^.{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getPassword());
        if(matcher.matches()){
            return  true;
        }
        return  false;

    }

    @Override
    public boolean gmailVerification(User user) {
        String regex = "^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());
        if(matcher.matches()==true && mailList.contains(user.getEmail())==false){
           mailList.add(user.getEmail());
            return true;
        }
        return false;
    }


}

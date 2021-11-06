package Google;

import Entities.concretes.User;

public class GoogleManager {

    public void signUp(User user){
        System.out.println("Google hesabi ile kayd olundu : "+user.getFirstName());
    }


}

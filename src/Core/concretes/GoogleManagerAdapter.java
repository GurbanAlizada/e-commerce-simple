package Core.concretes;

import Core.abstracts.GoogleService;
import Entities.concretes.User;
import Google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {


    @Override
    public void signUpWithGoogle(User user) {
        GoogleManager googleManager = new GoogleManager();
        googleManager.signUp(user);
    }
}

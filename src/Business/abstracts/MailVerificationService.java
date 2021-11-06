package Business.abstracts;

import Entities.concretes.User;

public interface MailVerificationService {

    boolean mailVerification(User user);
    boolean passwordVerification(User user);
    boolean gmailVerification(User user);



}

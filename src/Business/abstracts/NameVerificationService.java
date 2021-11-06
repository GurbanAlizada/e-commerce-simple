package Business.abstracts;

import Entities.concretes.User;

public interface NameVerificationService {

    boolean firstNameVerification(User user);
    boolean lastNameVerification(User user);


}


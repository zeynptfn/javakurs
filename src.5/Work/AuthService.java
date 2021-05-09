package Work;

import Entities.User;

public interface AuthService {
 boolean login (User user);
 boolean register (User user);
 boolean loginWithGoogle(User user);
 
}

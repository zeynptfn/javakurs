package Access;
import java.util.List;
import Entities.User;

public interface UserAccess {
	void add(User user);
    void update(User user);
    void delete(User user);
    User get(int id);
    User getByMail(String mail);
    List<User> getAll();
    boolean isVerified(User user);
}

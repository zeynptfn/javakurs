package Work;

import java.util.List;

import Access.UserAccess;
import Entities.User;

public class UserManager implements UserService{
	 private UserAccess access;

	    public UserManager(UserAccess access){
	        this.access = access ; }
	@Override
	public void add(User user) {
		this.access.add(user);
		
	}

	@Override
	public void delete(User user) {
		this.access.delete(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		
		return this.access.getAll();
	}

	@Override
	public boolean checkMailCorrect(String mail) {
		
		return true;
	}

	@Override
	public User getByMail(String mail) {
		User user = this.access.getByMail(mail);
		return user;
	}

	@Override
	public boolean isVerified(User user) {
		
		return this.access.isVerified(user);
	}

	@Override
	public void verificate(User user) {
		user.set›sVerified(true);
		
	}

	@Override
	public User get(int id) {
		
		return this.access.get(id);
	}

}

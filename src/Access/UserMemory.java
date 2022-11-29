package Access;

import java.util.ArrayList;
import java.util.List;

import Entities.User;

public class UserMemory implements UserAccess{
	private List<User> users;
	private static int Lastid;

	public UserMemory() {
		this.users=new ArrayList<>();
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("kullanıcı veritabanına kaydedildi.");
		Lastid++;
	}

	@Override
	public void update(User user) {
		System.out.println("güncelleme yapılamadı.");
		
	}

	@Override
	public void delete(User user) {
		int userdelete =this.users.indexOf(user);
		this.users.remove(userdelete);
		System.out.println("kullanıcı veritabanından silindi.");
		Lastid--;
		
		
	}

	@Override
	public User get(int id) {
		User userreturn =null;
		for(User user : this.users) {
			if (user.getId()==id) {userreturn =user ; break;}}
		return userreturn;
		}
		
       

	@Override
	public User getByMail(String mail) {
		User userreturn = null;
		for(User user : this.users) {
			if (user.getMail().equals(mail)) {userreturn =user ; break;}}
		return userreturn;
		
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public boolean isVerified(User user) {
	User usercheck = get(user.getId());
	return usercheck.isİsVerified()?
			true:false;
	
	}
	public static int getLastid() {return Lastid;}	
	public static void setLastid(int Lastid) {
		UserMemory.Lastid= Lastid;
	}

}

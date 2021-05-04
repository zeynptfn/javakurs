package Work;


import Abstrut.CheckService;
import Abstrut.UserServise;
import Entitiy.User;

public class UserManager implements UserServise{

	CheckService _checkService;
	public UserManager(CheckService checkservice)
	{
		this._checkService=checkservice;
	}

	@Override
	public void AddUser(User user) {
		if(_checkService.RealRepson(user)) {
			System.out.println(user.getFirstName()+"kayýt edildi.");
		}
		else {System.out.println("kayýt baþarýsýz, doðrulama yapýlamadý.");}
		
	}

	@Override
	public void RemoveUser(User user) {
		System.out.println(user.getFirstName()+"oyuncu silindi");
		
	}

	@Override
	public void UpdateUser(User user) {
		System.out.println("oyuncu güüncellendi"+user.getFirstName());
		
	}

	
	
	
	
	

}

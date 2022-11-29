package Service;
import Google.LoginMail;

public class Loginwithmail implements LoginmailService {

	@Override
	public boolean logýn(String mail, String password) {
		LoginMail mail = new LoginMail();
		return mail.Login(mail,password);
		
	}

}

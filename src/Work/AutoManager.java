package Work;

import Entities.User;
import Service.LoginmailService;

public class AutoManager implements AuthService {
	private UserService userService;
    private VertfService verificationService;
    private LoginmailService loginWithGmailService;
    
	public AutoManager(UserService userService, VertfService verificationService,
			LoginmailService loginWithGmailService) {
		
		this.userService = userService;
		this.verificationService = verificationService;
		this.loginWithGmailService = loginWithGmailService;
	}

	@Override
	public boolean login(User user) {
		
		return true;
	}

	@Override
	public boolean register(User user) {
		
		return true;
	}

	@Override
	public boolean loginWithGoogle(User user) {
		
		return true;
	}
	

}

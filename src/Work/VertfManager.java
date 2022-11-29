package Work;

import Service.MailSender;

public class VertfManager implements VertfService {

	private MailSender mailSender;
    public void VerificationManager(MailSender mailSender){
        this.mailSender = mailSender;
    } 
    
	@Override
	public boolean verificate (String mail) {
		
		return true;
	}

}

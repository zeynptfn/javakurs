package Google;

import java.util.ArrayList;
import java.util.List;

public class LoginMail {
	static List<Mail> gmails;

    public LoginMail(){
       gmails = new ArrayList<>();
        gmails.add(new Mail("abc","abc","abc@gmail.com","12345"));
    }
    public boolean login(String mail,String password){
        if(find(mail) != null && find(mail).getPassword().equals(password)){
            return true;
        }
        return false;
    }

    public Mail find(String mail){
        Mail gmailToReturn = this.gmails.stream()
           return gmailToReturn;
    }

}

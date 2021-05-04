package javakursu;

import java.time.LocalDate;

import Entitiy.Campaign;
import Entitiy.Game;
import Entitiy.User;
import Work.GameManager;
import Work.Mernis;
import Work.UserManager;

public class Main {
	

	public static void main(String[] args) {
		User user1 = new User ();
		user1.setFirstName("zeynep");
		user1.setLastName("Tufan");
		user1.setId(1);
		user1.setNatiolanIdentitiy("21941566334478");
		user1.setDateOfBirth(LocalDate.of(2000, 10, 9));
		
		UserManager usermanager = new UserManager(new Mernis());
		usermanager.AddUser(user1);
		usermanager.UpdateUser(user1);
		usermanager.RemoveUser(user1);
		
		Game game = new Game();
		game.setGameName("Bulmaca");
		game.setId(1);
		game.setPrice(25.4);
		
		Campaign campaign = new Campaign ();
		campaign.setCampaigName("kurs");
		campaign.setId(1);
		campaign.setDisCount(5);
		campaign.set›sActive(true);
		
		
		
				
		GameManager gamemanager = new GameManager();
		gamemanager.Sell(user1, game, null);
	}

}

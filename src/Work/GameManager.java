package Work;

import Abstrut.GameSerivice;
import Entitiy.Campaign;
import Entitiy.Game;
import Entitiy.User;

public class GameManager implements GameSerivice{

	@Override
	public void Sell(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName()+"adl� oyuncu"+game.getGameName()+"oyununa"+campaign.getCampaigName()+"kampanyas�yla sat�n al�nd�.");
		
	}

	@Override
	public void Sell(User user, Game game) {
		System.out.println(user.getFirstName()+"adl� oyuncu"+game.getGameName()+"oyununa sat�n al�nd�.");
		
	}

}

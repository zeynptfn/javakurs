package Abstrut;

import Entitiy.Campaign;
import Entitiy.Game;
import Entitiy.User;

public interface GameSerivice {
	public void Sell (User user,Game game, Campaign campaign);
	public void Sell (User user,Game game);
	

}

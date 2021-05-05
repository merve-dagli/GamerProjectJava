package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Store;

public interface SalesService {
	void sales(Game game, Campaign campaign,Store store,Gamer gamer);
}

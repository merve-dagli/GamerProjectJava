package tr.gov.nvi.tckimlik.WS;

import java.util.GregorianCalendar;

import Adapters.MernisServiceAdaptor;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Store;

public class Main {

	public static void main(String[] args)  {
		/*GamerManager gamerManager=new GamerManager(new MernisServiceAdaptor());
		Gamer gamer=new Gamer(1,"merve","daðlý",new GregorianCalendar(1997,1,15),"111111");
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		System.out.println("-------------");
		GameManager gameManager=new GameManager();
		Game game=new Game(2,"NFC",50);
		gameManager.add(game);;
		gameManager.update(game);
		gameManager.delete(game);
		System.out.println("-------------");
		CampaignManager campaingManager=new CampaignManager();
		Campaign campaing =new Campaign(3,"3 nolu Kampanya ", 10);
		campaingManager.add(campaing);
		campaingManager.update(campaing);
		campaingManager.delete(campaing);
		System.out.println("-----------------------------------");*/
		 Gamer gamer1 = new Gamer(1,"Merve","Daðlý",new GregorianCalendar(1997,1,15),"111111");       

         GamerManager gamerManager = new GamerManager(new MernisServiceAdaptor());
         gamerManager.add(gamer1);
         gamerManager.update(gamer1);
         gamerManager.delete(gamer1);
         System.out.println(" ");
         System.out.println(" ");
         System.out.println(" ");
        

         Gamer gamer2 = new Gamer(2,"Ali","Iþýk",new GregorianCalendar(1990,11,10), "22222");
               

         Store store1 = new Store(1,"OnlinePlayStore");      
         Store store2 = new Store(2,"PlayStore");     


         System.out.println("Games: ");

          Game game1 = new Game(1,"Pes 2021 Season Update PS4", 199.00);
          Game game2 = new Game(2,"GTA 5 PS4", 177.00);
          Game game3 = new Game(3,"NBA 2K21 PS4",295.00);


           Game[] games1 = new Game[] { game1, game2, game3 };

             for(Game game : games1)
             {
            	 System.out.println("Game Name : " + game.getGameName() + " GamePrice : " + game.getGamePrice() + " TL");

             }

             
             System.out.println(" ");
             System.out.println(" ");
             System.out.println(" ");
             System.out.println("Campaigns: ");
            

             Campaign campaign1 = new Campaign(1,"Campaign in honor of the Chinese New Year!",20);

             Campaign campaign2 = new Campaign(2,"Campaign in honor of the Black Friday!",30);
           
             Campaign campaign3 = new Campaign(3,"This game has no campaign!",0);
          


             CampaignManager campaignManager = new CampaignManager();

             campaignManager.add(campaign1);
             campaignManager.add(campaign2);
             campaignManager.add(campaign3);

             System.out.println(" ");
             System.out.println(" ");
             System.out.println(" ");
             System.out.println("Sales:");

             SalesManager salesManager = new SalesManager();

             salesManager.sales(game1, campaign1, store2,gamer1);
             salesManager.sales(game2, campaign2, store1,gamer2);

         }



}

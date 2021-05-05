package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Store;

public class SalesManager implements SalesService {

	@Override
	public void sales(Game game, Campaign campaign, Store store, Gamer gamer) {
		double discount = game.getGamePrice();

        if (gamer.getFirstName() == "Merve" && gamer.getLastName() == "Da�l�" && gamer.getNationalityId() == "11111")
        {
            if (campaign.getCampaignDiscount() == 20)
            {
                discount = (discount * 0.80);

               System.out.println("Sn. " + gamer.getFirstName() + " i�in " + game.getGameName() + " isimli oyun " + game.getGamePrice() + " TL'den " + " % " + campaign.getCampaignDiscount() + " " + campaign.getCampaignName() + " ile " + discount + " TL fiyata " + store.getStoreName() + " �zerinden sat��� ger�ekle�mi�tir.");
            }
            else if (campaign.getCampaignDiscount() == 30)
            {
                discount = (discount * 0.70);
                System.out.println("Sn. " + gamer.getFirstName() + " i�in " + game.getGameName() + " isimli oyun " + game.getGamePrice() + " TL'den " + " % " + campaign.getCampaignDiscount() + " " + campaign.getCampaignName() + " ile " + discount + " TL fiyata " + store.getStoreName() + " �zerinden sat��� ger�ekle�mi�tir.");

            }
            else
            {

            	System.out.println("Sn. " + gamer.getFirstName()+ " i�in " + game.getGameName() + " isimli oyun " + game.getGamePrice() + " TL fiyata " + store.getStoreName() + " �zerinden sat��� ger�ekle�mi�tir." + " " + campaign.getCampaignName());
            }
        }
        else
        {
        	System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" isimli kay�t bulunamam��t�r.");
        }
        }
		
	}



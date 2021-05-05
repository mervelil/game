package concrete;

import abstracts.CampaignControlService;
import abstracts.SalesService;
import entitites.Campaign;
import entitites.Game;
import entitites.Gamer;

public class SaleManager implements SalesService {
	  CampaignControlService campaignControlService;
	@Override
	public void sale(Game game, Gamer gamer) {
		// TODO Auto-generated method stub
		 System.out.println( game.getGameName()+ " sold to "
	                + gamer.getUserName() + " with price" + game.getPrice());
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		// TODO Auto-generated method stub
		 if(campaignControlService.isValidCampaignForGame(campaign,game))
		        System.out.println( game.getGameName()+ " sold to "
		                + gamer.getUserName() +" via campaign code"+campaign.getCampaignCode()+ " with only price " + game.getPriceAfterDiscount(campaign.getDiscount()));
		        else
		            System.out.println(campaign.getCampaignCode() +" campaign can not be applicable for " +game.getGameName());
		    }
	}



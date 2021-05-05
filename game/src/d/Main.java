package d;
import java.sql.Date;
import abstracts.*;

import abstracts.CampaignControlService;
import concrete.*;
import entitites.*;

public class Main {

	public static void main(String[] args) {
		 Gamer gamer=new Gamer(1,"1gamerUserName0",new Date(2022,1,2),"4567111111");
	        GamerManager gamerManagerApplication=new GamerManager(new EDevlet());
	        gamerManagerApplication.create(gamer);

	        Game game=new Game(1,"game22",10);
	        GameManager gameManager=new GameManager();
	        gameManager.add(game);

	        CampaignControlService campaignControlService=new CampainValidator();
	        Campaign campaign=new Campaign(1,"ABC",1,new Date(2022,1,1));
	        CampaignManager campaignManager=new CampaignManager();
	        campaignManager.add(campaign);

	        SaleManager saleManager= new SaleManager();
	        saleManager.sale(game,gamer);
	        saleManager.saleWithCampaign(game,gamer,campaign);
	}

}

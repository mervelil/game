package concrete;

import abstracts.*;
import abstracts.CampaignControlService;
import abstracts.CampainServi;
import entitites.*;

public class CampaignManager implements CampainServi{
	private CampaignControlService campaignControlService;
	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		   if(campaignControlService.isValidCampaign(campaign))
		        System.out.println(campaign.getCampaignCode()+" Campaign added successfully"  );
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}

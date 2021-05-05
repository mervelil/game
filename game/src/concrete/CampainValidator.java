package concrete;

import abstracts.CampaignControlService;
import entitites.*;
import java.util.Date;
public class CampainValidator implements CampaignControlService {

    @Override
    public boolean isValidCampaign(Campaign campaign) {
        return campaign.getValidityDate().after(new Date(System.currentTimeMillis()));
    }

    @Override
    public boolean isValidCampaignForGame(Campaign campaign, Game game) {
        return game.getPrice()>(game.getPriceAfterDiscount(campaign.getDiscount()));
    }
}

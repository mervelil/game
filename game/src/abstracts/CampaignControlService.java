package abstracts;
import entitites.*;
public interface CampaignControlService {
	boolean isValidCampaign(Campaign campaign);
    boolean isValidCampaignForGame(Campaign campaign, Game game);
}

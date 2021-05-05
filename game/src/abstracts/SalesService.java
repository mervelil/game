package abstracts;
import entitites.*;
public interface SalesService {

    public void sale (Game game,Gamer gamer);

    public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign);
}

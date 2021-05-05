package concrete;

import abstracts.GameControlServices;
import abstracts.GamerService;
import entitites.Gamer;

public class GamerManager implements GamerService {
	  private GameControlServices gamerControlService;
	   public GamerManager(GameControlServices gamerControlService) {
	        this.gamerControlService = gamerControlService;
	    }
	@Override
	public void create(Gamer gamer) {
		// TODO Auto-generated method stub
		if (gamerControlService.isValidGamer(gamer))
            System.out.println(gamer.getUserName() + " added");
        else
            System.out.println(gamer.getUserName() + " is not valid");
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub

        System.out.println(gamer.getUserName() + " updated");	
	}

	@Override
	public void inactivate(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getUserName() + " inactivated");
		
	}

}

package concrete;

import abstracts.GameService;
import entitites.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		  System.out.println(game.getGameName() +" new game added successfully");
	}

	@Override
	public void update(Game game) {
		  System.out.println(game.getGameName() +" game updated successfully");
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
	    System.out.println(game.getGameName() +" game deleted successfully");
	}

}

package concrete;

import java.util.Date;

import abstracts.GameControlServices;
import entitites.Gamer;

public class EDevlet implements GameControlServices {

	@Override
	public boolean isValidGamer(Gamer gamer) {
		// TODO Auto-generated method stub
	 return !gamer.getUserName().isEmpty() || !gamer.getUserName().isBlank()
                && !gamer.getNationalityId().isBlank() && gamer.getDateOfBirth().before(new Date(2002, 1, 1, 0, 0, 0));
	}

}

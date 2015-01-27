package Person;

import Comportements.ComportementActionSeDeplacer;

public class Arbitre extends Personnage {

	public Arbitre(String nom) {
		// TODO: Not sure if this one is a "personnage" with actions/
		super(nom, new ComportementActionSeDeplacer());
	}

}


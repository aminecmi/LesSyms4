package Person;

import Comportements.ComportementSiffler;

public class Arbitre extends Personnage {

	public Arbitre(String nom) {
	    super(null, nom);
	    this.comportementEmmetreSon = new ComportementSiffler();
	}

}


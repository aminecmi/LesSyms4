package Person;

import Comportements.ComportementSiffler;
import Observateur.Organisation;

public class Arbitre extends Personnage {

	protected Arbitre(Organisation etatMajor, String nom) {
	    super(etatMajor, nom);
	    //this.comportementCombat = new ComportementCombatAvecCheval();
	    this.comportementEmmetreSon = new ComportementSiffler();
	}
	
	public String getNom() {
	    return "Arbitre de la rencontre: M." + this.nom + ".\nVeuillez respecter l'arbitre (lol.)";
	}

}


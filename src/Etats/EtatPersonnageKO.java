package Etats;

import Person.Personnage;

public class EtatPersonnageKO extends EtatPersonnageAbstrait {
	
	private int nbTourKO;

	public EtatPersonnageKO(Personnage perso) {
		super(perso);
	}

    @Override
    protected void execute() {
        if (this.joueur.getPointsDeVie() > 0) {
            this.joueur.ChangeEtat(EEtat.EtatOK);
        }
    }
}

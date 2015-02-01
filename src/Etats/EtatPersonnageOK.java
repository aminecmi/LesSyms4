package Etats;

import Person.Personnage;

public class EtatPersonnageOK extends EtatPersonnageAbstrait {

    public EtatPersonnageOK(Personnage perso) {
        super(perso);
    }

    @Override
    protected void execute() {
        if (this.joueur.getPointsDeVie() == 0) {
            this.joueur.ChangeEtat(EEtat.EtatKO);
        }
    }

}

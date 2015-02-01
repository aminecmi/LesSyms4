package Etats;

import Person.Personnage;

public class EtatPersonnageOK extends EtatPersonnageAbstrait {

    private int nbTourKO;

    public EtatPersonnageOK(Personnage perso) {
        super(perso);
        this.nbTourKO = 3;
    }

    @Override
    protected void execute() {
        if (this.joueur.getPointsDeVie() == 0) {
            this.joueur.ChangeEtat(EEtat.EtatKO);
        }
    }

}

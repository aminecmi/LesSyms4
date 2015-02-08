package Etats;

import Person.Personnage;

public abstract class EtatPersonnageAbstrait {

    final Personnage joueur;

    EtatPersonnageAbstrait(Personnage perso) {
        this.joueur = perso;
	}

    protected abstract void execute();
}

package Etats;

import Person.Personnage;

public abstract class EtatPersonnageAbstrait {
	
	protected Personnage joueur;

	protected EtatPersonnageAbstrait(Personnage perso){
		this.joueur = perso;
	}
	
	public abstract void AnalyseJoueur();
	public abstract void ExecutionJoueur();
	public abstract void ConflitJoueur();
}

package Etats;

import Person.Personnage;

public class EtatPersonnageCombattant extends EtatPersonnageAbstrait {

	//Etat d'un personnage avec un marteau, cible les joueurs et ignore le reste.
	 
	protected EtatPersonnageCombattant(Personnage perso) {
		super(perso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AnalyseJoueur() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ExecutionJoueur() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConflitJoueur() {
		// TODO Auto-generated method stub
		
	}

    @Override
    public void mediationConflits() {

    }

}

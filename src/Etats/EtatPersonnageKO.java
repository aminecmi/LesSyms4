package Etats;

import Person.Personnage;

public class EtatPersonnageKO extends EtatPersonnageAbstrait {
	
	private int nbTourKO;

	public EtatPersonnageKO(Personnage perso) {
		super(perso);
		// TODO Auto-generated constructor stub
		
		this.nbTourKO = 3;
	}

	@Override
	public void AnalyseJoueur() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ExecutionJoueur() {
		// TODO Auto-generated method stub
		
		nbTourKO--;
		if (nbTourKO==0){
			this.joueur.ChangeEtat(EEtat.EtatOK);
		}
		
	}

	@Override
	public void ConflitJoueur() {
		// TODO Auto-generated method stub
		
	}

    @Override
    public void mediationConflits() {

    }

}

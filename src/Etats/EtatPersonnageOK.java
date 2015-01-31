package Etats;

import Comportements.*;
import Person.Personnage;

public class EtatPersonnageOK extends EtatPersonnageAbstrait {
	
	private ComportementAction Action;

	public EtatPersonnageOK(Personnage perso) {
		super(perso);
		// TODO Auto-generated constructor stub

        this.ChangerAction(EAction.SeDeplacer);
    }

	@Override
	public void AnalyseJoueur() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ExecutionJoueur() {
		// TODO Auto-generated method stub
        Action.executerAction(this.joueur);
    }

	@Override
	public void ConflitJoueur() {
		// TODO Auto-generated method stub
		
	}

    @Override
    public void mediationConflits() {

    }

    public void ChangerAction(EAction nouvelAction) {

        switch(nouvelAction)
		{
			case ChangerCouleurCase:
				Action = new ComportementActionChangerCouleurCase();
				break;
			case RamasserNeige:
				Action = new ComportementActionRamasserNeige();
				break;
			case SeDeplacer:
				Action = new ComportementActionSeDeplacer();
				break;
			case TirerBalon:
				Action = new ComportementActionTirerBalon();
				break;
			case TirerBouleDeNeige:
				Action = new ComportementActionTirerBouleDeNeige();
				break;
            //case Null:
            //Action = null;
            //break;
            default:
			break;
		
		}
		
		this.joueur.setAction(nouvelAction);
	}
	
	

}

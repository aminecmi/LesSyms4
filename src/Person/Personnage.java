package Person;

import Cases.CaseAbstraite;
import Comportements.ComportementAction;
import Composition.PersonnagesAbstraits;
import Etats.EEtat;
import Etats.EtatPersonnageAbstrait;
import Etats.EtatPersonnageKO;
import Etats.EtatPersonnageOK;

public class Personnage extends PersonnagesAbstraits {
	protected CaseAbstraite caseCourante;
    protected String nom;
    protected String groupe;
    protected double pointsDeVie;
    protected double force;
    protected double vitesse;
	protected ComportementAction action;
	private EtatPersonnageAbstrait etatCourant;

	protected Personnage(String name, ComportementAction c) {
		this.nom = name;
		this.pointsDeVie = 100;
		this.force = 10;
		this.vitesse = 1;

		this.caseCourante = null;
		this.etatCourant = new EtatPersonnageOK(this);
		this.action = c;
	}

	protected Personnage(String name, double lifePoint, double strength, double speed, ComportementAction a) {
		this.nom = name;
		this.pointsDeVie=lifePoint;
        this.force=strength;
        this.vitesse=speed;
        
        this.caseCourante=null;
        this.etatCourant= new EtatPersonnageOK(this);
		this.action = a;
	}


	public void ChangeEtat(EEtat NouvelEtat)
	{
		switch(NouvelEtat)
		{
			case EtatOK:
				etatCourant = new EtatPersonnageOK(this);
				break;
			case EtatKO:
				etatCourant = new EtatPersonnageKO(this);
				break;
		default:
			break;
		
		}
		
	}
    
	
	public EtatPersonnageAbstrait getEtatCourant() {
		return etatCourant;
	}

	public void setEtatCourant(EtatPersonnageAbstrait etatCourant) {
		this.etatCourant = etatCourant;
	}

	public double getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(double pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	public double getForce() {
		return force;
	}

	public void setForce(double force) {
		this.force = force;
	}

	public double getVitesse() {
		return vitesse;
	}

	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}
	
	public String getGroupe() {
		return groupe;
	}


	public void setGroupe(String equipe) {
		groupe = equipe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

    public CaseAbstraite getCaseCourante() {
        return caseCourante;
    }

    public void setCaseCourante(CaseAbstraite caseCourante) {
        this.caseCourante = caseCourante;
    }

    public void AnalyseSituation() {
        // Todo
    }

    public void Execution() {
        // Todo

    }

}

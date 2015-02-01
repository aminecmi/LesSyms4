package Person;

import Cases.CaseAbstraite;
import Cases.PointsCardinaux;
import Comportements.*;
import Composition.PersonnagesAbstraits;
import Etats.EEtat;
import Etats.EtatPersonnageAbstrait;
import Etats.EtatPersonnageKO;
import Etats.EtatPersonnageOK;
import Objets.ObjetAbstrait;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Personnage extends PersonnagesAbstraits {


	protected CaseAbstraite caseCourante;
    protected String nom;
    protected String groupe;
    protected double pointsDeVie;
    protected double force;
    protected double vitesse;
    protected double portee;
    protected EAction action;
    protected ComportementAction Action;
    private EtatPersonnageAbstrait etatCourant;
    private HashMap<PointsCardinaux, CaseAbstraite> voisins;


    protected Personnage(String name, ComportementAction c) {
        this.nom = name;
		this.pointsDeVie = 100;
		this.force = 10;
		this.vitesse = 1;
        this.portee = 2;

		this.caseCourante = null;
		this.etatCourant = new EtatPersonnageOK(this);
        this.ChangerAction(EAction.SeDeplacer);

    }

    protected Personnage(String name, double lifePoint, double strength, double speed, int portee, ComportementAction a) {
        this.nom = name;
		this.pointsDeVie=lifePoint;
        this.force=strength;
        this.vitesse=speed;
        this.portee = portee;

        this.caseCourante=null;
        this.etatCourant= new EtatPersonnageOK(this);
        this.ChangerAction(EAction.SeDeplacer);

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
        this.voisins = this.caseCourante.getVoisins();

    }

    public double getPortee() {
        return portee;
    }

    public void setPortee(double portee) {
        this.portee = portee;
    }

	public EAction getAction() {
		return action;
	}

	public void setAction(EAction action) {
		this.action = action;
	}

    public void AnalyseSituation() {
        ArrayList<ObjetAbstrait> objets = rechercheObjetProche();
        ArrayList<Personnage> personnages = rechercheJoueur();
    }

    public void Execution() {
        Action.executerAction(this);
    }
    
    public void ResoudreLesConflits(){


    }

    public HashMap<PointsCardinaux, CaseAbstraite> voisinsPortee(CaseAbstraite c, int rayon) {
        HashMap<PointsCardinaux, CaseAbstraite> voisinsActuels = new HashMap<PointsCardinaux, CaseAbstraite>();
        HashMap<PointsCardinaux, CaseAbstraite> v = c.getVoisins();
        if ((rayon + 1) == this.getPortee()) {
            // voisinsActuels.putAll(v);
            return c.getVoisins();
        } else {
            int r = rayon + 1;
            for (PointsCardinaux mapKey : v.keySet()) {
                voisinsActuels.putAll(voisinsPortee(v.get(mapKey), r));
            }
            return voisinsActuels;
        }
    }

    public ArrayList<ObjetAbstrait> rechercheObjetProche() {

        ArrayList<ObjetAbstrait> objetsVoisins = new ArrayList<ObjetAbstrait>();

        HashSet<CaseAbstraite> voisinsDesVoisins = getCaseAbstraitesForPortee();

        for (CaseAbstraite c : voisinsDesVoisins) {
            if (c.getObjetOccupant() != null) {
                objetsVoisins.add(c.getObjetOccupant());
            }
        }
        return objetsVoisins;
    }

    protected HashSet<CaseAbstraite> getCaseAbstraitesForPortee() {
        HashSet<CaseAbstraite> voisinsDesVoisins = new HashSet<CaseAbstraite>();
        voisinsDesVoisins.addAll(voisinsPortee(this.caseCourante, 0).values());
        return voisinsDesVoisins;
    }


    public ArrayList<Personnage> rechercheJoueur() {
        ArrayList<Personnage> personnes = new ArrayList<Personnage>();

        HashSet<CaseAbstraite> voisinsDesVoisins = getCaseAbstraitesForPortee();

        for (CaseAbstraite c : voisinsDesVoisins) {
            if (c.getOccupant() != null) {
                personnes.add(c.getOccupant());
            }
        }

        return personnes;
    }

    public void mediationConflits() {


    }

    public void ChangerAction(EAction nouvelAction) {

        switch (nouvelAction) {
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
            default:
                break;

        }

        this.setAction(nouvelAction);
    }
}

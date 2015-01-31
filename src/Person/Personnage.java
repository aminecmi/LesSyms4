package Person;

import Cases.CaseAbstraite;
import Cases.PointsCardinaux;
import Comportements.ComportementAction;
import Comportements.EAction;
import Composition.PersonnagesAbstraits;
import Etats.EEtat;
import Etats.EtatPersonnageAbstrait;
import Etats.EtatPersonnageKO;
import Etats.EtatPersonnageOK;
import Objets.ObjetAbstrait;

import java.util.HashMap;

public class Personnage extends PersonnagesAbstraits {


	protected CaseAbstraite caseCourante;
    protected String nom;
    protected String groupe;
    protected double pointsDeVie;
    protected double force;
    protected double vitesse;
    protected double porter;
	protected EAction action;
	private EtatPersonnageAbstrait etatCourant;
    private HashMap<PointsCardinaux, CaseAbstraite> voisins;

	protected Personnage(String name, ComportementAction c) {
		this.nom = name;
		this.pointsDeVie = 100;
		this.force = 10;
		this.vitesse = 1;
		this.porter = 2;

		this.caseCourante = null;
		this.etatCourant = new EtatPersonnageOK(this);
		this.action = EAction.Null;
	}

	protected Personnage(String name, double lifePoint, double strength, double speed, ComportementAction a) {
		this.nom = name;
		this.pointsDeVie=lifePoint;
        this.force=strength;
        this.vitesse=speed;
        
        this.caseCourante=null;
        this.etatCourant= new EtatPersonnageOK(this);
		this.action = EAction.Null;
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
    
	public double getPorter() {
		return porter;
	}

	public void setPorter(double porter) {
		this.porter = porter;
	}

	public EAction getAction() {
		return action;
	}

	public void setAction(EAction action) {
		this.action = action;
	}

    public void AnalyseSituation() {
    	etatCourant.AnalyseJoueur();
    }

    public void Execution() {
    	etatCourant.ExecutionJoueur();
    }
    
    public void ResoudreLesConflits(){
    	etatCourant.ConflitJoueur();
    }

    public ObjetAbstrait rechercheObjetProche() {

        ObjetAbstrait objetDeLaCase = null;

        for (PointsCardinaux mapKey : voisins.keySet()) {
            if (voisins.get(mapKey).getObjetOccupant() != null) {
                objetDeLaCase = voisins.get(mapKey).getObjetOccupant();
            }
        }
        if (objetDeLaCase != null) {
            for (PointsCardinaux mapKey : voisins.keySet()) {
                switch (mapKey) {
                    case N:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getObjetOccupant();
                        }
                        break;
                    case NE:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getObjetOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.NE) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.NE).getObjetOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getObjetOccupant();
                        }
                        break;
                    case E:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getObjetOccupant();
                        }
                        break;
                    case SE:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getObjetOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.SE) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.SE).getObjetOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getObjetOccupant();
                        }
                        break;
                    case S:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getObjetOccupant();
                        }
                        break;
                    case SW:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getObjetOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.SW) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.SW).getObjetOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getObjetOccupant();
                        }
                        break;
                    case W:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getObjetOccupant();
                        }
                        break;
                    case NW:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getObjetOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.NW) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.NW).getObjetOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null) {
                            objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getObjetOccupant();
                        }
                        break;
                    default:
                        break;

                }
            }
        }
        return objetDeLaCase;
    }


    public Personnage rechercheJoueur() {
        Personnage personne = null;

        for (PointsCardinaux mapKey : voisins.keySet()) {
            if (voisins.get(mapKey).getOccupant() != null) {
                personne = voisins.get(mapKey).getOccupant();
            }
        }
        if (personne != null) {
            for (PointsCardinaux mapKey : voisins.keySet()) {
                switch (mapKey) {
                    case N:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getOccupant();
                        }
                        break;
                    case NE:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.NE) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.NE).getOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getOccupant();
                        }
                        break;
                    case E:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getOccupant();
                        }
                        break;
                    case SE:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.SE) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.SE).getOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getOccupant();
                        }
                        break;
                    case S:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getOccupant();
                        }
                        break;
                    case SW:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.SW) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.SW).getOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getOccupant();
                        }
                        break;
                    case W:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getOccupant();
                        }
                        break;
                    case NW:
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.NW) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.NW).getOccupant();
                        }
                        if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null) {
                            personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getOccupant();
                        }
                        break;
                    default:
                        break;

                }
            }
        }
        return personne;
    }

    public void mediationConflits() {
        etatCourant.mediationConflits();
    }
}

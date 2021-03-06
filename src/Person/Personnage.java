package Person;

import Cases.CaseAbstraite;
import Cases.utils.PointsCardinaux;
import Comportements.*;
import Composition.PersonnagesAbstraits;
import Etats.EEtat;
import Etats.EtatPersonnageAbstrait;
import Etats.EtatPersonnageKO;
import Etats.EtatPersonnageOK;
import Objets.ObjetAbstrait;
import Observateur.ObservateurAbstrait;
import utils.Tuple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Personnage extends PersonnagesAbstraits implements ObservateurAbstrait {


    private final String nom;
    private final double force;
    private final double vitesse;
    private final double portee;
    private CaseAbstraite caseCourante;
    private ObjetAbstrait objet;
    private String groupe;
    private double pointsDeVie;
    private EAction action;
    private ComportementAction Action;
    private HashSet<CaseAbstraite> voisinsActuels = new HashSet<CaseAbstraite>();
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
        this.Action = c;
    }


    Personnage(String name, double lifePoint, double strength, double speed, int portee, ComportementAction a) {
        this.nom = name;
		this.pointsDeVie=lifePoint;
        this.force=strength;
        this.vitesse=speed;
        this.portee = portee;

        this.caseCourante=null;
        this.etatCourant= new EtatPersonnageOK(this);
        this.ChangerAction(EAction.SeDeplacer);
        this.Action = a;
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

    public Tuple<ArrayList<Personnage>, ArrayList<ObjetAbstrait>, ArrayList<CaseAbstraite>> AnalyseSituation() {
        HashSet<CaseAbstraite> voisinsDesVoisins = getCaseAbstraitesForPortee();
        voisinsActuels = new HashSet<CaseAbstraite>();
        voisinsDesVoisins.remove(this.getCaseCourante());
        ArrayList<CaseAbstraite> casesVoisines = new ArrayList<CaseAbstraite>(voisinsDesVoisins);
        ArrayList<ObjetAbstrait> objets = rechercheObjetProche(voisinsDesVoisins);
        ArrayList<Personnage> personnages = rechercheJoueur(voisinsDesVoisins);

        return new Tuple<ArrayList<Personnage>, ArrayList<ObjetAbstrait>, ArrayList<CaseAbstraite>>(personnages, objets, casesVoisines);
    }

    public void Execution(Tuple<ArrayList<Personnage>, ArrayList<ObjetAbstrait>, ArrayList<CaseAbstraite>> t) {
        Action.executerAction(this, t);
    }

    HashSet<CaseAbstraite> voisinsPortee(CaseAbstraite c, int rayon) {
        HashMap<PointsCardinaux, CaseAbstraite> v = c.getVoisins();
        if ((rayon + 1) == this.getPortee()) {
            voisinsActuels.addAll(c.getVoisins().values());
        } else {
            int r = rayon + 1;
            for (PointsCardinaux mapKey : v.keySet()) {
                voisinsActuels.addAll(voisinsPortee(v.get(mapKey), r));
            }
        }
        return voisinsActuels;
    }

    ArrayList<ObjetAbstrait> rechercheObjetProche(HashSet<CaseAbstraite> voisinsDesVoisins) {
        ArrayList<ObjetAbstrait> objetsVoisins = new ArrayList<ObjetAbstrait>();

        for (CaseAbstraite c : voisinsDesVoisins) {
            if (c.getObjetOccupant() != null) {
                objetsVoisins.add(c.getObjetOccupant());
            }
        }
        return objetsVoisins;
    }

    HashSet<CaseAbstraite> getCaseAbstraitesForPortee() {
        HashSet<CaseAbstraite> voisins = voisinsPortee(this.caseCourante, 0);
        voisins.remove(getCaseCourante());
        return voisins;
    }


    ArrayList<Personnage> rechercheJoueur(HashSet<CaseAbstraite> voisinsDesVoisins) {
        ArrayList<Personnage> personnes = new ArrayList<Personnage>();
        for (CaseAbstraite c : voisinsDesVoisins) {
            if (c.getOccupant() != null) {
                personnes.add(c.getOccupant());
            }
        }

        return personnes;
    }

    void ChangerAction(EAction nouvelAction) {

        switch (nouvelAction) {
            case ChangerCouleurCase:
                Action = new ComportementActionChangerCouleurCase();
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
            case Rien:
                Action = new Rien();
                break;
            default:
                break;

        }

        this.setAction(nouvelAction);
    }

    ObjetAbstrait getObjet() {
        return objet;
    }

    public void setObjet(ObjetAbstrait objet) {
        this.objet = objet;
    }

    public double getPointsDeVie() {
        double bonus = 0;
        if (getObjet() != null) {
            bonus = getObjet().getPointsDeVie();
        }
        return bonus + pointsDeVie;
    }

    void setPointsDeVie(double pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    double getForce() {
        double bonus = 0;
        if (getObjet() != null) {
            bonus = getObjet().getForce();
        }
        return bonus + force;
    }

    public double getVitesse() {
        double bonus = 0;
        if (getObjet() != null) {
            bonus = getObjet().getVitesse();
        }
        return bonus + vitesse;
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

    public CaseAbstraite getCaseCourante() {
        return caseCourante;
    }

    public void setCaseCourante(CaseAbstraite caseCourante) {
        this.caseCourante = caseCourante;
        this.voisins = this.caseCourante.getVoisins();

    }

    double getPortee() {
        return portee;
    }

    public EAction getAction() {
        return action;
    }

    void setAction(EAction action) {
        this.action = action;
    }

    public HashMap<PointsCardinaux, CaseAbstraite> getVoisins() {
        return voisins;
    }

    public void setVoisins(HashMap<PointsCardinaux, CaseAbstraite> voisins) {
        this.voisins = voisins;
    }

    @Override
    public void update() {
        this.ChangerAction(EAction.Rien);
    }

    public void afficherInfos() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return nom + " case " + caseCourante.toString() + " pv " + pointsDeVie;
        /*return "Personnage{" +
                "caseCourante=" + caseCourante +
                ", objet=" + objet +
                ", nom='" + nom + '\'' +
                ", groupe='" + groupe + '\'' +
                ", pointsDeVie=" + pointsDeVie +
                ", force=" + force +
                ", vitesse=" + vitesse +
                ", portee=" + portee +
                ", action=" + action +
                ", Action=" + Action +
                ", voisinsActuels=" + voisinsActuels +
                ", etatCourant=" + etatCourant +
                ", voisins=" + voisins +
                '}';*/
    }
}

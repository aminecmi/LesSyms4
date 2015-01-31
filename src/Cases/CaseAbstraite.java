package Cases;

import Objets.ObjetAbstrait;
import Person.Personnage;

import java.util.HashMap;

public abstract class CaseAbstraite {

	protected Personnage occupant;
    protected ObjetAbstrait objetOccupant;


    HashMap<PointsCardinaux, CaseAbstraite> voisins;

    Coordonnees coord;

    public CaseAbstraite(int vert, int hor) {
        coord = new Coordonnees(vert, hor);

        // peupler ici ?
        voisins = new HashMap<PointsCardinaux, CaseAbstraite>();

        occupant = null;
        objetOccupant= null;
    }

    public void ajouterVoisin(PointsCardinaux p, CaseAbstraite c) {
        voisins.put(p, c);
    }

    public void ajouterOccupant(Personnage occ) {
        this.occupant = occ;
    }
    
    public void ajouterObjet(ObjetAbstrait objet) {
        this.objetOccupant = objet;
    }

    public Personnage getOccupant() {
        return occupant;
    }

    public void setOccupant(Personnage occupant) {
        this.occupant = occupant;
    }

    public ObjetAbstrait getObjetOccupant() {
  		return objetOccupant;
  	}

  	public void setObjetOccupant(ObjetAbstrait objetOccupant) {
  		this.objetOccupant = objetOccupant;
  	}
  	
	public HashMap<PointsCardinaux, CaseAbstraite> getVoisins() {
		return voisins;
	}

	public void setVoisins(HashMap<PointsCardinaux, CaseAbstraite> voisins) {
		this.voisins = voisins;
	}
}
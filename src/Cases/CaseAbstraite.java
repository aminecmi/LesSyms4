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

        voisins = new HashMap<PointsCardinaux, CaseAbstraite>();

        occupant = null;
        objetOccupant= null;
    }

    public void generateVoisins(CaseAbstraite[][] plateau) {
        for (int i = coord.getHor() - 1; i < coord.getHor() + 1; i++) {
            for (int j = coord.getVert() - 1; j < coord.getVert() + 1; j++) {
                if (i > 0 && i < plateau.length && j > 0 && j < plateau[0].length) {
                    if (i == coord.getHor() && j < coord.getVert()) {
                        voisins.put(PointsCardinaux.N, plateau[i][j]);
                    } else if (i > coord.getHor() && j < coord.getVert()) {
                        voisins.put(PointsCardinaux.NE, plateau[i][j]);
                    } else if (i > coord.getHor() && j == coord.getVert()) {
                        voisins.put(PointsCardinaux.E, plateau[i][j]);
                    } else if (i > coord.getHor() && j > coord.getVert()) {
                        voisins.put(PointsCardinaux.NE, plateau[i][j]);
                    } else if (i == coord.getHor() && j > coord.getVert()) {
                        voisins.put(PointsCardinaux.S, plateau[i][j]);
                    } else if (i < coord.getHor() && j > coord.getVert()) {
                        voisins.put(PointsCardinaux.SW, plateau[i][j]);
                    } else if (i < coord.getHor() && j == coord.getVert()) {
                        voisins.put(PointsCardinaux.W, plateau[i][j]);
                    } else if (i < coord.getHor() && j < coord.getVert()) {
                        voisins.put(PointsCardinaux.NW, plateau[i][j]);
                    }
                }
            }
        }
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
package Cases;

import Cases.utils.Coordonnees;
import Cases.utils.PointsCardinaux;
import Objets.ObjetAbstrait;
import Person.Personnage;

import java.util.HashMap;

public abstract class CaseAbstraite {

    private Personnage occupant;
    private ObjetAbstrait objetOccupant;


    private HashMap<PointsCardinaux, CaseAbstraite> voisins;

    private Coordonnees coord;

    CaseAbstraite(int vert, int hor) {
        coord = new Coordonnees(vert, hor);

        voisins = new HashMap<PointsCardinaux, CaseAbstraite>();

        occupant = null;
        objetOccupant= null;
    }

    public void generateVoisins(CaseAbstraite[][] plateau) {
        for (int i = coord.getLigne() - 1; i <= coord.getLigne() + 1; i++) {
            for (int j = coord.getCol() - 1; j <= coord.getCol() + 1; j++) {
                if (i >= 0 && i < plateau.length && j >= 0 && j < plateau[0].length) {
                    if (i < coord.getLigne() && j == coord.getCol()) {
                        voisins.put(PointsCardinaux.N, plateau[i][j]);
                    } else if (i < coord.getLigne() && j > coord.getCol()) {
                        voisins.put(PointsCardinaux.NE, plateau[i][j]);
                    } else if (i == coord.getLigne() && j > coord.getCol()) {
                        voisins.put(PointsCardinaux.E, plateau[i][j]);
                    } else if (i > coord.getLigne() && j > coord.getCol()) {
                        voisins.put(PointsCardinaux.SE, plateau[i][j]);
                    } else if (i > coord.getLigne() && j == coord.getCol()) {
                        voisins.put(PointsCardinaux.S, plateau[i][j]);
                    } else if (i > coord.getLigne() && j < coord.getCol()) {
                        voisins.put(PointsCardinaux.SW, plateau[i][j]);
                    } else if (i == coord.getLigne() && j < coord.getCol()) {
                        voisins.put(PointsCardinaux.W, plateau[i][j]);
                    } else if (i < coord.getLigne() && j < coord.getCol()) {
                        voisins.put(PointsCardinaux.NW, plateau[i][j]);
                    }
                }
            }
        }
    }

    public void ajouterOccupant(Personnage occ) {
        this.occupant = occ;
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

    public String affichageSpecial() {
        return " ";
    }
}
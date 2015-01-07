package Cases;

import Person.Personnage;

import java.util.HashMap;

public abstract class CaseAbstraite {
    Personnage occupant;

    HashMap<PointsCardinaux, CaseAbstraite> voisins;

    Coordonnees coord;

    public CaseAbstraite(int vert, int hor) {
        coord = new Coordonnees(vert, hor);

        // peupler ici ?
        voisins = new HashMap<PointsCardinaux, CaseAbstraite>();

        occupant = null;
    }

    public void ajouterVoisin(PointsCardinaux p, CaseAbstraite c) {
        voisins.put(p, c);
    }

    public void ajouterOccupant(Personnage occ) {
        this.occupant = occ;
    }

    public Personnage getOccupant() {
        return occupant;
    }
}
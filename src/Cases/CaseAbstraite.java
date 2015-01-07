package Cases;

import java.util.HashMap;

public abstract class CaseAbstraite {

    HashMap<PointsCardinaux, CaseAbstraite> voisins;

    Coordonnees coord;

    public CaseAbstraite(int vert, int hor) {
        coord = new Coordonnees(vert, hor);

        // peupler ici ?
        voisins = new HashMap<PointsCardinaux, CaseAbstraite>();
    }

    public void ajouterVoisin(PointsCardinaux p, CaseAbstraite c) {
        voisins.put(p, c);
    }
}

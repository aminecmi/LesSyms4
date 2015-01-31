package Comportements;

import Cases.CaseAbstraite;
import Cases.PointsCardinaux;
import Cases.RandomPointCardinal;
import Person.Personnage;

import java.util.HashMap;

public class ComportementActionSeDeplacer implements ComportementAction  {

	@Override
    public void executerAction(Personnage perso) {
        CaseAbstraite c = perso.getCaseCourante();
        HashMap<PointsCardinaux, CaseAbstraite> voisins = c.getVoisins();
        RandomPointCardinal<PointsCardinaux> p = new RandomPointCardinal<PointsCardinaux>(PointsCardinaux.class);
        PointsCardinaux point = null;
        do {
            point = p.random();
        } while (voisins.get(point) == null);
        CaseAbstraite destination = voisins.get(point);
        destination.setOccupant(perso);
        perso.setCaseCourante(destination);
        c.setOccupant(null);
    }

}

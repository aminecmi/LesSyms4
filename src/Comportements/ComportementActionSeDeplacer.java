package Comportements;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;
import Person.Personnage;
import utils.Tuple;

import java.util.ArrayList;
import java.util.Random;

public class ComportementActionSeDeplacer implements ComportementAction  {

	@Override
    public void executerAction(Personnage perso, Tuple<ArrayList<Personnage>, ArrayList<ObjetAbstrait>, ArrayList<CaseAbstraite>> t) {
        ArrayList<CaseAbstraite> cases = t.c;
        ArrayList<ObjetAbstrait> objs = t.o;

        CaseAbstraite c = perso.getCaseCourante();
        c.setOccupant(null);

        CaseAbstraite destination;
        if (objs.isEmpty()) {
            int size = cases.size();
            int item = new Random().nextInt(size);
            destination = cases.get(item);
        } else {
            int size = objs.size();
            int item = new Random().nextInt(size);
            destination = objs.get(item).getCaseCourante();
            objs.get(item).setCaseCourante(null);
            destination.setObjetOccupant(null);
            perso.setObjet(objs.get(item));
        }
        destination.setOccupant(perso);
        perso.setCaseCourante(destination);
    }

}

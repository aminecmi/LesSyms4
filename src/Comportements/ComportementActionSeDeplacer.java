package Comportements;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;
import Person.Personnage;
import utils.Tuple;

import java.util.ArrayList;
import java.util.Random;

public class ComportementActionSeDeplacer implements ComportementAction  {

	@Override
    public void executerAction(Personnage perso, Tuple<ArrayList<ObjetAbstrait>, ArrayList<Personnage>, ArrayList<CaseAbstraite>> t) {
        ArrayList<CaseAbstraite> cases = t.c;
        int size = cases.size();
        int item = new Random().nextInt(size);
        System.out.println("Je suis en " + perso.getCaseCourante().getCoord().toString());

        CaseAbstraite c = perso.getCaseCourante();

        CaseAbstraite destination = cases.get(item);
        destination.setOccupant(perso);
        perso.setCaseCourante(destination);
        c.setOccupant(null);
        System.out.println("Je suis en " + perso.getCaseCourante().getCoord().toString());

    }

}

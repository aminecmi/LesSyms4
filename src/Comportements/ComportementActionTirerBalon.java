package Comportements;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;
import Objets.ObjetBallon;
import Person.Personnage;
import Person.PersonnageFootball;
import utils.Tuple;

import java.util.ArrayList;
import java.util.Random;

public class ComportementActionTirerBalon implements ComportementAction  {

    @Override
    public void executerAction(Personnage joueur, Tuple<ArrayList<Personnage>, ArrayList<ObjetAbstrait>, ArrayList<CaseAbstraite>> t) {
        ArrayList<CaseAbstraite> cases = (ArrayList<CaseAbstraite>) t.c.clone();
        ArrayList<PersonnageFootball> persos = (ArrayList<PersonnageFootball>) t.p.clone();

        PersonnageFootball j = (PersonnageFootball) joueur;

        for (PersonnageFootball personnage : persos) {
            if (j.getEquipe() != personnage.getEquipe()) {
                cases.remove(personnage.getCaseCourante());
            }
        }

        CaseAbstraite dest = null;
        for (CaseAbstraite c : cases) {
            if (c.getObjetOccupant() != null) {
                dest = c;
            }
        }

        if (dest == null || j.getCaseCourante().getObjetOccupant() != null) {
            int size = cases.size();
            int item = new Random().nextInt(size);
            dest = cases.get(item);
        }
        if (j.getCaseCourante().getObjetOccupant() != null) {
            j.lancerBallon((ObjetBallon) dest.getObjetOccupant(), cases);
        }
        joueur.getCaseCourante().setOccupant(null);
        joueur.setCaseCourante(dest);
        dest.setOccupant(joueur);

        if (j.getCaseCourante().getObjetOccupant() != null) {
            j.lancerBallon((ObjetBallon) dest.getObjetOccupant(), cases);
        }
    }
}

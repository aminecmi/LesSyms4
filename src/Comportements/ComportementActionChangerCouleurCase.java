package Comportements;

import Cases.CaseAbstraite;
import Cases.CaseColore;
import Objets.ObjetAbstrait;
import Person.Personnage;
import Person.PersonnageBattleZone;
import utils.Tuple;

import java.util.ArrayList;
import java.util.Random;

public class ComportementActionChangerCouleurCase implements ComportementAction {

    @Override
    public void executerAction(Personnage p, Tuple<ArrayList<ObjetAbstrait>, ArrayList<Personnage>, ArrayList<CaseAbstraite>> t) {
        ArrayList<CaseAbstraite> cases = t.c;
        int size = cases.size();
        int item = new Random().nextInt(size);
        CaseColore caseColore = (CaseColore) p.getCaseCourante();
        PersonnageBattleZone personnage = (PersonnageBattleZone) p;
        caseColore.setOccupant(null);

        CaseColore dest = (CaseColore) cases.get(item);
        dest.setOccupant(p);
        p.setCaseCourante(dest);

        dest.setCouleur(personnage.getCouleur());

    }
}

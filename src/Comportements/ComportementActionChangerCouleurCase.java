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
    public void executerAction(Personnage p, Tuple<ArrayList<Personnage>, ArrayList<ObjetAbstrait>, ArrayList<CaseAbstraite>> t) {
        ArrayList<CaseColore> cases = (ArrayList<CaseColore>) t.c.clone();
        ArrayList<Personnage> persos = (ArrayList<Personnage>) t.p.clone();

        for (Personnage personnage : persos) {
            cases.remove(personnage.getCaseCourante());
        }

        PersonnageBattleZone pb = (PersonnageBattleZone) p;
        ArrayList<CaseColore> remove = new ArrayList<CaseColore>();
        for (CaseColore ca : cases) {
            if (ca.getCouleur().equals(pb.getCouleur())) {
                remove.add(ca);
            }
        }
        cases.removeAll(remove);

        int size = cases.size();
        int item = new Random().nextInt(size);
        CaseColore caseColore = (CaseColore) p.getCaseCourante();
        caseColore.setOccupant(null);

        CaseColore dest = cases.get(item);
        dest.setOccupant(p);
        p.setCaseCourante(dest);

        dest.setCouleur(pb.getCouleur());

    }
}

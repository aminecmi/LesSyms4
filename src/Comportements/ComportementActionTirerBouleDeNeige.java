package Comportements;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;
import Person.Personnage;
import Person.PersonnageBattleSnow;
import utils.Tuple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class ComportementActionTirerBouleDeNeige implements ComportementAction  {

    @Override
    public void executerAction(Personnage joueur, Tuple<ArrayList<Personnage>, ArrayList<ObjetAbstrait>, ArrayList<CaseAbstraite>> t) {

        ArrayList<CaseAbstraite> cases = (ArrayList<CaseAbstraite>) t.c.clone();
        ArrayList<PersonnageBattleSnow> persos = (ArrayList<PersonnageBattleSnow>) t.p.clone();
        boolean attack = false;
        PersonnageBattleSnow cible = null;
        PersonnageBattleSnow j = (PersonnageBattleSnow) joueur;

        CaseAbstraite dest;
        if (!persos.isEmpty()) {
            int size = persos.size();
            int item = new Random().nextInt(size);
            cible = persos.get(item);
            Collection<CaseAbstraite> voisinsArray = cible.getVoisins().values();
            CaseAbstraite[] toto = new CaseAbstraite[0];
            CaseAbstraite[] voisins = voisinsArray.toArray(toto);
            dest = voisins[(new Random().nextInt(voisins.length))];
            attack = true;
        } else {
            int size = cases.size();
            int item = new Random().nextInt(size);
            dest = cases.get(item);
        }


        joueur.getCaseCourante().setOccupant(null);
        joueur.setCaseCourante(dest);
        dest.setOccupant(joueur);

        if (attack) {
            j.attack(cible);
        }


    }
}

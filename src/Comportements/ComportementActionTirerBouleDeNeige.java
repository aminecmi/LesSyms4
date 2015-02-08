package Comportements;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;
import Person.Personnage;
import Person.PersonnageBattleSnow;
import utils.Tuple;

import java.util.ArrayList;
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
            ArrayList<CaseAbstraite> voisins = (ArrayList<CaseAbstraite>) cible.getVoisins().values();
            dest = voisins.get(new Random().nextInt(voisins.size()));
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

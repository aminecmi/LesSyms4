package Fabriques.Personnages;

import Observateur.Organisation;
import Person.Personnage;
import Person.PersonnageBattleZone;

import java.util.ArrayList;

public class FabriquePersonnagesBattleZone extends FabriquePersonnagesAbstraite {
    @Override
    public ArrayList<Personnage> CreerPersonages(Organisation o) {
        ArrayList<Personnage> list = new ArrayList<Personnage>();

        PersonnageBattleZone p1 = new PersonnageBattleZone(null, "P1");
        list.add(p1);
        PersonnageBattleZone p2 = new PersonnageBattleZone(null, "P2");
        list.add(p2);
        PersonnageBattleZone p3 = new PersonnageBattleZone(null, "P3");
        list.add(p3);
        PersonnageBattleZone p4 = new PersonnageBattleZone(null, "P4");
        list.add(p4);
        return list;
    }
}

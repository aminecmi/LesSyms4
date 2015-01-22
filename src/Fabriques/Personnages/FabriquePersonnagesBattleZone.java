package Fabriques.Personnages;

import Observateur.Organisation;
import Person.Personnage;
import Person.PersonnageBattleZone;

import java.util.ArrayList;

public class FabriquePersonnagesBattleZone extends FabriquePersonnagesAbstraite {
    @Override
    public ArrayList<Personnage> CreerPersonages(Organisation o) {
        ArrayList<Personnage> list = new ArrayList<Personnage>();

        PersonnageBattleZone p1 = new PersonnageBattleZone("Bob",100.0,1.0,1.0);
        list.add(p1);
        PersonnageBattleZone p2 = new PersonnageBattleZone("Jo",100.0,1.0,1.0);
        list.add(p2);
        PersonnageBattleZone p3 = new PersonnageBattleZone("Max",100.0,1.0,1.0);
        list.add(p3);
        PersonnageBattleZone p4 = new PersonnageBattleZone("Zac",100.0,1.0,1.0);
        list.add(p4);
        return list;
    }
}

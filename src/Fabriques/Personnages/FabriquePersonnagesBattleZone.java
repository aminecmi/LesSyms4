package Fabriques.Personnages;

import Cases.CaseAbstraite;
import Comportements.ComportementAction;
import Comportements.ComportementActionChangerCouleurCase;
import Person.Personnage;
import Person.PersonnageBattleZone;

import java.util.ArrayList;

public class FabriquePersonnagesBattleZone extends FabriquePersonnagesAbstraite {
    protected ComportementAction parDefaut = new ComportementActionChangerCouleurCase();

    @Override
    public ArrayList<Personnage> CreerPersonages(CaseAbstraite[][] plateau) {
        ArrayList<Personnage> list = new ArrayList<Personnage>();

        PersonnageBattleZone p1 = new PersonnageBattleZone("Bob", 100.0, 1.0, 1.0, 2, parDefaut);
        list.add(p1);
        PersonnageBattleZone p2 = new PersonnageBattleZone("Jo", 100.0, 1.0, 1.0, 2, parDefaut);
        list.add(p2);
        PersonnageBattleZone p3 = new PersonnageBattleZone("Max", 100.0, 1.0, 1.0, 2, parDefaut);
        list.add(p3);
        PersonnageBattleZone p4 = new PersonnageBattleZone("Zac", 100.0, 1.0, 1.0, 2, parDefaut);
        list.add(p4);

        this.placement(list, plateau);
        return list;
    }
}

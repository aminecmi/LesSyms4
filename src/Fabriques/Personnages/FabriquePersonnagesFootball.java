package Fabriques.Personnages;

import Cases.CaseAbstraite;
import Comportements.ComportementAction;
import Comportements.ComportementActionTirerBalon;
import Composition.EquipeDeFoot;
import Composition.PersonnagesAbstraits;
import Observateur.Arbitre;
import Person.Personnage;
import Person.PersonnageFootball;

import java.util.ArrayList;

public class FabriquePersonnagesFootball extends FabriquePersonnagesAbstraite {
    private final ComportementAction parDefaut = new ComportementActionTirerBalon();
    public Arbitre a;

    @Override
    public ArrayList<Personnage> CreerPersonages(CaseAbstraite[][] plateau) {
        ArrayList<Personnage> list = new ArrayList<Personnage>();

        ArrayList<Personnage> l1 = new ArrayList<Personnage>();
        ArrayList<Personnage> l2 = new ArrayList<Personnage>();

        PersonnageFootball p1 = new PersonnageFootball("Bob", 100.0, 1.0, 1.0, 2, parDefaut);
        list.add(p1);
        l1.add(p1);
        PersonnageFootball p2 = new PersonnageFootball("Jo", 100.0, 1.0, 1.0, 2, parDefaut);
        list.add(p2);
        l1.add(p2);
        PersonnageFootball p3 = new PersonnageFootball("Max", 100.0, 1.0, 1.0, 2, parDefaut);
        list.add(p3);
        l2.add(p3);
        PersonnageFootball p4 = new PersonnageFootball("Zac", 100.0, 1.0, 1.0, 2, parDefaut);
        list.add(p4);
        l2.add(p4);

        EquipeDeFoot e1 = new EquipeDeFoot(l1, "E1");
        EquipeDeFoot e2 = new EquipeDeFoot(l2, "E2");

        for (PersonnagesAbstraits p : e1.getList()) {
            PersonnageFootball pf = (PersonnageFootball) p;
            pf.setEquipe(e1);
        }

        for (PersonnagesAbstraits p : e2.getList()) {
            PersonnageFootball pf = (PersonnageFootball) p;
            pf.setEquipe(e2);
        }

        this.placement(list, plateau);
        return list;
    }
}

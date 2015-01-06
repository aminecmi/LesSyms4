package Fabriques.Personnages;

import Observateur.Organisation;
import Person.Chevalier;
import Person.Fantasssin;
import Person.Personnage;
import Person.Princesse;

import java.util.ArrayList;

public class FabriquePersonnagesFootball extends FabriquePersonnagesAbstraite {

    @Override
    public ArrayList<Personnage> CreerPersonages(Organisation o) {
        Princesse p = new Princesse("Fiona");
        Chevalier z = new Chevalier(o, "Zodiac");
        Fantasssin f = new Fantasssin(o, "Fantastic");

        ArrayList<Personnage> liste = new ArrayList<Personnage>();
        liste.add(p);
        liste.add(z);
        liste.add(f);
        return liste;
    }
}

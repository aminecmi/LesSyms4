package Fabriques.Personnages;

import Observateur.Organisation;
import Person.Personnage;

import java.util.ArrayList;

public class FabriquePersonnagesMoyenAge extends FabriquePersonnagesAbstraite {

    @Override
    public ArrayList<Personnage> CreerPersonages(Organisation o) {
/*        Princesse p = new Princesse("Fiona");
        Chevalier z = new Chevalier(o, "Zodiac");
        Fantasssin f = new Fantasssin(o, "Fantastic");

        ArrayList<Personnage> liste = new ArrayList<Personnage>();
        liste.add(p);
        liste.add(z);
        liste.add(f);*/
        ArrayList<Personnage> liste = new ArrayList<Personnage>();
        return liste;
    }
}

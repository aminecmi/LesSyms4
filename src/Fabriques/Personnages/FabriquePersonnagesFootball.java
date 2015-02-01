package Fabriques.Personnages;

import Cases.CaseAbstraite;
import Comportements.ComportementAction;
import Comportements.ComportementActionTirerBalon;
import Observateur.Organisation;
import Person.Personnage;

import java.util.ArrayList;

public class FabriquePersonnagesFootball extends FabriquePersonnagesAbstraite {
    ComportementAction parDefaut = new ComportementActionTirerBalon();

    @Override
    public ArrayList<Personnage> CreerPersonages(Organisation o, CaseAbstraite[][] plateau) {

        // TODO: Add players to team 1


        // TODO: Add team 2
    	
    	// TODO: Add players to team 2
    	
    	/*
        Princesse p = new Princesse("Fiona");
        Chevalier z = new Chevalier(o, "Zodiac");
        Fantasssin f = new Fantasssin(o, "Fantastic");

        ArrayList<Personnage> liste = new ArrayList<Personnage>();
        liste.add(p);
        liste.add(z);
        liste.add(f);
        return liste;
        */
    	
    	// TODO: Return two teams containg all players
    	return null;
    }
}

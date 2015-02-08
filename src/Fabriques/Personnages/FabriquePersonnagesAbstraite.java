package Fabriques.Personnages;

import Cases.CaseAbstraite;
import Person.Personnage;

import java.util.ArrayList;
import java.util.Random;

abstract public class FabriquePersonnagesAbstraite {
    public abstract ArrayList<Personnage> CreerPersonages(CaseAbstraite[][] plateau);

    void placement(ArrayList<Personnage> personnages, CaseAbstraite[][] plateau) {
        Random rand = new Random();
        for (Personnage p : personnages) {
            int x = rand.nextInt(plateau.length);
            int y = rand.nextInt(plateau[x].length);
            p.setCaseCourante(plateau[x][y]);
            plateau[x][y].ajouterOccupant(p);
        }
    }
}

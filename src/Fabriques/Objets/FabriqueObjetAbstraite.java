package Fabriques.Objets;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;

import java.util.ArrayList;
import java.util.Random;

abstract public class FabriqueObjetAbstraite {
    public abstract ArrayList<ObjetAbstrait> creerObjets(CaseAbstraite[][] plateau);

    void placement(ArrayList<ObjetAbstrait> objets, CaseAbstraite[][] plateau) {
        Random rand = new Random();
        for (ObjetAbstrait o : objets) {
            int x = rand.nextInt(plateau.length);
            int y = rand.nextInt(plateau[x].length);
            o.setCaseCourante(plateau[x][y]);
            plateau[x][y].setObjetOccupant(o);
        }
    }
}

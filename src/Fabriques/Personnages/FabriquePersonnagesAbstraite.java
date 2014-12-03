package Fabriques.Personnages;

import Observateur.Organisation;
import Person.Personnage;

import java.util.ArrayList;

abstract public class FabriquePersonnagesAbstraite {
    public abstract ArrayList<Personnage> CreerPersonages(Organisation o);
}

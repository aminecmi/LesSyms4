package Fabriques.Objets;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;

import java.util.ArrayList;

abstract public class FabriqueObjetAbstraite {
    public abstract ArrayList<ObjetAbstrait> creerObjets(CaseAbstraite[][] plateau);
}

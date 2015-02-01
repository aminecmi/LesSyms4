package Fabriques.Objets;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;

import java.util.ArrayList;

public class FabriqueObjetBattleZone extends FabriqueObjetAbstraite {
    @Override
    public ArrayList<ObjetAbstrait> creerObjets(CaseAbstraite[][] plateau) {
        return new ArrayList<ObjetAbstrait>();
    }

}

package Fabriques.Objets;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;
import Objets.ObjetBallon;

import java.util.ArrayList;

public class FabriqueObjetFootball extends FabriqueObjetAbstraite {
    @Override
    public ArrayList<ObjetAbstrait> creerObjets(CaseAbstraite[][] plateau) {
        ArrayList<ObjetAbstrait> objs = new ArrayList<ObjetAbstrait>();
        objs.add(new ObjetBallon());
        this.placement(objs, plateau);
        return objs;
    }
}

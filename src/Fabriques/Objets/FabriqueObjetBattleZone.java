package Fabriques.Objets;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;
import Objets.ObjetAvecBonusForce;
import Objets.ObjetAvecBonusPV;
import Objets.ObjetAvecBonusVitesse;

import java.util.ArrayList;
import java.util.Random;

public class FabriqueObjetBattleZone extends FabriqueObjetAbstraite {
    @Override
    public ArrayList<ObjetAbstrait> creerObjets(CaseAbstraite[][] plateau) {
        ArrayList<ObjetAbstrait> objs = new ArrayList<ObjetAbstrait>();
        if (new Random().nextInt(3) == 1) {
            objs.add(new ObjetAvecBonusPV("Potion", 10, 10, 10));
        }
        if (new Random().nextInt(3) == 2) {
            objs.add(new ObjetAvecBonusVitesse("Etoile", 10, 10, 10));

        }
        if (new Random().nextInt(3) == 3) {
            objs.add(new ObjetAvecBonusForce("Marteau", 10, 10, 10));
        }
        return objs;
    }
}

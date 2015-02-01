package Fabriques.Scenario;

import Cases.CaseAbstraite;
import Fabriques.Objets.FabriqueObjetBattleZone;
import Fabriques.Personnages.FabriquePersonnagesBattleZone;
import Fabriques.Plateau.FabriquePlateauBattleZone;
import Objets.ObjetAbstrait;

import java.util.Random;

public class FabriqueScenarioBattleZone extends FabriqueScenarioAbstraite {
    public FabriqueScenarioBattleZone(FabriquePlateauBattleZone pl, FabriquePersonnagesBattleZone pr, FabriqueObjetBattleZone obj) {
        super(pl, pr, obj);
    }

    @Override
    public void tourParTour(CaseAbstraite[][] plateau) {
        if (new Random().nextInt(3) == 1) {
            for (ObjetAbstrait o : this.creerObjets(plateau)) {
                placementObjet(o, plateau);
            }
        }
    }

    private void placementObjet(ObjetAbstrait o, CaseAbstraite[][] plateau) {
        Random rand = new Random();
        int x = rand.nextInt(plateau.length);
        int y = rand.nextInt(plateau[x].length);
        o.setCaseCourante(plateau[x][y]);
        plateau[x][y].setObjetOccupant(o);
    }
}

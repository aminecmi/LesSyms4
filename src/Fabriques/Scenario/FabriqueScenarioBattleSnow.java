package Fabriques.Scenario;

import Cases.CaseAbstraite;
import Fabriques.Objets.FabriqueObjetBattleSnow;
import Fabriques.Personnages.FabriquePersonnagesBattleSnow;
import Fabriques.Plateau.FabriquePlateauBattleSnow;
import Objets.ObjetAbstrait;

import java.util.Random;

public class FabriqueScenarioBattleSnow extends FabriqueScenarioAbstraite {
    public FabriqueScenarioBattleSnow(FabriquePlateauBattleSnow pl, FabriquePersonnagesBattleSnow pr, FabriqueObjetBattleSnow fObjs) {
        super(pl, pr, fObjs);
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

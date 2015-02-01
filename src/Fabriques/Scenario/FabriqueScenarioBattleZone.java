package Fabriques.Scenario;

import Cases.CaseAbstraite;
import Fabriques.Objets.FabriqueObjetBattleZone;
import Fabriques.Personnages.FabriquePersonnagesBattleZone;
import Fabriques.Plateau.FabriquePlateauBattleZone;

public class FabriqueScenarioBattleZone extends FabriqueScenarioAbstraite {
    public FabriqueScenarioBattleZone(FabriquePlateauBattleZone pl, FabriquePersonnagesBattleZone pr, FabriqueObjetBattleZone obj) {
        super(pl, pr, obj);
    }

    @Override
    public void tourParTour(CaseAbstraite[][] plateau) {

    }
}

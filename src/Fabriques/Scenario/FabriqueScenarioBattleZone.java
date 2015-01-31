package Fabriques.Scenario;

import Fabriques.Personnages.FabriquePersonnagesBattleZone;
import Fabriques.Plateau.FabriquePlateauBattleZone;

public class FabriqueScenarioBattleZone extends FabriqueScenarioAbstraite {
    public FabriqueScenarioBattleZone(FabriquePlateauBattleZone pl, FabriquePersonnagesBattleZone pr) {
        super(pl, pr);
    }
}

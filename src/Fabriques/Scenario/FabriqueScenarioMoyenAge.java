package Fabriques.Scenario;

import Fabriques.Personnages.FabriquePersonnagesAbstraite;
import Fabriques.Plateau.FabriquePlateauAbstraite;

public class FabriqueScenarioMoyenAge extends FabriqueScenarioAbstraite {
    public FabriqueScenarioMoyenAge(FabriquePlateauAbstraite pl, FabriquePersonnagesAbstraite pr) {
        super(pl, pr);
    }
}

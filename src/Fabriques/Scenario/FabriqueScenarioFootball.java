package Fabriques.Scenario;

import Cases.CaseAbstraite;
import Fabriques.Objets.FabriqueObjetFootball;
import Fabriques.Personnages.FabriquePersonnagesFootball;
import Fabriques.Plateau.FabriquePlateauFootball;

public class FabriqueScenarioFootball extends FabriqueScenarioAbstraite {
    public FabriqueScenarioFootball(FabriquePlateauFootball pl, FabriquePersonnagesFootball pr, FabriqueObjetFootball fObjs) {
        super(pl, pr, fObjs);
    }

    @Override
    public void tourParTour(CaseAbstraite[][] plateau) {

    }
}

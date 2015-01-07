package Fabriques.Scenario;

import Cases.CaseAbstraite;
import Fabriques.Personnages.FabriquePersonnagesAbstraite;
import Fabriques.Plateau.FabriquePlateauAbstraite;
import Observateur.Organisation;
import Person.Personnage;

import java.util.ArrayList;

public class FabriqueScenarioAbstraite {
    FabriquePlateauAbstraite fPlateau;
    FabriquePersonnagesAbstraite fPersonnages;

    public FabriqueScenarioAbstraite(FabriquePlateauAbstraite pl, FabriquePersonnagesAbstraite pr) {
        this.fPlateau = pl;
        this.fPersonnages = pr;
    }

    public ArrayList<Personnage> CreerPersonnages(Organisation o) {
        return this.fPersonnages.CreerPersonages(o);
    }

    public CaseAbstraite[][] CreerPlateau() {
        return this.fPlateau.CreerPlateau();
    }
}

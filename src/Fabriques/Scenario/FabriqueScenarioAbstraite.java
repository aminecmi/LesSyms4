package Fabriques.Scenario;

import Cases.CaseAbstraite;
import Fabriques.Objets.FabriqueObjetAbstraite;
import Fabriques.Personnages.FabriquePersonnagesAbstraite;
import Fabriques.Plateau.FabriquePlateauAbstraite;
import Objets.ObjetAbstrait;
import Observateur.Organisation;
import Person.Personnage;

import java.util.ArrayList;

public abstract class FabriqueScenarioAbstraite {
    FabriquePlateauAbstraite fPlateau;
    FabriquePersonnagesAbstraite fPersonnages;
    FabriqueObjetAbstraite fObjs;

    public FabriqueScenarioAbstraite(FabriquePlateauAbstraite pl, FabriquePersonnagesAbstraite pr, FabriqueObjetAbstraite fObjs) {
        this.fPlateau = pl;
        this.fPersonnages = pr;
        this.fObjs = fObjs;
    }

    public ArrayList<Personnage> CreerPersonnages(Organisation o, CaseAbstraite[][] plateau) {
        return this.fPersonnages.CreerPersonages(o, plateau);
    }

    public CaseAbstraite[][] CreerPlateau() {
        return this.fPlateau.CreerPlateau();
    }

    public ArrayList<ObjetAbstrait> creerObjets(CaseAbstraite[][] plateau) {
        return this.fObjs.creerObjets(plateau);
    }

    public abstract void tourParTour(CaseAbstraite[][] plateau);
}

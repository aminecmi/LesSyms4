import Fabriques.Scenario.FabriqueScenarioAbstraite;
import Observateur.Organisation;
import Person.Personnage;
import Person.eMode;

import java.util.ArrayList;

public class SimulationJeu {
    ArrayList<Personnage> liste;
    Organisation o;
    FabriqueScenarioAbstraite f;

    public SimulationJeu(FabriqueScenarioAbstraite fb) {
        f = fb;
        liste = new ArrayList<Personnage>();
    }

    public String afficheTous() {
        StringBuilder result = new StringBuilder();
        for(Personnage p: liste) {
            result.append(p.getNom());
            result.append(System.getProperty("line.separator"));
        }
        return result.toString();
    }

    public void creationPersonnages() {
        o = new Organisation();
        liste = f.CreerPersonnages(o);
    }

    public String emmetreUnSonTous() {
        StringBuilder result = new StringBuilder();
        for (Personnage p: liste) {
            result.append(System.getProperty("line.separator"));
        }
        return result.toString();
    }

    public String lancerCombar() {
        StringBuilder result = new StringBuilder();
        for (Personnage p: liste) {
            result.append(System.getProperty("line.separator"));
        }
        return result.toString();
    }

    public void changerEtat(eMode etat) {
        this.o.setModeFonctionnement(etat);
    }
}

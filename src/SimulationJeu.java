import Cases.CaseAbstraite;
import Fabriques.Scenario.FabriqueScenarioAbstraite;
import Observateur.Arbitre;
import Person.Personnage;
import utils.InterfaceConsole;

import java.util.ArrayList;
import java.util.Scanner;


public class SimulationJeu {
    ArrayList<Personnage> personnages;
    CaseAbstraite[][] plateau;
    FabriqueScenarioAbstraite f;
    InterfaceConsole intefaceC;
    Arbitre a;

    public SimulationJeu(FabriqueScenarioAbstraite fb) {
        f = fb;
        personnages = new ArrayList<Personnage>();
        plateau = f.CreerPlateau();

        personnages = f.CreerPersonnages(plateau);

        f.creerObjets(plateau);

        intefaceC = new InterfaceConsole(plateau);

        a = new Arbitre();
    }

    public void afficheTous() {
        System.out.println("");
        intefaceC.afficherPlateau();
    }

    public void recupererInformations() {
        for (Personnage p : personnages) {

        }
    }

    public void lancerJeu() {
        for (Personnage p : personnages) {
            a.attach(p);
        }

        boolean continuer = true;
        afficheTous();
        while (continuer) {
            a.update();
            for (Personnage p : personnages) {
                p.Execution(p.AnalyseSituation());
                recupererInformations();
            }
            f.tourParTour(plateau);
            afficheTous();

            // bloquer le tour jusqu'a toucher une touche du clavier.
            Scanner s = new Scanner(System.in);
            String choix = s.nextLine();
            if (choix == "s") {
                continuer = false;
            }
        }

    }
}

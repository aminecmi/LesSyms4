import Cases.CaseAbstraite;
import Fabriques.Scenario.FabriqueScenarioAbstraite;
import Objets.ObjetAbstrait;
import Observateur.Arbitre;
import Person.Personnage;
import utils.InterfaceConsole;

import java.util.ArrayList;
import java.util.Scanner;


class SimulationJeu {
    private final CaseAbstraite[][] plateau;
    private final FabriqueScenarioAbstraite f;
    private final InterfaceConsole intefaceC;
    private final Arbitre a;
    private ArrayList<Personnage> personnages;

    public SimulationJeu(FabriqueScenarioAbstraite fb) {
        f = fb;
        personnages = new ArrayList<Personnage>();
        plateau = f.CreerPlateau();

        personnages = f.CreerPersonnages(plateau);

        ArrayList<ObjetAbstrait> objs = f.creerObjets(plateau);

        intefaceC = new InterfaceConsole(plateau);

        a = new Arbitre();
    }

    void afficheTous() {
        System.out.println("");
        intefaceC.afficherPlateau();
    }

    void recupererInformations() {
        for (Personnage p : personnages) {
            p.afficherInfos();
        }
    }

    public void lancerJeu() {
        for (Personnage p : personnages) {
            a.attach(p);
        }

        boolean continuer = true;
        afficheTous();
        while (continuer) {
            continuer = a.update();
            recupererInformations();
            for (Personnage p : personnages) {
                p.Execution(p.AnalyseSituation());
            }
            f.tourParTour(plateau);
            afficheTous();

            // bloquer le tour jusqu'a toucher une touche du clavier.
            Scanner s = new Scanner(System.in);
            String choix = s.nextLine();
            if (choix.equals("s")) {
                continuer = false;
            }
        }

    }
}

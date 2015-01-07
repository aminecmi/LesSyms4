import Cases.CaseAbstraite;
import Fabriques.Scenario.FabriqueScenarioAbstraite;
import Observateur.Organisation;
import Person.Personnage;

import java.util.ArrayList;
import java.util.Scanner;

public class SimulationJeu {
    ArrayList<Personnage> personnages;
    CaseAbstraite[][] plateau;
    Organisation o;
    FabriqueScenarioAbstraite f;

    public SimulationJeu(FabriqueScenarioAbstraite fb) {
        f = fb;
        personnages = new ArrayList<Personnage>();
        plateau = f.CreerPlateau();

        // L'organisation dans les personnages. On aura une orga spécifique pour chaque
        o = new Organisation();
        personnages = f.CreerPersonnages(o);

    }

    public void afficheTous() {
        StringBuilder result = new StringBuilder();
        for (Personnage p : personnages) {
            result.append(p.getNom());
            result.append(System.getProperty("line.separator"));
        }
        System.out.println(result.toString());
    }

    public void mediationDesConflits() {
        // TODO ?
    }

    public void recupererInformations() {
        // TODO récup infos + statistics + maj infos observateur ?
    }

    public void lancerJeu() {
        // Todo: positionner les personnages

        boolean continuer = true;
        while (continuer) {
            // Todo propagation des informations
            // Todo Propagation des ordres
            for (Personnage p : personnages) {
                p.AnalyseSituation();
                p.Execution();
                mediationDesConflits();  // utiliser le pattern avec l'historique pour les actions. On pourra faire un retour arrière si conflit + réexecturer
                miseAJour();
                recupererInformations();
            }
            afficheTous();

            // bloquer le tour jusqu'a toucher une touche du clavier.
            Scanner s = new Scanner(System.in);
            s.nextLine();
        }

    }

    private void miseAJour() {
        // Todo

    }

    // Todo Save

    // Todo import
}

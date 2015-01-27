import Cases.CaseAbstraite;
import Fabriques.Scenario.FabriqueScenarioAbstraite;
import Observateur.Organisation;
import Person.Personnage;
import utils.InterfaceConsole;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class SimulationJeu {
    ArrayList<Personnage> personnages;
    CaseAbstraite[][] plateau;
    Organisation o;
    FabriqueScenarioAbstraite f;
    InterfaceConsole intefaceC;

    public SimulationJeu(FabriqueScenarioAbstraite fb) {
        f = fb;
        personnages = new ArrayList<Personnage>();
        plateau = f.CreerPlateau();

        // L'organisation dans les personnages. On aura une orga spécifique pour chaque
        o = new Organisation();
        personnages = f.CreerPersonnages(o);

        intefaceC = new InterfaceConsole(plateau);

    }

    public void afficheTous() {
        /*StringBuilder result = new StringBuilder();
        for (Personnage p : personnages) {
            result.append(p.getNom());
            result.append(System.getProperty("line.separator"));
        }
        System.out.println(result.toString());*/
        intefaceC.afficherPlateau();
    }

    public void mediationDesConflits() {
        // TODO ?
    }

    public void recupererInformations() {
        // TODO récup infos + statistics + maj infos observateur ?
    }

    public void lancerJeu() {
        // users displayng
        Random rand = new Random();
        for (Personnage p : personnages) {
            int x = rand.nextInt(plateau.length);
            int y = rand.nextInt(plateau[x].length);
            p.setCaseCourante(plateau[x][y]);
            plateau[x][y].ajouterOccupant(p);
        }

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
    private void enregistrerSimulation(String NomFichier) {
        // Todo
    	
    	
       //Nous allons commencer notre arborescence en cr�ant la racine XML
	   //qui sera ici "personnes".
	  // static Element racine = new Element("personnes");

	   //On cr�e un nouveau Document JDOM bas� sur la racine que l'on vient de cr�er
	  // static org.jdom.Document document = new Document(racine);
    	   
    	//On cr�e un nouvel Element etudiant et on l'ajoute
        //en tant qu'Element de racine
       // Element etudiant = new Element("etudiant");
        //racine.addContent(etudiant);

        //On cr�e un nouvel Attribut classe et on l'ajoute � etudiant
       //gr�ce � la m�thode setAttribute
       // Attribute classe = new Attribute("classe","P2");
       // etudiant.setAttribute(classe);

        //On cr�e un nouvel Element nom, on lui assigne du texte
        //et on l'ajoute en tant qu'Element de etudiant
        //Element nom = new Element("nom");
       // nom.setText("CynO");
       // etudiant.addContent(nom);

    }

    // Todo import
    private void ChargerSimulation(String NomFichier) {
        // Todo

    }
   
}

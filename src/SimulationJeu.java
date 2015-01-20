import Cases.CaseAbstraite;
import Fabriques.Scenario.FabriqueScenarioAbstraite;
import Observateur.Organisation;
import Person.Personnage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class SimulationJeu {
    ArrayList<Personnage> personnages;
    CaseAbstraite[][] plateau;
    Organisation o;
    FabriqueScenarioAbstraite f;


    public SimulationJeu(FabriqueScenarioAbstraite fb) {
        f = fb;
        personnages = new ArrayList<Personnage>();
        plateau = f.CreerPlateau();

        // L'organisation dans les personnages. On aura une orga spÃ©cifique pour chaque
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
        // TODO rÃ©cup infos + statistics + maj infos observateur ?
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
                mediationDesConflits();  // utiliser le pattern avec l'historique pour les actions. On pourra faire un retour arriÃ¨re si conflit + rÃ©execturer
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
    	
    	
       //Nous allons commencer notre arborescence en créant la racine XML
	   //qui sera ici "personnes".
	  // static Element racine = new Element("personnes");

	   //On crée un nouveau Document JDOM basé sur la racine que l'on vient de créer
	  // static org.jdom.Document document = new Document(racine);
    	   
    	//On crée un nouvel Element etudiant et on l'ajoute
        //en tant qu'Element de racine
       // Element etudiant = new Element("etudiant");
        //racine.addContent(etudiant);

        //On crée un nouvel Attribut classe et on l'ajoute à etudiant
       //grâce à la méthode setAttribute
       // Attribute classe = new Attribute("classe","P2");
       // etudiant.setAttribute(classe);

        //On crée un nouvel Element nom, on lui assigne du texte
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

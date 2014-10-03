import Comportements.ComportementCombat;
import Comportements.ComportementEmmetreSon;
import Person.*;

import java.util.ArrayList;

public class SimulationJeu {
    ArrayList<Personnage> liste;
    Organisation o;

    public SimulationJeu() {
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

    public void changerComportementCombat(Personnage p, ComportementCombat c){
        p.setComportementCombat(c);
    }

    public void changerComportementEmmetreSon(Personnage p, ComportementEmmetreSon c){
        p.setComportementEmmetreSon(c);
    }

    public void creationPersonnages() {
        this.o = new Organisation();
        Princesse p = new Princesse("Fiona");
        Chevalier z = new Chevalier(o, "Zodiac");
        Fantasssin f = new Fantasssin(o, "Fantastic");

        liste.add(p);
        liste.add(z);
        liste.add(f);
    }

    public String emmetreUnSonTous() {
        StringBuilder result = new StringBuilder();
        for (Personnage p: liste) {
            result.append(p.EmmetreSon());
            result.append(System.getProperty("line.separator"));
        }
        return result.toString();
    }

    public String lancerCombar() {
        StringBuilder result = new StringBuilder();
        for (Personnage p: liste) {
            result.append(p.Combattre());
            result.append(System.getProperty("line.separator"));
        }
        return result.toString();
    }

    public void changerEtat(eMode etat) {
        this.o.setModeFonctionnement(etat);
    }
}

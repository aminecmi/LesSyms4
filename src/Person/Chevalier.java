package Person;

import Comportements.ComportementCombatAvecCheval;
import Comportements.ComportementCrier;
import Observateur.Organisation;

public class Chevalier extends Personnage {


    public Chevalier(Organisation etatMajor, String nom) {
        super(etatMajor, nom);
        this.comportementCombat = new ComportementCombatAvecCheval();
        this.comportementEmmetreSon = new ComportementCrier();
    }

    public String getNom() {
        return "Chevalier " + this.nom + " à votre service";
    }

}

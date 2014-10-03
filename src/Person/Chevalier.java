package Person;

import Comportements.ComportementCrier;
import Comportements.ComportementCombatAvecCheval;

public class Chevalier extends Personnage {


    public Chevalier(String nom) {
        super(nom);
        this.comportementCombat = new ComportementCombatAvecCheval();
        this.comportementEmmetreSon = new ComportementCrier();
    }

    public String getNom() {
        return "Chevalier " + this.nom + " à votre service";
    }

}

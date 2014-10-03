package Person;

import Comportements.ComportementParlerCommeUnePrincesse;

public class Princesse extends Personnage {

    public Princesse(String nom) {
        super(null, nom);
        this.comportementEmmetreSon = new ComportementParlerCommeUnePrincesse();
    }

    @Override
    public String getNom() {
        return "Je suis " + this.nom + " princesse des princesses";
    }
}

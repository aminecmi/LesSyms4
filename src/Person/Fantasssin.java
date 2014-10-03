package Person;

import Comportements.ComportementAPiedAvecHache;
import Comportements.ComportementCrier;

public class Fantasssin extends Personnage {
    public Fantasssin(String nom) {
        super(nom);
        this.comportementCombat = new ComportementAPiedAvecHache();
        this.comportementEmmetreSon = new ComportementCrier();
    }

    @Override
    public String getNom() {
        return "Seraffin " + this.nom + ". A vos ordres";
    }
}

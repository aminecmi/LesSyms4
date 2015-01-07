package Person;

import Comportements.ComportementAPiedAvecHache;
import Comportements.ComportementCrier;
import Observateur.Organisation;

public class Fantasssin extends Personnage {
    public Fantasssin(Organisation etatMajor, String nom) {
        super(etatMajor, nom);
        this.comportementCombat = new ComportementAPiedAvecHache();
        this.comportementEmmetreSon = new ComportementCrier();
    }

    @Override
    public String getNom() {
        return "Séraphin " + this.nom + ". A vos ordres";
    }
}

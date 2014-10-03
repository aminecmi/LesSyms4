package Person;

import Comportements.ComportementCombat;
import Comportements.ComportementEmmetreSon;

public abstract class Personnage {
    protected String nom;
    protected ComportementCombat comportementCombat;
    protected ComportementEmmetreSon comportementEmmetreSon;

    protected Personnage(String nom) {
        this.nom = nom;
        this.comportementCombat = null;
        this.comportementEmmetreSon = null;
    }

    public abstract String getNom();

    public void setComportementCombat(ComportementCombat comportementCombat) {
        this.comportementCombat = comportementCombat;
    }

    public void setComportementEmmetreSon(ComportementEmmetreSon comportementEmmetreSon) {
        this.comportementEmmetreSon = comportementEmmetreSon;
    }

    public ComportementEmmetreSon getComportementEmmetreSon() {
        return comportementEmmetreSon;
    }

    public String EmmetreSon() {
        return this.comportementEmmetreSon.emmetreSon();
    }

    public String Combattre() {
        if (this.comportementCombat != null)
            return this.comportementCombat.combattre();
        else {
            return "Ohhh, je suis trop faible pour combattre !";
        }
    }
}

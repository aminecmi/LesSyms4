package Person;

import Comportements.ComportementCombat;
import Comportements.ComportementEmmetreSon;

public class Personnage implements ObservateurAbstrait {
    protected String nom;
    protected ComportementCombat comportementCombat;
    protected ComportementEmmetreSon comportementEmmetreSon;
    protected eMode etatFonctionnement = eMode.ND;

    protected Personnage(Organisation etatMajor, String nom) {
        this.nom = nom;
        this.comportementCombat = null;
        this.comportementEmmetreSon = null;

        if (etatMajor != null)
            etatMajor.attach(this);
    }

    public String getNom() {
        return nom;
    }

    public void setComportementCombat(ComportementCombat comportementCombat) {
        this.comportementCombat = comportementCombat;
    }

    public void setComportementEmmetreSon(ComportementEmmetreSon comportementEmmetreSon) {
        this.comportementEmmetreSon = comportementEmmetreSon;
    }
    public String EmmetreSon() {
        return this.comportementEmmetreSon.emmetreSon();
    }

    public String Combattre() {
        if (this.comportementCombat != null)
            return this.comportementCombat.combattre() + " \n" + this.getEtat();
        else {
            return "Ohhh, je suis trop faible pour combattre !";
        }
    }


    public void update(eMode comportement) {
        this.etatFonctionnement = comportement;
    }

    public String getEtat() {
        String etat;
        switch (etatFonctionnement) {
            case GUERRE:
                etat = "En Guerre !";
                break;
            case PAIX:
                etat = "En paix !";
                break;
            default:
                etat = "De quoi ?";
                break;
        }
        return etat;
    }
}

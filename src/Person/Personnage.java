package Person;

import Cases.CaseAbstraite;
import Comportements.ComportementEmmetreSon;
import Composition.PersonnagesAbstraits;
import Observateur.ObservateurAbstrait;
import Observateur.Organisation;

public class Personnage extends PersonnagesAbstraits implements ObservateurAbstrait {
    protected CaseAbstraite caseCourante;
    protected String nom;
    protected ComportementEmmetreSon comportementEmmetreSon;
    protected eMode etatFonctionnement = eMode.ND;

    protected Personnage(Organisation etatMajor, String nom) {
        this.nom = nom;
        this.comportementEmmetreSon = null;

        if (etatMajor != null)
            etatMajor.attach(this);
    }

    public String getNom() {
        return nom;
    }

    public void setComportementEmmetreSon(ComportementEmmetreSon comportementEmmetreSon) {
        this.comportementEmmetreSon = comportementEmmetreSon;
    }
    public String EmmetreSon() {
        return this.comportementEmmetreSon.emmetreSon();
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

    public CaseAbstraite getCaseCourante() {
        return caseCourante;
    }

    public void setCaseCourante(CaseAbstraite caseCourante) {
        this.caseCourante = caseCourante;
    }
}

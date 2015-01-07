package Objets;

import Cases.CaseAbstraite;

public abstract class ObjetAbstrait {
    CaseAbstraite caseAbstraite;
    String nom;

    public ObjetAbstrait(String nom, CaseAbstraite c) {
        this.caseAbstraite = c;
        this.nom = nom;
    }
}

package utils;

import Cases.CaseAbstraite;

public class InterfaceConsole {
    CaseAbstraite[][] plateau;

    public InterfaceConsole(CaseAbstraite[][] cases) {
        plateau = cases;
    }

    public void afficherPlateau() {
        for (CaseAbstraite[] aPlateau : plateau) {
            for (CaseAbstraite anAPlateau : aPlateau) {
                if (anAPlateau.getOccupant() != null) {
                    System.out.print(anAPlateau.getOccupant().getNom().charAt(0) + " | ");
                } else {
                    System.out.print(" " + anAPlateau.affichageSpecial() + " | ");
                }
            }
            System.out.println();
            System.out.println("   ---------------------------------------------");
        }
    }
}

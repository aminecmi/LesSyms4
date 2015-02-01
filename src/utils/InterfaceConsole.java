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
                if (anAPlateau.getOccupant() != null || anAPlateau.getObjetOccupant() != null) {
                    char occ = ((anAPlateau.getOccupant() != null) ? anAPlateau.getOccupant().getNom().charAt(0) : anAPlateau.getObjetOccupant().getNom().charAt(0));
                    System.out.print(occ + " | ");
                } else {
                    System.out.print(" " + anAPlateau.affichageSpecial() + " | ");
                }
            }
            System.out.println();
            System.out.println("   ---------------------------------------------");
        }
    }
}

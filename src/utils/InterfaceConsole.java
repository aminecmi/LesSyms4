package utils;

import Cases.CaseAbstraite;

public class InterfaceConsole {
    CaseAbstraite[][] plateau;

    public InterfaceConsole(CaseAbstraite[][] cases) {
        plateau = cases;
    }

    public void afficherPlateau() {
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                if (plateau[i][j].getOccupant() != null) {
                    System.out.print(plateau[i][j].getOccupant().getNom().charAt(0) + " | ");
                } else {
                    System.out.print("   | ");
                }
            }
            System.out.println();
            System.out.println("   ---------------------------------------------");
        }
    }
}

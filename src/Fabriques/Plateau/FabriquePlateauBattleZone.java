package Fabriques.Plateau;

import Cases.CaseAbstraite;
import Cases.CaseColore;
import utils.Constants;

public class FabriquePlateauBattleZone extends FabriquePlateauAbstraite {
    @Override
    public CaseAbstraite[][] CreerPlateau() {
        CaseAbstraite[][] plateau = new CaseAbstraite[Constants.TABLE_WIDTH][Constants.TABLE_HEIGHT];
        for (int ligne = 0; ligne < 10; ligne++) {
            for (int col = 0; col < 10; col++) {
                plateau[ligne][col] = new CaseColore(col, ligne);
            }
        }
        return plateau;
    }
}

package Fabriques.Plateau;

import Cases.CaseAbstraite;
import Cases.CasePelouse;
import utils.Constants;

public class FabriquePlateauFootball extends FabriquePlateauAbstraite {

	@Override
	public CaseAbstraite[][] CreerPlateau() {
		CaseAbstraite[][] plateau = new CaseAbstraite[Constants.TABLE_WIDTH][Constants.TABLE_HEIGHT];
		for (int ligne = 0; ligne < 10; ligne++) {
			for (int col = 0; col < 10; col++) {
				plateau[ligne][col] = new CasePelouse(col, ligne);
			}
		}
		for (CaseAbstraite[] tabC : plateau) {
			for (CaseAbstraite c : tabC) {
				c.generateVoisins(plateau);
			}
		}
		return plateau;
	}

}

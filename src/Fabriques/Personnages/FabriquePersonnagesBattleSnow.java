package Fabriques.Personnages;

import Cases.CaseAbstraite;
import Comportements.ComportementAction;
import Comportements.ComportementActionTirerBouleDeNeige;
import Observateur.Organisation;
import Person.Personnage;
import Person.PersonnageBattleSnow;

import java.util.ArrayList;

public class FabriquePersonnagesBattleSnow extends FabriquePersonnagesAbstraite  {
	protected ComportementAction parDefaut = new ComportementActionTirerBouleDeNeige();

	@Override
	public ArrayList<Personnage> CreerPersonages(Organisation o, CaseAbstraite[][] plateau) {
		ArrayList<Personnage> list = new ArrayList<Personnage>();

		PersonnageBattleSnow p1 = new PersonnageBattleSnow("Bob", 100.0, 1.0, 1.0, 2, parDefaut);
		list.add(p1);
		PersonnageBattleSnow p2 = new PersonnageBattleSnow("Jo", 100.0, 1.0, 1.0, 2, parDefaut);
		list.add(p2);
		PersonnageBattleSnow p3 = new PersonnageBattleSnow("Max", 100.0, 1.0, 1.0, 2, parDefaut);
		list.add(p3);
		PersonnageBattleSnow p4 = new PersonnageBattleSnow("Zac", 100.0, 1.0, 1.0, 2, parDefaut);
		list.add(p4);

		this.placement(list, plateau);
		return list;
	}
}

package Comportements;

import Cases.CaseAbstraite;
import Cases.CaseColore;
import Person.PersonnageBattleZone;

public class ComportementActionChangerCouleurCase implements ComportementAction {

    @Override
    public void executerAction(CaseAbstraite c) {
        CaseColore caseColore = (CaseColore) c;
        PersonnageBattleZone personnage = (PersonnageBattleZone) c.getOccupant();
        caseColore.setCouleur(personnage.getCouleur());
    }
}

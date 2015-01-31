package Comportements;

import Cases.CaseColore;
import Person.Personnage;
import Person.PersonnageBattleZone;

public class ComportementActionChangerCouleurCase implements ComportementAction {

    @Override
    public void executerAction(Personnage p) {
        CaseColore caseColore = (CaseColore) p.getCaseCourante();
        PersonnageBattleZone personnage = (PersonnageBattleZone) p;
        caseColore.setCouleur(personnage.getCouleur());
    }
}

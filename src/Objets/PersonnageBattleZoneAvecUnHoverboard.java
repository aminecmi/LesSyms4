package Objets;

import Person.PersonnageBattleZone;

public class PersonnageBattleZoneAvecUnHoverboard extends ObjetAvecBonusVitesse {

	protected PersonnageBattleZoneAvecUnHoverboard(String name,
			double lifePoint, double strength, double speed, PersonnageBattleZone  PBZ) {
		super(name, lifePoint, strength, speed);
		// TODO Auto-generated constructor stub
		
		this.perso=PBZ;
	}

}

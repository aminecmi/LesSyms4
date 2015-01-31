package Person;

import Objets.ObjetAvecBonusForce;

public class PersonnageBattleZoneAvecUnMarteau extends ObjetAvecBonusForce {

	protected PersonnageBattleZoneAvecUnMarteau(String name, double lifePoint,
			double strength, double speed, PersonnageBattleZone  PBZ) {
		super(name, lifePoint, strength, speed);
		// TODO Auto-generated constructor stub
		
		this.perso=PBZ;
	}

}

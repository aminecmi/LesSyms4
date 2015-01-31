package Person;

import Objets.ObjetAvecBonusPV;

public class PersonnageBattleZoneAvecUneArmure extends ObjetAvecBonusPV {

	protected PersonnageBattleZoneAvecUneArmure(String name, double lifePoint,
			double strength, double speed, PersonnageBattleZone  PBZ) {
		super(name, lifePoint, strength, speed);
		// TODO Auto-generated constructor stub
		
		this.perso=PBZ;
	}

}

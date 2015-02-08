package Person;

import Comportements.ComportementAction;

public class PersonnageBattleSnow  extends Personnage{

    public PersonnageBattleSnow(String name, double lifePoint, double strength, double speed, int portee, ComportementAction parDefaut) {
        super(name, lifePoint, strength, speed, portee, parDefaut);
        // TODO Auto-generated constructor stub
	}

    public void attack(PersonnageBattleSnow cible) {
        double force = this.getForce();
        cible.recevoirAttack(force);
    }

    private void recevoirAttack(double force) {
        this.setPointsDeVie(this.getPointsDeVie() - force);
    }
}

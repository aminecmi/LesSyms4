package Objets;

public class ObjetAvecBonusPV extends ObjetAbstrait {

	public ObjetAvecBonusPV(String name, double lifePoint, double strength,
							double speed) {
		super(name, lifePoint, strength, speed);
		// TODO Auto-generated constructor stub
	}

	public double getPointsDeVie() {
		return 80;
	}
}

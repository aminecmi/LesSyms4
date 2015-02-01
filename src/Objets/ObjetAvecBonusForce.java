package Objets;

public class ObjetAvecBonusForce extends ObjetAbstrait {


	public ObjetAvecBonusForce(String name, double lifePoint,
							   double strength, double speed) {
		super(name, lifePoint, strength, speed);
		// TODO Auto-generated constructor stub
	}

	public double getPointsDeVie() {
		return 20;
	}

	public double getForce() {
		return 0.5;
	}
}

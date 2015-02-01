package Objets;

public class ObjetAvecBonusVitesse extends ObjetAbstrait {

	public ObjetAvecBonusVitesse(String name, double lifePoint,
								 double strength, double speed) {
		super(name, lifePoint, strength, speed);
		// TODO Auto-generated constructor stub
	}

	public double getPointsDeVie() {
		return 2;
	}
}

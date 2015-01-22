package Objets;

public class ObjetAvecBonusForce extends ObjetAbstrait {

	
    protected ObjetAvecBonusForce(String name, double lifePoint,
			double strength, double speed) {
		super(name, lifePoint, strength, speed);
		// TODO Auto-generated constructor stub
	}
	public double getPointsDeVie()  {return perso.getPointsDeVie() + 20;}
    public double getForce() {return perso.getForce() + 0.5;}	
}

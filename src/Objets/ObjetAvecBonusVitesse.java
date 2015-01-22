package Objets;

public class ObjetAvecBonusVitesse extends ObjetAbstrait {

	protected ObjetAvecBonusVitesse(String name, double lifePoint,
			double strength, double speed) {
		super(name, lifePoint, strength, speed);
		// TODO Auto-generated constructor stub
	}
	
    public double getPointsDeVie()  {return perso.getVitesse() + 2;}
}

package Objets;

import Cases.CaseAbstraite;
import Person.Personnage;

public abstract class ObjetAbstrait extends Personnage  {
	
	Personnage perso;
	CaseAbstraite positionCourante;
    String nom;
	
    protected ObjetAbstrait(String name, double lifePoint, double strength,
			double speed) {
		super(name, lifePoint, strength, speed);
		// TODO Auto-generated constructor stub
	}
    
   
}

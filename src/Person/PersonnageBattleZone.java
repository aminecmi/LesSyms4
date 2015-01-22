package Person;

import Observateur.Organisation;

import java.awt.*;
import java.util.Random;

public class PersonnageBattleZone extends Personnage {
    Color couleur;

	public PersonnageBattleZone(String name, double lifePoint, double strength, double speed) {
		super(name, lifePoint, strength, speed);
		// TODO Auto-generated constructor stub
	

        // Couleur Aléatoire
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        this.couleur = new Color(r, g, b);
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}

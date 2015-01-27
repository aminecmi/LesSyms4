package Objets;

import Cases.CaseAbstraite;
import Person.Personnage;

public abstract class ObjetAbstrait {
	protected CaseAbstraite caseCourante;
	protected Personnage perso;
	protected String nom;
	protected double pointsDeVie;
	protected double force;
	protected double vitesse;

	protected ObjetAbstrait(String name) {
		this.nom = name;
		this.pointsDeVie = 100;
		this.force = 10;
		this.vitesse = 1;

		this.perso = null;
		this.caseCourante = null;
	}

	protected ObjetAbstrait(String name, double lifePoint, double strength, double speed) {
		this.nom = name;
		this.pointsDeVie=lifePoint;
		this.force=strength;
		this.vitesse=speed;

		this.caseCourante=null;
		this.perso = null;
	}

	public CaseAbstraite getCaseCourante() {
		return caseCourante;
	}

	public void setCaseCourante(CaseAbstraite caseCourante) {
		this.caseCourante = caseCourante;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(double pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	public double getForce() {
		return force;
	}

	public void setForce(double force) {
		this.force = force;
	}

	public double getVitesse() {
		return vitesse;
	}

	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}

	public Personnage getPerso() {
		return perso;
	}

	public void setPerso(Personnage perso) {
		this.perso = perso;
	}
}

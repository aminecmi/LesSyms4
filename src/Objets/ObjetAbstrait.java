package Objets;

import Cases.CaseAbstraite;

public abstract class ObjetAbstrait {
    private CaseAbstraite caseCourante;
    private String nom;
    private double pointsDeVie;
    private double force;
    private double vitesse;

	protected ObjetAbstrait(String name) {
		this.nom = name;
		this.pointsDeVie = 100;
		this.force = 10;
		this.vitesse = 1;
		this.caseCourante = null;
	}

    ObjetAbstrait(String name, double lifePoint, double strength, double speed) {
        this.nom = name;
		this.pointsDeVie=lifePoint;
		this.force=strength;
		this.vitesse=speed;
		this.caseCourante=null;
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
}

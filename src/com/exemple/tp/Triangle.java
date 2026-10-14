package com.exemple.tp;

public class Triangle extends Forme {

	private double base, hauteur;

	// constructeur
	public Triangle(String couleur, double base, double hauteur) {
		super(couleur);
		this.base = base;
		this.hauteur = hauteur;
	}

	// redefinition de la methode dessiner()
	public void dessiner() {
		System.out.println("Dessiner un triangle de couleur " + couleur + ", base=" + base + ", hauteur=" + hauteur);
	}

	// redefinition de la methode aire()
	public double aire() {
		return 0.5 * base * hauteur;
	}

}

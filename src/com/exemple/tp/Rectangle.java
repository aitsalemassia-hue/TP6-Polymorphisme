package com.exemple.tp;

public class Rectangle extends Forme {
	private double largeur, hauteur;

	// constructeur
	public Rectangle(String couleur, double largeur, double hauteur) {
		super(couleur);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	// redefinition de la methode dessiner()
	public void dessiner() {
		System.out.println(
				"Dessiner un rectangle de couleur " + couleur + ", largeur=" + largeur + ", hauteur=" + hauteur);
	}

	// redefinition de la methode aire()

	public double aire() {
		return largeur * hauteur;
	}

}

package com.exemple.tp;

public class Cercle extends Forme {

	private double rayon;

	// constructeur

	public Cercle(String couleur, double rayon) {
		super(couleur);
		this.rayon = rayon;
	}

	// redefinition de la methode dessiner()
	public void dessiner() {
		System.out.println("Dessiner un cercle de couleur " + couleur + " et de rayon " + rayon);
	}

	// redefinition de la methode aire()
	public double aire() {
		return Math.PI * rayon * rayon;
	}

}

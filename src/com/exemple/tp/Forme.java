package com.exemple.tp;

public class Forme {
	protected String couleur;

	public Forme(String couleur) {
		super();
		this.couleur = couleur;
	}
	
	// methode dessiner
	public void dessiner() {
		System.out.println("Dessiner une forme de couleur"+couleur );
	}
	
	// methode aire()
	
    public double aire() {
        return 0.0;
    }
}

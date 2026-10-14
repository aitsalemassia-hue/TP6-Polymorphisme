package com.exemple.tp.exercice2;

public class Audio extends Media {

	private int duree;

	// constructeur
	public Audio(String titre, int duree) {
		super(titre);
		this.duree = duree;
	}

	// redefinition de la methode lire()

	public void lire() {
		System.out.println("Lecture audio : " + titre);

	}

	// redefinition de la methode getDuree()

	public int getDuree() {

		return duree;
	}

}

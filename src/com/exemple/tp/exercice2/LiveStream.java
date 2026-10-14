package com.exemple.tp.exercice2;

public class LiveStream extends Media {
	private String url;

	// constructeur
	public LiveStream(String titre, String url) {
		super(titre);
		this.url = url;
	}

	// redefinition de la methode lire
	@Override
	public void lire() {
		System.out.println("Démarrage du flux en direct : " + titre + " – " + url);
	}

	// redefinition de la methode getDuree
	@Override
	public int getDuree() {
		return -1;
	}

}

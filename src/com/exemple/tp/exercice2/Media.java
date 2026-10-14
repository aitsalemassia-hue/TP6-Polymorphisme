package com.exemple.tp.exercice2;

public class Media {
	protected String titre ;
	//constructeur 
	public Media(String titre) {
		super();
		this.titre = titre;
	}
	
	
	
	public void lire() {
		 System.out.println("Lecture de : " + titre);
	};
	
	
	
	public int getDuree() {
		return 0;
	}
	
}

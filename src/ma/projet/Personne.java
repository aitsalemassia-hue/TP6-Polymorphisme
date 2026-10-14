package ma.projet;

public abstract class Personne {
	protected final String nom ;
	protected final double salaireBase;
	
	
	
	public Personne(String nom, double salaireBase) {
		super();
		this.nom = nom;
		this.salaireBase = salaireBase;
	}
	
	public abstract double calculerSalaire();
	
	
	public void affiche() {
		System.out.printf(
				"je suis %s , salaire=%.2f%n",
				nom, calculerSalaire()
				
				
				);
	}
	
	

}

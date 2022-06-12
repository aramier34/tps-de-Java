package fr.diginamic.entites;

public class Compte {
	// Arguments
	private int numCompte;
	private int soldeCompte;
	
	// Constructeurs
	public Compte(int numCompte, int soldeCompte) {
		super();
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	// Getters et setters
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public int getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
	// M�thodes de classe
	
	@Override
	public String toString() {

		String message = "num�ro de compte : " + this.numCompte + " - Solde: " + this.soldeCompte + " euros.";
		return message;
	}
	
}

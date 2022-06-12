package entites2;

public class Personne1 {
	String nom = "Doe";
	String prenom = "John";
	AdressePostale1 adressePostale;
	public Personne1(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Personne1(String nom, String prenom, AdressePostale1 adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}

}

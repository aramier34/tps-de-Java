package entities;

public class AdressePostale {

	
	int numero;
	String libelle;
	String codePostale;
	String ville;

	public AdressePostale(int numero, String libelle, String codePostale, String ville) {
		super();
		this.numero = numero;
		this.libelle = libelle;
		this.codePostale = codePostale;
		this.ville = ville;
	}
}

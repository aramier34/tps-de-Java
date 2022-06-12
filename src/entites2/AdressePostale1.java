package entites2;

public class AdressePostale1 {
	int numeroDeRue;
	String libelleDeLaRue;
	String codePostal;
	String ville;
	static int nbDepartements = Constantes1.NB_DEPARTEMENTS;
	
	public AdressePostale1(int numeroDeRue, String libelleDeLaRue, String codePostal, String ville) {
		super();
		this.numeroDeRue = numeroDeRue;
		this.libelleDeLaRue = libelleDeLaRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	

}

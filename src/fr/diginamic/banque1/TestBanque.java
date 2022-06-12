package fr.diginamic.banque1;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {

		Compte monCompte = new Compte (123456, 1000.0f);
	
		System.out.println(monCompte);
		
	}

}

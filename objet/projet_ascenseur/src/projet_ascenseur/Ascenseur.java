package projet_ascenseur;

import java.util.Scanner;

public class Ascenseur {
	
	// declaration des attributs
		private double capaciteEnNombrePersonnes;
		private double remplisageEnNombrePersonnes;
		private String nom;
		private double etage;
		private boolean porteEstOuverte;
				
		// les constructeurs

		public Ascenseur(double capaciteEnNombrePersonnes, boolean porteEstOuverte, double etage, String nom) {
			this.capaciteEnNombrePersonnes = capaciteEnNombrePersonnes;
			this.porteEstOuverte = porteEstOuverte;
			this.nom = nom;
			this.etage = etage;
			}
		
		@Override
		public String toString() {
			return "capaciteEnNombrePersonnes= " + capaciteEnNombrePersonnes + " porteEstOuverte= " + porteEstOuverte + " etage= " + etage + " nom= "
					+ nom;
		} 
		
		// les methodes
		
		public boolean appeler() {
			if (this.etage > 0 & this.etage <0) {
				
				int etage = 0;
				boolean porteEstOuverte = true;
				Scanner sc = new Scanner(System.in);
				int personnes = sc.nextInt();
				capaciteEnNombrePersonnes = 84 - personnes;
				return true;
				
			} else {
				boolean porteEstOuverte = true;
			    Scanner sc = new Scanner(System.in);
				System.out.println("L'ascenseur était déjà à cet étage. Veuillez indiquer le nombre de personnes qui montent dans l'ascenseur");
				int personnes = sc.nextInt();
				return false;
			}
		}

		
			
}

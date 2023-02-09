package projet_ascenseur;

import java.util.Scanner;

public class Ascenseur {
	
	// declaration des attributs
		private double capaciteEnNombrePersonnes;
		private double remplisageEnNombrePersonnes;
		private String nom;
		private double etage;
		private boolean porteEstOuverte;
		double demandeEtage;
				
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
			if (this.etage != 0) {
				boolean porteEstOuverte = true;
				Scanner sc = new Scanner(System.in);
				System.out.println("L'ascenseur est arrivé. Veuillez indiquer le nombre de personnes qui montent dans l'ascenseur");
				double personnes = sc.nextInt();
				capaciteEnNombrePersonnes = 84 - personnes;
				porteEstOuverte = false;
				this.etage = 0;
				return true;
				
			} else {
				boolean porteEstOuverte = true;
			    Scanner sc = new Scanner(System.in);
				System.out.println("L'ascenseur était déjà à cet étage. Veuillez indiquer le nombre de personnes qui montent dans l'ascenseur");
				int personnes = sc.nextInt();
				this.capaciteEnNombrePersonnes = capaciteEnNombrePersonnes - personnes;
				porteEstOuverte = false;
				this.etage = 0;
				return false;
			}
		}
		
		
		public boolean monter() {
			
			Scanner sc = new Scanner(System.in);
			demandeEtage = sc.nextInt();
			
			if (this.demandeEtage > this.etage) {
				// Scanner sc = new Scanner(System.in);
				// demandeEtage = sc.nextInt(); 
				porteEstOuverte = false;
				this.etage = demandeEtage;
				return true;
			
			} else {
				// Scanner sc = new Scanner(System.in);
				// demandeEtage = sc.nextInt();
				porteEstOuverte = false;
				this.etage = demandeEtage;
				return false;
			}
		}

		
			
}

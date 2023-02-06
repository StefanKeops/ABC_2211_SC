package projet_porte_garage;

import java.util.Scanner;

public class PorteGarage {
	
	// declaration des attributs
		private double hauteurEnMM;
		private double LargeurEnMM;
		private boolean estOuverte;
		private boolean estVerrouille;

		
		// les constructeurs
		
		public PorteGarage ( double hauteurEnMM , double LargeurEnMM , boolean estOuverte , boolean estVerrouille ) {
			this.hauteurEnMM = hauteurEnMM;
			this.LargeurEnMM = LargeurEnMM;
			this.estOuverte = estOuverte;
			this.estVerrouille = estVerrouille;
		}
		
		@Override
		public String toString()
		{
			return 	"hauteurEnMM ="+hauteurEnMM+
			" LargeurEnMM="+LargeurEnMM+
			" estOuverte="+estOuverte+
			" estVerrouille="+estVerrouille;
		}
		
		// les methodes
		
		// ouvrir
		
		public int ouvrir()
		{
		if (this.estOuverte == false & this.estVerrouille == false) {
			return 0; 
			
				} else if (this.estOuverte == true & this.estVerrouille == false)	{
					return 1;
					
				} else  {
					return 2;
		}
		
		}
		
		//ouverture partialle();
		
		public int partialle() {
		
			Scanner sc = new Scanner(System.in);
		
        System.out.println("Veuillez saisir combien de MM vous voulez ouvrir la porte : ");
		
		int distanceEnMM = sc.nextInt();
		
		int pourcentage = (int) (distanceEnMM * 100 / hauteurEnMM);
				
			if (distanceEnMM <= this.hauteurEnMM) {
					return pourcentage;
				} else {
					
				}
			return pourcentage ;
		}
		
		// fermer
		
		public boolean fermer() {
			if (this.estOuverte == true) {
				this.estOuverte = true;
				return true;
			} else {
				return false;
			}
		}
		
		// ouvrirTelecomande()
		
				public boolean ouvrirTelecomande() {
					
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Veuillez saisir a quelle distance en mètres de la porte : ");
					 
					int distanceEnM = sc.nextInt();
					
				if (distanceEnM <= 3) {
					return true; 
					
						} else {
							return false;
							
}}}

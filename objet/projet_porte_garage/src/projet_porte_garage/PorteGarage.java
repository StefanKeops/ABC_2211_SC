package projet_porte_garage;

import java.util.Scanner;

public class PorteGarage {
	
	// declaration des attributs
		private double hauteurEnMM;
		private double LargeurEnMM;
		private boolean estVerrouille;
		private final double  HAUTEUR_MAXIMUM;
		
		// les constructeurs
		
		public PorteGarage ( double hauteurEnMM , double LargeurEnMM, boolean estVerrouille ) {
			this.hauteurEnMM = hauteurEnMM;
			this.LargeurEnMM = LargeurEnMM;
			this.estVerrouille = estVerrouille;
			HAUTEUR_MAXIMUM=2000;
		}
		
		@Override
		public String toString()
		{
			return 	"hauteurEnMM ="+hauteurEnMM+
			" LargeurEnMM="+LargeurEnMM+
			" estVerrouille="+estVerrouille;
		}
		
		// les methodes
		
		// ouvrir
		
		public boolean estTotallementOuvert() 
		{
		if (this.hauteurEnMM == 0) {
			this.estVerrouille = false;
			return true;
			
		} else {
			return false;
		}
		
		}
		
		public boolean estPartiellementOuvert()
		{
		if (this.hauteurEnMM < this.HAUTEUR_MAXIMUM) {
			return true;
			
		} else {
			return false;
		}
			
		}
		
		
		public int ouvrir()
		{
		if (this.hauteurEnMM <= this.HAUTEUR_MAXIMUM & this.estVerrouille == false) {
			return 0; 
			
				} else if ( this.estVerrouille == true)	{
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
				this.hauteurEnMM = hauteurEnMM - distanceEnMM;
				return pourcentage;
					} else {
					
				}
			return pourcentage ;
		}
		
		// fermer
		
		public boolean fermer() {
			if (this.hauteurEnMM >= 0) {
				this.estVerrouille = false;
				this.hauteurEnMM=HAUTEUR_MAXIMUM;
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
					estVerrouille = true;
					this.hauteurEnMM = this.hauteurEnMM - this.hauteurEnMM;
					estVerrouille = false;
					return true; 
					
						} else {
							return false;
							
}}}

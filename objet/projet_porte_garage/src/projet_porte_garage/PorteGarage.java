package projet_porte_garage;

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
		
		//demiOuvrir();
		
		public boolean demiOuvrir(double distanceEnMM)
		{
			if (this.estOuverte == true && distanceEnMM <= this.hauteurEnMM) {
					return true;
				} else {
					return false;
				}
		}
		
		// ouvrirTelecomande()
		
				public int ouvrirTelecomande(double distanceEnM)
				{
				if (this.estOuverte == false & this.estVerrouille == true & distanceEnM <= 3) {
					return 0; 
					
						} else if (this.estOuverte == false & this.estVerrouille == true & distanceEnM > 3)	{
							return 1;
							
						} else  {
							return 2;
}}} 

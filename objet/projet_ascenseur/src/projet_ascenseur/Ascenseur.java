package projet_ascenseur;

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
			if (this.etage > 0) {
				return true;
			} else {
				return false;
			}

		}
			
}

package cours_ville;

public class Ville {
	
	// les attributs
		private String nomVille;
		private int nbHabitants;
		private String nomPays;
		private char categories;
		
		// le constructeur par defaut
		public Ville()
		{
			System.out.println("Creation d'une ville avec le constructeur par defaut");
			nomVille = "inconnu";
			nbHabitants = 0;
			nomPays = "inconnu";
			this.setCategorie();
		}
		
		// le constructeur classique
		public Ville(String pNomVille, int nbre, String pNomPays)
		{
			System.out.println("Creation d'une ville avec le constructeur classique");
			nomVille = pNomVille;
			nbHabitants = nbre;
			nomPays = pNomPays;
			this.setCategorie();
		}
		
		//************ ACCESSEURS ***************
		
		// Retourne le nom de la ville
		public String getnomVille()
		{
			return nomVille;
		}
		
		public String getNomPays()
		{
			return nomPays;
		}
		
		public int getNbHabitants()
		{
			return nbHabitants;
		}
		
		//************** MUTATEURS ******************
		
		// Définit le nom de la ville
		public void setNomVille(String pNomVille)
		{
			nomVille = pNomVille;
		}
		
		// Définit le nom du pays
		public void setNomPays(String pNomPays)
		{
			nomPays = pNomPays;
		}
		
		// Définit le nombre d'habitant
		public void setNbhabitant(int pNbHabitant)
		{
			nbHabitants = pNbHabitant;
			this.setCategorie();
		}
		
		private void setCategorie()
		{
			int[] bornesSuperieur = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
			char[] categories = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
			
			int i = 0;
			while(i < bornesSuperieur.length && nbHabitants > bornesSuperieur[i])
			{
				i++;
			}
			this.categories = categories[i];
		}
		
		public String decrisToi()
		{
			return "\t"+this.nomVille+ " est une ville situer en "
					+this.nomPays+" elle comporte "+this.nbHabitants
					+" habitant(s) =>elle est donc de categories "
					+this.categories;
		}
		
		public String comparer(Ville v1)
		{
			String str = new String();
			if(v1.getNbHabitants() > this.nbHabitants)
			{
				str = v1.getnomVille() + " est plus peuplee que "+ this.nomVille;
			}
			else
			{
				str = this.nomVille + " est plus peuplee que "+v1.getnomVille() ;
			}
			return str;
		}
	}

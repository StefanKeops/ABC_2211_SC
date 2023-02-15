package cours_ville;

public class Ville {
	
	// les attributs
	private String nomVille;
	private int nbHabitants;
	private String nomPays;
	private char categorie;
	
	// le constructeur par defaut
	public Ville()
	{
		System.out.println("Creation d'une ville avec le constructeur par defaut");
		nomVille = "inconnu";
		nbHabitants = 0;
		nomPays = "inconnu";
	}
	
	// le constructeur classique
	public Ville(String pNomVille, int nbre, String pNomPays)
	{
		System.out.println("Creation d'une ville avec le constructeur classique");
		nomVille = pNomVille;
		nbHabitants = nbre;
		nomPays = pNomPays;
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
	}
	
	private void setCategorie()
	{
	
	}
	
}

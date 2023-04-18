package villes;

public class Capitales extends Ville {
	
	private String monuments;
	
	// constructeur par defaut
	public Capitales()
	{
		// mot clè pour récuperer les attributs de la classe mère
		super();
		this.monuments = "aucun";
	}
	
	// constructeur classique 
	public Capitales(String _nom, int nbHabitant, String _pays, String _monument)
	{
		super(_nom, nbHabitant, _pays);
		this.monuments = _monument;
	}
	
	public String decrisToi()
	{
		return "\t"+this.nomVille+ " est une ville situer en "
				+this.nomPays+" elle comporte "+this.nbHabitants
				+" habitant(s) =>elle est donc de categories "
				+this.categories + " elle a comme monuments "+this.monuments;
	}
}

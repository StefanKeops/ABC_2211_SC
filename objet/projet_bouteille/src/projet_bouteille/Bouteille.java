package projet_bouteille;

public class Bouteille {
	
	// declaration des attributs
	private double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private String nom;
	
	// les methodes
	
	public static boolean ouvrir()
	{
	
	}
	
	public static boolean fermer()
	{
		
	}
	
	public static boolean remplirTout()
	{
		
	}
	
	public static boolean remplir(double quantiteEnL)
	{
		
	}
	
	public static boolean vidertout()
	{
		
	}
	
	public static boolean vider(double quantiteEnL)
	{
		
	}
	
	public static String DonneLeNom()
	{
		
	}
	
	// Le constructeur par defaut
	public Bouteille()
	{
		capaciteEnL = 1;
		contenanceEnL = 0;
		estOuverte = false;
		nom = " ";
	}
	
	// Le constructeur classique
	public Bouteille(double _capaciteEnL, double _contenanceEnL, boolean _estOuverte, String _Nom)
	{
		this.capaciteEnL = _capaciteEnL;
		this.contenanceEnL = _contenanceEnL;
		this.estOuverte = _estOuverte;
		this.nom = _Nom;
	}

}

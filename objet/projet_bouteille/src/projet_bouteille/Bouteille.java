package projet_bouteille;

public class Bouteille {
	
	// declaration des attributs
	private double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private String nom;

	
	// les constructeurs
	
	public Bouteille( double capaciteEnL , double contenanceEnL , boolean estOuverte , String nom ) {
		this.capaciteEnL = capaciteEnL;
		this.contenanceEnL = contenanceEnL;
		this.estOuverte = estOuverte;
		this.nom = nom;
	}
	
	@Override
	public String toString()
	{
		return 	"capaciteEnL="+capaciteEnL+
		" contenanceEnL="+contenanceEnL+
		" estOuverte="+estOuverte+
		" nom="+nom;
	}
	
	// les methodes
		
	public boolean ouvrir()
	{
	if (this.estOuverte == true) {
		return false;
			} else {
				this.estOuverte = true;
		return true;
	}
	
	}
	
	 public boolean fermer()
	{
		 if (this.estOuverte == false) {
			 System.out.println("la bouteille est ferme");
			 return false;
		 } else {
			 System.out.println("La bouteille est ouverte");
			 return true;
	}
	}
	
	public boolean remplirTout ()
	{
		if (contenanceEnL < capaciteEnL)
			System.out.println ("La bouteille est ouverte et pleine");
		return true;
		 }
        
        
	public boolean remplir(double quantiteEnL)
	{
		double plein = quantiteEnL + this.contenanceEnL;
		if (this.estOuverte == true & plein > this.capaciteEnL) {
			System.out.println ("La bouteille il est plein et s'est renverse");
				return true;
			} else if (this.estOuverte == true & plein < this.capaciteEnL) {
				System.out.println ("La bouteille est ouverte et contient " + plein + " ml");
				return true;
			} else {
				 System.out.println("la bouteille est ferme");
				 return false;
		
	}
	
	/*public boolean viderTout()
	{
		if (contenanceEnL > 0)
			return true
	
	} else {
			return false
			
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
	}*/

	}}

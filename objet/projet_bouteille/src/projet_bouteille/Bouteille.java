package projet_bouteille;

public class Bouteille {
	
	// declaration des attributs
	private double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private boolean estFerme;
	private String nom;

	
	// les constructeurs
	
	public Bouteille( double capaciteEnL , double contenanceEnL , boolean estOuverte , String nom ) {
		this.capaciteEnL = capaciteEnL;
		this.contenanceEnL = contenanceEnL;
		this.estOuverte = estOuverte;
		this.estFerme = estFerme;
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
				this.estOuverte = false;
		return true;
	}
	
	}
	
	 public boolean fermer()
	{
		 if (this.estFerme == false) {
			 return true;
		 } else {
			 return false;
	}
	}
	
	public boolean remplirTout ()
	{
		if (contenanceEnL < capaciteEnL)
			return true;
		return false;
		 }
        
        
	public boolean remplir(double quantiteEnL)
	{
		double plein = quantiteEnL + this.contenanceEnL;
		if (this.estOuverte == true & plein < this.capaciteEnL) {
				return true;
			} else {
				return false;
			}
	}
	
	public boolean viderTout() {
	
		if (contenanceEnL > 0) {
			return true;
	
	} else {
			return false; }
			
	}
	
	public boolean vider(double quantiteEnL)
	{
		if (this.estOuverte == true & quantiteEnL < this.contenanceEnL) {
				return true;
			} else {
				return false;
			}
	}
	
	public String DonneLeNom()
	{
		return this.nom;
	}
	
	/* Le constructeur par defaut
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

	}

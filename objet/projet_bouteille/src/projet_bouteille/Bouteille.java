package projet_bouteille;

public class Bouteille {

	// declaration des attributs
	private double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private String nom;
	private double diference;
	private double complet;

	// les constructeurs

	public Bouteille(double capaciteEnL, double contenanceEnL, boolean estOuverte, String nom) {
		this.capaciteEnL = capaciteEnL;
		this.contenanceEnL = contenanceEnL;
		this.estOuverte = estOuverte;
		this.nom = nom;
		this.diference = diference;
		this.complet = complet;
	}

	@Override
	public String toString() {
		return "capaciteEnL=" + capaciteEnL + " contenanceEnL=" + contenanceEnL + " estOuverte=" + estOuverte + " nom="
				+ nom;
	}

	// les methodes

	public boolean ouvrir() {
		if (this.estOuverte == true) {
			return false;
		} else {
			this.estOuverte = false;
			return true;
		}

	}

	public boolean fermer() {
		if (this.estOuverte == true) {
			this.estOuverte = false;
			return true;
		} else {
			return false;
		}
	}

	public boolean remplirTout() 
	{
		if (this.estOuverte == false) {
				this.estOuverte = true;
				this.diference = this.capaciteEnL - this.contenanceEnL;
				this.complet = this.contenanceEnL + this.diference;
		}
		else {
		}
			this.estOuverte = true;
			this.diference = this.capaciteEnL - this.contenanceEnL;
			this.complet = this.contenanceEnL + this.diference;
		{ 
			return true;
		}
	}

	public boolean remplir(double quantiteEnL) {
		double plein = quantiteEnL + this.contenanceEnL;
		if (this.estOuverte == true) {
			contenanceEnL = plein;
			return true;
		} else {
			return false;
		}
	}

	public boolean viderTout() {

		contenanceEnL = this.capaciteEnL - this.contenanceEnL;
		if (contenanceEnL == 0) {
			return true;

		} else {
			return false;
		}

	}

	public boolean vider(double quantiteEnL) {
		if (this.estOuverte == true & contenanceEnL > 0) { 
			double rest = this.contenanceEnL - quantiteEnL;
			return true;
		} else  {
			return false;
		}
	}

	public String DonneLeNom() {
		return this.nom;
	}

	/*
	 * Le constructeur par defaut public Bouteille() { capaciteEnL = 1;
	 * contenanceEnL = 0; estOuverte = false; nom = " "; }
	 * 
	 * // Le constructeur classique public Bouteille(double _capaciteEnL, double
	 * _contenanceEnL, boolean _estOuverte, String _Nom) { this.capaciteEnL =
	 * _capaciteEnL; this.contenanceEnL = _contenanceEnL; this.estOuverte =
	 * _estOuverte; this.nom = _Nom; }
	 */

}

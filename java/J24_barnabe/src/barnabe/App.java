package barnabe;

/*
 VARIABLES 
S = nombre entiere // la somme dont Barnabé disposait au départ
compteur = nombre entiere // le nombre de magasins dans lesquels Barnabé a acheté
dépense = nombre entiere // la somme dépensée dans un magasin

compteur <- 0
dépense <- (S/2) + 1
tant que dépense <= S faire
    S <- S - dépense
    compteur <- compteur + 1
    dépense <- S + 1
fin tant que

 */
public class App {

	public static void main(String[] args) {
		int S = 0; // La somme dont Barnabé disposait au départ
		int compteur = 0;
		int depense;
		while (S > 1) {
			depense = S - (S / 2 + 1);
			compteur++;
		}

		System.out.println("Barnabé a acheté dans " + compteur + " magasins.");

	}

}

package rechercher_un_nombre_dans_un_tableau;

/*
 VARIABLES 
 
 nombre_a_rechercher = entier;
 indice_debut = entier;
 indice_fin = entier
 
 Demander à l'utilisateur de saisir le nombre à rechercher et le stocker dans une variable nombre_a_rechercher
Déclarer une variable indice_debut initialisée à 0 et une variable indice_fin initialisée à la taille du tableau moins 1

 */

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // exemple de tableau trié par ordre croissant
	    System.out.println("Saisissez le nombre à rechercher :");
	    int nombre_a_rechercher = sc.nextInt();
	    int indice_debut = 0;
	    int indice_fin = tableau.length - 1;
	    while (indice_debut <= indice_fin) {
	      int indice_milieu = (indice_debut + indice_fin) / 2;
	      if (tableau[indice_milieu] == nombre_a_rechercher) {
	        System.out.println(nombre_a_rechercher);
	        return;
	      } else if (tableau[indice_milieu] < nombre_a_rechercher) {
	        indice_debut = indice_milieu + 1;
	      } else {
	        indice_fin = indice_milieu - 1;
	      }
	    }
	    System.out.println("404 Not found.");
	  }
	}
package interet;

import java.util.Scanner;

/*
  VARIABLE
  S est un entier
  N est un entier
  i este un reel double
  interet simple est un reel double
  interet compose est un reel double
  DEBUT PROGRAMME
 	* Ecrire  « Veuillez écrire la valeur du somme S»
 	* Lire S
 	* Ecrire  « Veuillez écrire la valeur du nombre d’années de placement N»
 	* Lire N
 	* interetSimple  S(1+N*i)
 	* interetCompose S(1+i)^N
 	* Ecrire «  l'interet simple est » + interetSimple
 	* Ecrire «  l'interet compose est » + interetCompose
  FIN DE PROGRAMME
 */

public class App {
	
	private static double InteretSimple;
	private static double InteretCompose;

	public static void main(String[] args) {
		
		int somme;
		int annes;
		int interet;
		// utilisation de l'objet pow(puissance) de la classe math (1er paramètre la variable le nombre, le 2eme l'exposant));

		Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur
	
		// DEBUT PROGRAMME
		
		System.out.println("Programme de calcul d'Interet simple et compose");
		
		System.out.println("Veuillez saisir une valeur pour la somme");
		somme = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
		System.out.println("Vous avez saisi:" + somme);
		
		System.out.println("Veuillez saisir une valeur pour le nombre d’années de placement");
		annes = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
		System.out.println("Vous avez saisi:" + annes);
		
		System.out.println("Veuillez saisir une valeur pour le taux d'interet");
		interet = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
		System.out.println("Vous avez saisi:" + interet);
		
		InteretSimple = somme * (1 + annes * interet); 
		System.out.println("La valeur acquise par la somme est:" + (int) InteretSimple);
		
		InteretCompose = somme * Math.pow((1 + interet), annes); 
		System.out.println("La valeur acquise par la somme est:" + (int) InteretCompose);

	}

}

package aire_du_secteur_circulaire;

import java.util.Scanner;

/*
  VARIABLE
  R est un entier
  A est un entier
  Aire est un reel double
  DEBUT PROGRAMME
 	* Ecrire  « Veuillez écrire la valeur du rayon R»
 	* Lire R
 	* Ecrire  « Veuillez écrire la valeur du angle A»
 	* Lire A
 	* Aire π R² A/360
 	* Volume  4/3 π R³
 	* Ecrire «  l’aire du secteur circulaire est » + Aire
  FIN DE PROGRAMME
 */

public class App {
	
	private static double Aire;

	public static void main(String[] args) {
		
		// utilisation de l'objet pi de la classe Java
				double pi = Math.PI;
				int rayon;
				int angle;
				// utilisation de l'objet pow(puissance) de la classe math (1er paramètre la variable le nombre, le 2eme l'exposant));

				Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur
			
				// DEBUT PROGRAMME
				
				System.out.println("Programme de calcul Aire du secteur circulaire");
				
				System.out.println("Veuillez saisir une valeur pour le rayon");
				rayon = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
				System.out.println("Vous avez saisi:" + rayon);
				
				System.out.println("Veuillez saisir une valeur pour l'angle");
				angle = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
				System.out.println("Vous avez saisi:" + angle);
				
				Aire = pi * Math.pow(rayon, 2) * angle/360; 
				System.out.println("L'aire du secteur circulaire:" + (int) Aire);

	}

}

package aire_volume_sphere;

import java.util.Scanner;

/*
  Variable
  R est un entier
  Aire est un reel double
  Volume est un reel double
  DEBUT PROGRAMME
 	* Ecrire  « Veuillez écrire la valeur du rayon R»
 	* Lire R
 	* Aire 4 π R²
 	* Volume  4/3 π R³
 	* Ecrire «  l’aire de la sphere est » + Aire
 	* Ecrire «  le volume de la sphere est » + Volume
  FIN DE PROGRAMME
 */

public class App {

	private static double Aire;
	private static double Volume;

	public static void main(String[] args) {

		// utilisation de l'objet pi de la classe Java
		double pi = Math.PI;
		int rayon;
		// utilisation de l'objet pow(puissance) de la classe math (1er paramètre la variable le nombre, le 2eme l'exposant));

		Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur
	
		// DEBUT PROGRAMME
		
		System.out.println("Programme de calcul Aire et Volume");
		
		System.out.println("Veuillez saisir une valeur pour le rayon");
		rayon = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
		System.out.println("Vous avez saisi:" + rayon);
		
		Aire = 4 * pi * Math.pow(rayon, 2); 
		System.out.println("L'Aire est de la sphere:" + (int) Aire);
		
		Volume = 4/3 * pi * Math.pow(rayon, 3);
		System.out.println("La volume de la sphere est:" + (int) Volume);
		
		

	}

}

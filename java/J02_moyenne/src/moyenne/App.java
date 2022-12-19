package moyenne;

import java.util.Scanner;

public class App {
	
	/*
	VARIABLES
		nombre1 est un ENTIER
		nombre2 est un ENTIER
		moyenne est un REEL
	DEBUT PROGRAMME
		Ecrire « Programme de calcum de la moyenne de 2 nombre »
		Ecrire « Veuillez saisir un premier nombre »
		Lire nombre1
		Ecrire « Veuillez saisir un deuxième nombre »
		Lire nombre2
		Moyenne (nombre1 + nombre 2)/2
		Ecrire « La moyenne de » nombre1 « et » nombre 2 « est » moyenne
	 FIN PROGRAMME
	 
	 
	 */
	public static void main(String[] args) 
	{
		// VARIABLES
		
		int nombre1;
		int nombre2;
		double moyenne;
		
		Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur

		
		// DEBUT PROGRAMME
		
		System.out.println("Programme de calcul de la moyenne de 2 nombres");
				
		System.out.println("Veuillez saisir un premier nombre");
		nombre1 = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
		System.out.println("Vous avez saisi:" + nombre1);
		
		System.out.println("Veuillez saisir un deuxième nombre");
		nombre2 = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
		System.out.println("Vous avez saisi:" + nombre2);
		
		moyenne = (nombre1 + nombre2) / 2d;
		
		System.out.println("Vous avez saisi:" + moyenne);
		
		
	}

}

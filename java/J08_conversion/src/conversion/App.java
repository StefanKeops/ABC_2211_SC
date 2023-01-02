package conversion;

import java.util.Scanner;

public class App {
	
	/*
	VARIABLES
		kilometre est un ENTIER
		mile est un REEL
	DEBUT PROGRAMME
		Ecrire « Programme de conversion de kilometres en miles »
		Ecrire « Veuillez saisir combien kilometres »
		Lire kilometres
		Mile (kilometre * 0.621371)
		Ecrire « Distance in kilometres : » kilometre « kilometres » 
		Ecrire « Distance in miles : » mile « miles » 
	 FIN PROGRAMME
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur
		
		sc= new Scanner(System.in);

		System.out.print("Veuillez saisir combien kilometres :  ");
		double kilometre = sc.nextDouble();
		
		double mile = kilometre * 0.621371;
		
		System.out.println("Distance in kilometres : " + kilometre + " km");
		System.out.println("Distance in miles      : " + mile + " miles");

	}

}

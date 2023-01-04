package inversion_valeurs;

import java.util.Scanner;

public class App {
	/*
VARIABLES
	A est un entier
	B est un entier
	C est un entier
DEBUT DU PROGRAMME
	Lire  A
	Ecrire « Valeur de A » A
	Lire B
	Ecrire « Valeur de B» B
	CA
	AB
	BC
	Ecrire « A »
	Ecrire « B »
FIN DU PROGRAMME
	 */

	public static void main(String[] args) {
		
		//declaration des variables
		int a;
		int b;
		int tmp;
		
		Scanner Sc = new Scanner(System.in);
		
		//debut du programme

		System.out.print("entrez le nombre a :");
		a = Sc.nextInt();

		System.out.println("entrez le nombre b : ");
		b = Sc.nextInt();

		System.out.println("Avant la permutation: a = "+a+" et b = "+b);
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("Apres la permutation: a = "+a+" et b = "+b);
		Sc.close();
		
		//fin du programme
	}

}
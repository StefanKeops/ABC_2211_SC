package pgcd;

import java.util.Scanner;

public class App {
	
	public static int pgcd(int nombre1, int nombre2) {
		if (nombre2 == 0) {
			return nombre1;
		}
		return pgcd(nombre2, nombre1 % nombre2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // permet de lire des saisies utilisateur
		
		System.out.print("Veuillez saisir un numbre :  ");
		
		int nombre1 = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
		
		System.out.println("Vous avez saisi:" + nombre1);
		
		System.out.println("Veuillez saisir un deuxième nombre : ");
		
		int nombre2 = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
		
		System.out.println("Vous avez saisi:" + nombre2);
		
		System.out.println("Le plus grand diviseur commun de" + " " + nombre1 + " et " + " " + nombre2 + " est " + " " + pgcd(nombre1, nombre2)); 

	}

}

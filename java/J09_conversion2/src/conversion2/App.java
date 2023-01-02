package conversion2;

import java.util.Scanner;

public class App {
	
	/*
	VARIABLES
		C est un ENTIER
		F est un ENTIER
		
	DEBUT PROGRAMME
		Ecrire « Programme de conversion de degres Celsius en degres Fahrenheit en miles »
		Ecrire « Veuillez saisir une temperature »
		Lire C
	    F = (C * 9/5) + 32
		Ecrire « Temperature en degres Celsius : » C « °C » 
		Ecrire « Temperature en degres Fahrenheit : » F « °F » 
	 FIN PROGRAMME
	 */

	public static void main(String[] args) {
		double celsius;
	    double fahrenheit;
		    
		Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur
		
		sc= new Scanner(System.in);

		System.out.print("Veuillez saisir combien degres Celsius :  ");
		celsius = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console
		
		fahrenheit = (celsius * 9/5) + 32;
				
		System.out.println("Temperature in celsius : " + celsius + " °C");
		System.out.println("Temperature in fahrenheit : " + fahrenheit + " °F");

	}

}

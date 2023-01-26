package procedure_moyenne;

import java.util.Scanner;

public class App {
	
	public static int moyenne (int nombre1, int nombre2) 
	{	
		int resultat;
		
		resultat = (nombre1 + nombre2) / 2;
		
		return resultat;
	}

	public static void main(String[] args) {
		
		int nombre1;
		int nombre2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Veuillez saisir le 1er nombre :");
		nombre1 = sc.nextInt();
		System.out.println ("Veuillez saisir le 2eme nombre :");
		nombre2 = sc.nextInt();
		
		System.out.println("La moyenne est : "+moyenne(nombre1,nombre2));
		
		sc.close();
	}

}

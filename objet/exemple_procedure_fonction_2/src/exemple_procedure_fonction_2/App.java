package exemple_procedure_fonction_2;

import java.util.Scanner;

public class App {

	public static int addition (int nombre1, int nombre2) 
	{	
		int resultat;
		
		resultat = nombre1 + nombre2;
		
		return resultat;
	}
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c;
		int d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Veuillez saisir le 1er nombre :");
		c = sc.nextInt();
		System.out.println ("Veuillez saisir le 2eme nombre :");
		d = sc.nextInt();
		System.out.println ("Veuillez saisir le 1er nombre :");
		a = sc.nextInt();
		System.out.println ("Veuillez saisir le 2eme nombre :");
		b = sc.nextInt();

		System.out.println("Le resultat de la 1ere addition est : "+addition(c,d));
		System.out.println("Le resultat de  la 2eme addition est : "+addition(a,b));

		sc.close();
		

	}

}

package inversion_procedure;

import java.util.Scanner;

public class APP {

	public void inversion(int nombre1, int nombre2) 
	{
		int resultat;
		
		int tmp = nombre1;
		nombre1 = nombre2;
		nombre2 = tmp;
		
	}
	
public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Veuillez saisir le 1er nombre :");
		a = sc.nextInt();
		System.out.println ("Veuillez saisir le 2eme nombre :");
		b = sc.nextInt();
		
		System.out.println("Le resultat est : "+inversion(a,b));

		sc.close();

}

}

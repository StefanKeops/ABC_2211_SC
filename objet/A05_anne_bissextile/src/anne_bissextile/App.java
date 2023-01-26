package anne_bissextile;

import java.util.Scanner;

public class App {
	
	public static void bissextile (int annee) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir l'année : ");
		
		annee = sc.nextInt();
		
		System.out.println("Vous avez saisi l'année"+annee);
		
		if (
				annee % 4 != 0 ||
				(annee % 100 == 0 && 
				annee % 400 != 0 )
			) {
			System.out.println("L'année "+annee+" n'est pas bisextile.");
		}
		
		else {
			System.out.println("L'année "+annee+ " est bisextile.");
		}
		sc.close();
	}

	public static void main(String[] args) {
		
		int annee = 0;
		
		bissextile(annee);

	}

}

package exemple_procedure_fonction;

import java.util.Scanner;

public class App {
	
	//procedure qui ne prend aucun argument
	public static void disBonjour()
	{
		System.out.println("Bonjour !!!");
	}
	
	// procedure qui prend en argument une chaine de caractère
	public static void disBonjourPrenom(String prenom)
	{
		System.out.println("Bonjour " + prenom);
	}

	public static void main(String[] args) {
		
		String saisie;
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir votre prenom :");
			saisie = sc.nextLine();
			
			//appel de la procedure sans argument
			disBonjour();
			
			// appel de la procedure avec l'ardument chaine de caractère
			disBonjourPrenom(saisie);
			
			sc.close();
	}

}

package tableau_en_java;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// declaration d'un tableau de chaine de caractère
		
		String [] tabPrenom = new String[] {"Terence", "Fréderic", "Mickael", "Stefan", "Olivier", "Guillaume", "Mustafa", "Rafael", "Natana", "Kévin", "Florian", "Samba"};
		
		// stokage de valeur dans le tableau tabPrenom
		
		/* tabPrenom[0] = "Terence";
		tabPrenom[1] = "Fréderic";
		tabPrenom[2] = "Mickael";
		tabPrenom[3] = "Stefan";
		tabPrenom[4] = "Olivier";
		tabPrenom[5] = "Guillaume";
		tabPrenom[6] = "Mustafa";
		tabPrenom[7] = "Rafael";
		tabPrenom[8] = "Natana";
		tabPrenom[9] = "Kévin";
		tabPrenom[10] = "Florian";
		tabPrenom[11] = "Samba";
		*/
		
		System.out.println("Saisissez le nombre à rechercher :");
	    int nombre_a_rechercher = sc.nextInt();
	    if (nombre_a_rechercher >= 1 && nombre_a_rechercher <= 12) {
	    	System.out.println("Le prenom du stagiaire " + nombre_a_rechercher + " est " + tabPrenom[nombre_a_rechercher-1]);
	    	
	    	System.out.println("Bonjour " + tabPrenom[nombre_a_rechercher-1]);
	    	
	    } else {
	    	
	    	System.out.println("Error 404 not found.");
	    
	    }

	}

}

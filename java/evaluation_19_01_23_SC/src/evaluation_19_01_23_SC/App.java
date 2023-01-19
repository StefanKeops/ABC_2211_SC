package evaluation_19_01_23_SC;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
        
		
		
		Scanner sc = new Scanner(System.in);  // permet de lire des saisies utilisateur
		
		// declaration d'un tableau de chaine de caractère
		
		String [] tabMois = new String[] {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
		
		System.out.println("Saisissez le numéro de mois:");
	    int mois = sc.nextInt();
	    if (mois <= 12 && mois % 2 == 1) 
	    	System.out.println("Le mois de " + tabMois[mois-1] +"(" + mois + ") " + "est impair");
	    
	        System.out.println("Les jours paires du mois sont: 2, 4, 6, 8, 12 14, 16, 18, 22, 24, 26");
	    
		if (mois <= 12 && mois % 2 == 0) {
	    	System.out.println("Le mois de " + tabMois[mois-1] +"(" + mois + ") " + "est pair");
	    	
	    	System.out.println("Les jours impaires du mois sont: 1, 5, 7, 11, 13, 17, 19, 23, 25, 29, 31");
	   
		}  else {
	    	
	    	System.out.println("Numéro de mois invalide, veuillez recommenecer");
	    
	    }

	}

}
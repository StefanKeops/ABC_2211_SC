package evaluation;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
        
		
		
		Scanner sc = new Scanner(System.in);  // permet de lire des saisies utilisateur
		
		// declaration d'un tableau de chaine de caractère
		
		String [] tabMois = new String[] {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
		
		System.out.println("Saisissez le numéro de mois:");
	    int mois = sc.nextInt();
	    int i = 0;
		if (mois <= 12 && mois % 2 == 1)
	    	 if (i % 2 == 0 && i != 10 && i != 20 && i != 30)
	    		 for (i = 1; i <= 31; i++) {
	    	    {
	    	    	
	    	    	System.out.println("Les jours paires du mois sont:" + i);
	    	    	
	    	    	System.out.println("Le mois de " + tabMois[mois-1] +"(" + mois + ") " + "est impair");
	    	    	return;

	    	    	}
	    	}
	    
		if (mois <= 12 && mois % 2 == 0)
			if (i % 2 == 1 && i % 3 == 0) {
				for ( i = 1; i <= 31; i++) {
	    	    	
	    	    	System.out.println("Les jours impaires du mois sont:" + i);
	    	    	    	        
	    	      	System.out.println("Le mois de " + tabMois[mois-1] +"(" + mois + ") " + "est pair");
	    	      	return;
	    	      	    		    	
	    	   }
	    		 	   
	    	        }  else {
	    		    	
	    	        	{
	    	        		
	    		    	System.out.println("Numéro de mois invalide, veuillez recommenecer");
	    		    
	    		    }
	    	
	    	        }
	    	    }
}


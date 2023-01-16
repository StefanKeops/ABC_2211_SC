package suite_de_conway;


public class App {

	public static void main(String[] args)
	{
		System.out.println("Suite de Conway !");
				
		
		String valeurs = "11211";
		
		
		String chiffre = valeurs.substring(0, 1); // lis le 1er charactère de la chaine "valeurs"
		
		// char Chiffre = valeurs.charAt(0)
		
		int occurences = 1;
		
		String resultat = "";
		
		for (int i = 1; i < valeurs.length(); i++) {
			
			String charactere = valeurs.substring(i, i+1); 
		
			
			if(chiffre.equals(charactere)) {
				++occurences;
			} else {
				resultat =  resultat + occurences + valeurs.substring(i-1,i);
				chiffre = charactere;
				occurences = 1;
		
		}
	}
	// ajout un nombre d'occurences du dernier charactere
	resultat = resultat + "" + occurences + "" + valeurs.charAt(valeurs.length()-1); 
	System.out.println(resultat);
	
	
	
	
	System.out.println("Programme terminé !");
}
}
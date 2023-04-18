package recherche_une_lettre_dans_une_chaine_de_caracteres;

/*
 VARIABLES
 chaine = "."
 
 DEBUT PROGRAMME
 chaine = "." // Soit une chaine de caractère terminée par le caractère « . ».
 
 si chaine = 0 ou ".":
 écrire "LA CHAINE EST VIDE"
 fin si
 
  END PROGRAMME
 */

public class App {

	public static void main(String[] args) {
		
		String chaine = ".";
		
		if(chaine.length() == 0 || (chaine.length() == 1 && chaine.charAt(0) == '.')) {
			System.out.println("LA CHAINE EST VIDE");
		} 
		
		else { 
			System.out.println(chaine);

		}
			
  }
	
}

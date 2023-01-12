package recherche_une_lettre_dans_une_chaine_de_caracteres3;

/*
VARIABLES
chaine = ""
chaine2 = "Soit une chaine de caractère terminée par le caractère x"
lettre2 = b
chaine3 = "la somme dont Barnabé disposait au départ"
lettre3 = t

DEBUT PROGRAMME
chaine = "" // Soit une chaine de caractère vide.

si chaine = 0 
écrire "LA CHAINE EST VIDE"
fin si

chaine2 = "Soit une chaine de caractère terminée par le caractère x" // Soit une chaine de caractère.
lettre2 = b // Soit une letter a rechercher.

si letter = 0
écrire """Le nombre d'occurences de " + letter2 + " est : " + count2
fin si

chaine3 = "la somme dont Barnabé disposait au départ" // Soit une chaine de caractère.
lettre3 = t // Soit une letter a rechercher.

si lettre <= 1
écrire """Le nombre d'occurences de " + letter3 + " est : " + count3
fin si
END PROGRAMME
*/

public class App {

	public static void main(String[] args) {
		String chaine = "";
		String chaine2 = "Soit une chaine de caractère terminée par le caractère x";
		String chaine3 = "la somme dont Barnabé disposait au départ";
		char letter2 = 'b';
		char letter3 = 't';
		int count2 = 0;
		int count3 = 0;
		
		if(chaine.length() == 0) {
			System.out.println("LA CHAINE EST VIDE");
		    }
		
         for(int i=0; i < chaine2.length(); i++) 
        {
            if(chaine2.charAt(i) == letter2)
            {
                count2++;
            }
        }
        System.out.println("Le nombre d'occurences de " + letter2 + " est : " + count2);
		
		if(chaine3.isEmpty() || chaine3.equals(".")) {
            System.out.println("LA CHAINE EST VIDE");
        }
        
        for(int i=0; i < chaine3.length(); i++) 
        {
            if(chaine3.charAt(i) == letter3)
            {
                count3++;  
            }
        }
        System.out.println("Le nombre d'occurences de " + letter3 + " est : " + count3);
        
    }
}
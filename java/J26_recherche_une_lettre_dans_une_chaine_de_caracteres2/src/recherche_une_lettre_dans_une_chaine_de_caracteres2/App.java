package recherche_une_lettre_dans_une_chaine_de_caracteres2;

/*
VARIABLES
chaine = "father."
lettre = a

DEBUT PROGRAMME
chaine = "father." // Soit une chaine de caractère terminée par le caractère « . ».

si chaine = 0 ou ".":
écrire "LA CHAINE EST VIDE"
fin si

sinon
retourne chaine.count(lettre)
fin si

écrire "Le nombre d'occurences de " + letter + " est : " + count
END PROGRAMME
*/

public class App {

public static void main(String[] args) {
		
		String chaine = "father.";
		char letter = 'a';
		int count = 0;
		
		if(chaine.isEmpty() || chaine.equals(".")) {
            System.out.println("LA CHAINE EST VIDE");
            return;
        }
        
        for(int i=0; i < chaine.length(); i++) {
            if(chaine.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("Le nombre d'occurences de " + letter + " est : " + count);
    }
}
package conversion;

/*

* DEBUT DU PROGRAMME

	Écrire "Entrez une valeur en kilomètres (0.01 à 1 000 000) ou 'q' pour quitter :"

 	Lire input

		Tant que (input n'est pas égal à "q")

		Si (input n'est pas un nombre valide) alors

	Écrire "La valeur saisie n'est pas un nombre valide."

	Écrire "Entrez une valeur en kilomètres (0.01 à 1 000 000) ou 'q' pour quitter :"

 	Lire input

		Fin Si

		Si (input est inférieur à 0.01 ou input est supérieur à 1 000 000) alors

	Écrire "La valeur saisie est hors limite."

	Écrire "Entrez une valeur en kilomètres (0.01 à 1 000 000) ou 'q' pour quitter :"

	Lire input

		Sinon

		Sortir de la boucle

		Fin Si

		Fin Tant que

	Écrire "Au revoir!"

FIN DU PROGRAMME

*/

 

 

import java.util.Scanner;

 

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

 
		while (true) {

			System.out.print("Entrez une valeur en kilomètres (0.01 à 1 000 000) ou 'q' pour quitter: ");

			String input = scanner.nextLine();

 

		if (input.equals("q")) {

		break;

}

 

	double distance;

		try {

			distance = Double.parseDouble(input);

			} catch (NumberFormatException e) {

		System.out.println("La valeur saisie n'est pas un nombre valide.");

		continue;

}

 
		if (distance < 0.01 || distance > 1000000) {

		System.out.println("La valeur saisie est hors limite.");

		} else {

			// traitement de la valeur saisie ici

			break;

}

}

 

		System.out.println("Au revoir!");

}

}
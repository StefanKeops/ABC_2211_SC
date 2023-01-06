package jeu_de_la_fourchette;

/*VARIABLE
 
 Générer aléatoirement un nombre entier compris entre 1 et 100 et le stocker dans une variable nombre_mystere
Déclarer un tableau tentatives vide et une variable nb_essais initialisée à 0
Tant que nombre_saisi != nombre_mystere
  Demander à l'utilisateur de deviner le nombre mystère en saisissant un nombre entier et le stocker dans une variable nombre_saisi
  Ajouter nombre_saisi au tableau tentatives et incrémenter nb_essais de 1
  Si nombre_saisi < nombre_mystere
    Afficher "Le nombre saisi est trop petit."
  Sinon si nombre_saisi > nombre_mystere
    Afficher "Le nombre saisi est trop grand."
  Fin Si
Fin Tant que
Afficher "Bravo ! Vous avez trouvé le nombre mystère en nb_essais essais !"
  
 */

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Random rand = new Random();
	    int nombre_mystere = rand.nextInt(100) + 1;
	    int nombre_saisi;
	    ArrayList<Integer> tentatives = new ArrayList<>();
	    int nb_essais = 0;
	    do {
	      System.out.println("Devinez le nombre mystère (entre 1 et 100) :");
	      nombre_saisi = sc.nextInt();
	      tentatives.add(nombre_saisi);
	      nb_essais++;
	      if (nombre_saisi < nombre_mystere) {
	        System.out.println("Le nombre saisi est trop petit.");
	      } else if (nombre_saisi > nombre_mystere) {
	        System.out.println("Le nombre saisi est trop grand.");
	      }
	    } while (nombre_saisi != nombre_mystere);
	    System.out.println("Bravo ! Vous avez trouvé le nombre mystère en " + nb_essais + " essais !");
	  }
	}

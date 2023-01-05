package jeu;

/*
 VARIABLES
 	score_joueur1 <- 0
score_joueur2 <- 0
tour <- 1

boucle infinie :
   afficher "Score actuel : Joueur 1 = " + score_joueur1 + " points, Joueur 2 = " + score_joueur2 + " points"
   saisie_joueur1 <- demander au joueur 1 de saisir un nombre entre 0 et 2 (inclus)
   si saisie_joueur1 n'est pas un entier entre 0 et 2 (inclus) :
      afficher un message d'erreur
      continuer la boucle
   score_joueur1 <- score_joueur1 + saisie_joueur1
   si score_joueur1 atteint 10 :
      afficher "Le joueur 1 a gagné!"
      quitter la boucle
   saisie_joueur2 <- demander au joueur 2 de saisir un nombre entre 0 et 2 (inclus)
   si saisie_joueur2 n'est pas un entier entre 0 et 2 (inclus) :
      afficher un message d'erreur
      continuer la boucle
   score_joueur2 <- score_joueur2 + 
 */

import java.util.Scanner;

public class App {
	
	 public static void main(String[] args) {
	      // Définition des variables
	      int scoreJoueur1 = 0;
	      int scoreJoueur2 = 0;
	      int tour = 1;
	      Scanner sc = new Scanner(System.in);

	      // Boucle infinie
	      while (true) {
	         System.out.println("Tour " + tour + " :");
	         System.out.println("Score actuel : Joueur 1 = " + scoreJoueur1 + " points, Joueur 2 = " + scoreJoueur2 + " points");

	         // Demande de saisie au joueur 1
	         System.out.print("Joueur 1, entrez un nombre entre 0 et 2 (inclus) : ");
	         int saisieJoueur1 = sc.nextInt();
	         if (saisieJoueur1 < 0 || saisieJoueur1 > 2) {
	            System.out.println("Vous devez saisir un nombre entre 0 et 2 (inclus) !");
	            continue;
	         }
	         scoreJoueur1 += saisieJoueur1;
	         if (scoreJoueur1 >= 10) {
	            System.out.println("Le joueur 1 a gagné !");
	            break;
	         }

	         // Demande de saisie au joueur 2
	         System.out.print("Joueur 2, entrez un nombre entre 0 et 2 (inclus) : ");
	         int saisieJoueur2 = sc.nextInt();
	         if (saisieJoueur2 < 0 || saisieJoueur2 > 2) {
	            System.out.println("Vous devez saisir un nombre entre 0 et 2 (inclus) !");
	            continue;
	         }
	         scoreJoueur2 += saisieJoueur2;
	         if (scoreJoueur2 >= 10) {
	            System.out.println("Le joueur 2 a gagné !");
	            break;
	         }

	         tour++;
	      }
	   }

    }
	
	

package diviseurs_nombre;

/*
 VARIABLES
 i := entier // interateur
 n := entier // saisir de l'utilisateur
 
 DEBUT DE PROGRAMME
 
 Ecrire  "Veuillez saisir un nombre"
 lire n
 
 Définir une fonction "trouver_diviseurs" qui prend un nombre entier "n" en entrée
   Créer une liste vide "diviseurs"
   Pour chaque nombre entier "i" allant de 1 à "n"
      Si "n" est divisible par "i"
         Ajouter "i" à la liste "diviseurs"
   Retourner "diviseurs"
  
  FIN DE PROGRAMME
 */

import java.util.ArrayList;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur
		
		sc= new Scanner(System.in);
		
		System.out.print("Veuillez saisir un nombre :  ");
		
		n = (int) sc.nextDouble();

	    ArrayList<Integer> diviseurs = trouverDiviseurs(n);

	    System.out.println("Les diviseurs de " + n + " sont : " + diviseurs);
	    
	    sc.close();
	  }

	public static ArrayList<Integer> trouverDiviseurs(int n) {
	    ArrayList<Integer> diviseurs = new ArrayList<>();
	    for (int i = 2; i < n; i++) {
	      if (n % i == 0) {
	        diviseurs.add(i);
	      }
	    }
	    return diviseurs;
	  }
	}
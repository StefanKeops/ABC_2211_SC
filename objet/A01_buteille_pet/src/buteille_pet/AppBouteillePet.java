package buteille_pet;

import java.util.Scanner;

public class AppBouteillePet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int volume = 1000;
		String coleur = "bleu";
		String materiel = "plastique";
		int masse = 29;
		int hauteur = 24;
		int diametreDuCol = 38;
		boolean ouvrir;
		boolean fermer;
		boolean remplir;
		boolean vider;
		String coleur1 = "transparrente";
		String materiel1 = "verre";
		int masse1 = 704;
		int hauteur1 = 26;
		int diametreDuCol1 = 40;
		int volume1 = 500;
		String coleur11 = "noire";
		String materiel11 = "inox";
		int masse11 = 300;
		int buteille_choisi;
		
		System.out.println("Choisissez la bouteille dans laquelle vous souhaitez mettre le liquide (1, 2, 3) :");
		
	    buteille_choisi = sc.nextInt();
		
		if (buteille_choisi = 1) {
			System.out.println("Buteille 1. caracteristiques : " + volume + " ml " + coleur + " avec un masse de " + masse + ", hauteur de " + hauteur + " et un diametre du col de " + diametreDuCol);
	  
		} else if (buteille_choisi = 3) {
	    	  System.out.println("Buteille 3. caracteristiques : " + volume1 + " ml " + coleur11 + " avec un masse de " + masse11 + ", hauteur de " + hauteur1 + " et un diametre du col de " + diametreDuCol1);
	      }
	    while (buteille_choisi = 2); {
	    	System.out.println("Buteille 2. caracteristiques : " + volume + " ml " + coleur1 + " avec un masse de " + masse1 + ", hauteur de " + hauteur1 + " et un diametre du col de " + diametreDuCol);
          }		  

	}

}

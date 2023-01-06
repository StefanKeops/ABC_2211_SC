package nombre_premier;

/*
VARIABLES
	entier nombre
	entier i
	booléen est_premier
	
	est_premier <-- vrai
	
DEBUT DU PROGRAMME
	écrire "saisir nombre"
	lire nombre

	pour i de 2 à n - 1
		if n mod i = 0 alors
			est_premier <-- faux
		fin si
	fin pour
	
	si est_premier = vrai alors
		écrire "n est premier"
	sinon
		écrire "n n'est pas premier"
	fin si
FIN DU PROGRAMME 
*/

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		  int reste;
		  boolean flag = true;
		  int nombre;
		  
		  Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur
		        
		  System.out.print("Veuillez saisir un nombre :  ");
			
			nombre = (int) sc.nextDouble();
			
			nombre = (int) Math.abs(nombre);
		  
		  for(int i=2; i <= nombre/2; i++)
		  {
		     //nombre est divisible par lui-meme
		     reste = nombre%i;
		            
		     //si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
		     if(reste == 0)
		     {
		        flag = false;
		        break;
		     }
		  }
		  //si flag est true, alors nombre est premier, sinon non premier
		  if(flag)
		     System.out.println(nombre + " est un nombre premier");
		  else
		     System.out.println(nombre + " n'est pas un nombre premier");

	}

}

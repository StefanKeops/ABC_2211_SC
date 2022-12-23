package nombre_premier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		  int reste;
		  boolean flag = true;
		  int nombre=13;
		  
		  Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur
		        
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

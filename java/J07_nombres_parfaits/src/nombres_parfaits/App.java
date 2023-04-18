package nombres_parfaits;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int compt = 0, n, k, somdiv, nbr;
		
		Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur
		
        System.out.print("Entrez combien de nombre parfaits : ");
        n = sc.nextInt(); // appelle l'utilisateur à sausir un nombre entier dans la console;
        nbr = 2;
        while (compt != n)
        { somdiv = 1;
           k = 2;
          while(k <= nbr/2 )
          { 
          if (nbr % k == 0) somdiv += k ;
              k++;
          }
          if (somdiv == nbr) 
          { System.out.println(nbr+" est un nombre parfait");
              compt++;
          }
           nbr++;

	}

} }

package inversion_procedure;

/*
PROCEDURE Inversion (VAL entier nombre1 , VAL entier b)

    tmp <-- nombre1
    nombre1 <-- nombre2
    nombre2 <-- nombre1
	
	ecrire: "Aprés inversion : valeur de premier nombre : +nombre1+ valeur de deuxiemme nombre : +nombre2

FIN PROCEDURE

DEBUT PROGRAMME

    nombre1 est un eniter
    nombre2 est un entier
    tmp est un entier

    Ecrire "Veuillez saisir la premiere valeur"
    Lire nombre1    
 	
 	Ecrire "Veuillez saisir la Seconde valeur"
    lire nombre2    

	Inversion( nombre1 , nombre2)

FIN PROGRAMME
*/

import java.util.Scanner;

public class APP {

	public static void inversion(int nombre1, int nombre2) 
	{
		int tmp;
		
		tmp = nombre1;
		nombre1 = nombre2;
		nombre2 = tmp;
		
        System.out.println("Aprés inversion : valeur de premier nombre : "+nombre1+" valeur de deuxiemme nombre : "+nombre2);
	}
	
public static void main(String[] args) {
		
		int nombre1;
		int nombre2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Veuillez saisir le 1er nombre :");
		nombre1 = sc.nextInt();
		System.out.println ("Veuillez saisir le 2eme nombre :");
		nombre2 = sc.nextInt();
		
		inversion(nombre1, nombre2);

		sc.close();

}

}

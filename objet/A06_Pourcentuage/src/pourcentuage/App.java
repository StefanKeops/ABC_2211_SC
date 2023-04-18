package pourcentuage;

import java.util.Scanner;

public class App {
	
	public static void pourcentage (int CarteBleue, int cheque, int virement) {
		
		double resultat;
		double resultat2;
		double resultat3;
	    int total = CarteBleue + cheque + virement;
		
		resultat = ((double) CarteBleue / total * 100);
		resultat2 = ((double) cheque / total * 100);
		resultat3 = ((double) virement / total * 100);
		
		System.out.println(resultat + "% par Carte Blue");
		
		System.out.println(resultat2 + "% par chaque");
		
		System.out.println(resultat3 + "% par virement");
		
		}

	public static void main(String[] args) {
		
		int CarteBleue;
		int cheque;
		int virement;
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le nombre de paiements par Carte Bleue : ");
		CarteBleue = sc.nextInt();
		
		System.out.println("Veuillez saisir le nombre de paiements par cheque : ");
		cheque = sc.nextInt();
		
		System.out.println("Veuillez saisir le nombre de paiements par virement : ");
		virement = sc.nextInt();
		
	pourcentage(CarteBleue, cheque, virement);
	
	sc.close();
	}
	
}

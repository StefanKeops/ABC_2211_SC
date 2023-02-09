package projet_ascenseur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Ascenseur schindler = new Ascenseur (84, true, 21, "Schindler");
		
		System.out.println(schindler.toString());
		
		// schindler.appele()
		
		double aAppele = schindler.appeler();
		
		System.out.println("A quel étage voulez-vous aller?");
		
		System.out.println(schindler.toString());
		
		// shindler.monter()
		
		boolean aMonte = schindler.monter();
		
		if (aMonte  == true) {
			System.out.println("Préparez-vous pour arrivée instantanée en paradis");
			
		} else {
			System.out.println("Préparez-vous pour descendre aux enfers ");
		}
		System.out.println(schindler.toString());

		System.out.println("Saint Pierre : dis-moi tes péchés");
}}	

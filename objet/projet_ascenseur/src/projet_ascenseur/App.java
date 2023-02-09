package projet_ascenseur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Ascenseur schindler = new Ascenseur (84, true, 21, "Schindler");
		
		// schindler.appele()
		
		boolean aAppele = schindler.appeler();
		
		if (aAppele == true) {
			
			System.out.println("A quel étage voulez-vous monter?");
						
	} else {
			
		System.out.println("A quel étage voulez-vous monter?");
		
			}
		System.out.println(schindler.toString());

}}	

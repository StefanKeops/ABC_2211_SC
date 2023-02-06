package projet_ascenseur;

public class App {

	public static void main(String[] args) {
		
		Ascenseur schindler = new Ascenseur (84, true, 21, "Schindler");
		
		// schindler.appele()
		
		boolean aAppele = schindler.appeler();
		if (aAppele == true) {
			System.out.println("L'ascenseur a été appelé et est arrivé. Veuillez indiquer le nombre de personnes qui montent dans l'ascenseur");
		
	} else {
			System.out.println("L'ascenseur était déjà à cet étage. Veuillez indiquer le nombre de personnes qui montent dans l'ascenseur");
	}
		System.out.println(schindler.toString());

}}	

package projet_porte_garage;

public class App {
		
	public static void main(String[] args) {
		
		PorteGarage STANDARD = new PorteGarage (2000, 2400, true, false);
		System.out.println(STANDARD.toString());
		
		// STANDARD.ouvrir()
		
				int aReussi= STANDARD.ouvrir();
				if (aReussi == 0){
					System.out.println("La porte de garage a pu etre ouverte");
				}
				else if (aReussi == 1) {
					System.out.println("La porte de garage n'a pas pu etre ouverte car elle etait déjà ouverte");
				}
				else {
					System.out.println("La porte de garage n'a pas pu etre ouverte car elle etait verrouille");
				}
				System.out.println(STANDARD.toString());
				
		//STANDARD.demiouvrir(1000); 
				
				boolean aDemiOuvri  = STANDARD.demiOuvrir(1000); // (x) distance en mm pour la ouverture partiale du porte
				if (aDemiOuvri == true) {
					System.out.println("La porte est entrouverte");
				}
				else {
					System.out.println("Le portail ne peut pas être ouvert plus que l'ouverture maximale");
				}
				System.out.println(STANDARD.toString());
				
		// STANDARD.ouvrirTelecomande()
				
				int aReussi1= STANDARD.ouvrirTelecomande(3); // (x) distance en m pour la distance entre porte et voiture
				if (aReussi1 == 0){
					System.out.println("La porte de garage a pu etre ouverte avec la telecomande");
				}
				else if (aReussi1 == 1) {
					System.out.println("La porte de garage n'a pas pu etre ouverte car vous etais a un distance plus grande de 3 m.");
				}
				else {
					System.out.println("La porte de garage n'a pas pu etre ouverte car elle etait déjà ouverte");
				}
				System.out.println(STANDARD.toString());
	}

}

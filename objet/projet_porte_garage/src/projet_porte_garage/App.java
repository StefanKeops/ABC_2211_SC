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
				
		//STANDARD.partialle(); 
				
				int pourcentage  = STANDARD.partialle();
				if (pourcentage <= 100) {
					System.out.println("La porte est " + pourcentage + "% ouverte");
				}
				else {
					System.out.println("Le porte ne peut pas être ouvert plus que l'ouverture maximale");
				}
				System.out.println(STANDARD.toString());
				
		//STANDARD.fermer
				
				boolean aFerme = STANDARD.fermer();
				if (aFerme == true) {
					System.out.println("La porte de garage a pu etre ferme");
				}
				else {
					System.out.println("La porte de garage n'a pas pu etre ferme car elle etait déjà ferme");
				}
				System.out.println(STANDARD.toString()); 
				
		// STANDARD.ouvrirTelecomande()
				
				boolean aReussi1= STANDARD.ouvrirTelecomande(); // (x) distance en m pour la distance entre porte et voiture
				if (aReussi1 == true){
					System.out.println("La porte de garage a pu etre ouverte avec la telecomande");
				}
				else {
					System.out.println("La porte de garage n'a pas pu etre ouverte car vous etais a un distance plus grande de 3 m.");
				}
					System.out.println(STANDARD.toString());
	}

}

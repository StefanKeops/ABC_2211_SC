package projet_bouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille monster = new Bouteille (550, 500, true, "Monster");
		System.out.println(monster.toString());
		
		// monster.ouvrir()
		
		boolean aReussi= monster.ouvrir();
		if (aReussi==true){
			System.out.println("La bouteille a pu etre ouverte");
		}
		else{
			System.out.println("La bouteille n'a pas pu etre ouverte car elle etait déjà ouverte");
		}
		System.out.println(monster.toString());
		
		boolean aReussi2= monster.ouvrir();
		if (aReussi2==true){
			System.out.println("La bouteille a pu etre ouverte");
		}
		else{
			System.out.println("La bouteille n'a pas pu etre ouverte car elle etait déjà ouverte");
		}
		System.out.println(monster.toString());
		
		// monster.fermer();
		
		boolean aFerme = monster.fermer();
		if (aFerme == true) {
			System.out.println("La bouteille a pu etre ferme");
		}
		else {
			System.out.println("La bouteille n'a pas pu etre ferme car elle etait déjà ferme");
		}
		System.out.println(monster.toString()); 
		
		// monster.remplirTout();
		
		boolean aToutRempli = monster.remplirTout();
		if (aToutRempli == true) {
			System.out.println("La bouteille est ouverte et pleine");
		}
		else {
			System.out.println("La bouteille a ete ouverte et rempli");
		}
		System.out.println(monster.toString());
		
		//monster.remplir(50);
		
		boolean aRempli = monster.remplir(50);
		if (aRempli == true) {
			System.out.println("le contenu est complètement entré dans la bouteille");
		}
		else {
			System.out.println("La bouteille il est pleine et s'est renverse");
		}
		System.out.println(monster.toString());
		
		//monster.viderTout();
		
		boolean aToutVide = monster.viderTout();
		if (aToutVide == true) {
			System.out.println("La bouteille a été vidée de son contenu");
		}
		else {
			System.out.println("La bouteille n'a pas été vidée de son contenu car elle était déjà vide ou fermée");
		}
		System.out.println(monster.toString());
		
		boolean aVide = monster.vider(50);
		if (aVide == true) {
			System.out.println("une partie du contenu a été vidée de la bouteille");
		}
		else {
			System.out.println("Le contenu de la bouteille n'a pas pu être vidé car elle était déjà vide");
		}
		System.out.println(monster.toString());
		
		String getNom = monster.DonneLeNom();
		System.out.println(getNom);
	
		
	}
	
	}

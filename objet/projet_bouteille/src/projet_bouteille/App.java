package projet_bouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille monster = new Bouteille (550, 500, false, "Monster");
		System.out.println(monster.toString());
		
		Boolean aReussi= monster.ouvrir();
		if (aReussi==true){
			System.out.println("La bouteille a pu etre ouverte");
		}
		else{
			System.out.println("La bouteille n'a pas pu etre ouverte car elle etait déjà ouverte");
		}
		System.out.println(monster.toString());
		
		Boolean aReussi2= monster.ouvrir();
		if (aReussi2==true){
			System.out.println("La bouteille a pu etre ouverte");
		}
		else{
			System.out.println("La bouteille n'a pas pu etre ouverte car elle etait déjà ouverte");
		}
		System.out.println(monster.toString());
		
		
		// monster.fermer();
		// monster.remplirTout();
		//monster.remplir(45);
		//monster.viderTout();

	}

}

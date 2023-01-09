package exemple_tableau;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] tabEntier = new int[] {1,2,3,4};
		
		// declaration d'un tableau de chaine de caractère
		String [] tabPrenom = new String[3];
		// stokage de valeur dans le tableau tabPrenom
		tabPrenom[0] = "David";
		tabPrenom[1] = "Paul";
		tabPrenom[2] = "Jean";
		
		// affichage de l'élément à l'indice 1
		System.out.print(tabPrenom[1]);
		
		// affichage de tout les éléments du tableau
		for(int i = 0; i <=tabPrenom.length-1; i++)
		{
			System.out.println(tabPrenom[i] + " " + i);
		}

	}

}

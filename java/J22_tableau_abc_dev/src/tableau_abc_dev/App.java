package tableau_abc_dev;

public class App {

	public static void main(String[] args) {
		// int[] tabEntier = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		
		// declaration d'un tableau de chaine de caractère
		String [] tabPrenom = new String[12];
		// stokage de valeur dans le tableau tabPrenom
		tabPrenom[0] = "Terence";
		tabPrenom[1] = "Fréderic";
		tabPrenom[2] = "Mickael";
		tabPrenom[3] = "Stefan";
		tabPrenom[4] = "Olivier";
		tabPrenom[5] = "Guillaume";
		tabPrenom[6] = "Mustafa";
		tabPrenom[7] = "Rafael";
		tabPrenom[8] = "Natana";
		tabPrenom[9] = "Kévin";
		tabPrenom[10] = "Florian";
		tabPrenom[11] = "Samba";
		
		String [] tabNom = new String[12];
		
		tabNom[0] = "B";
		tabNom[1] = "C";
		tabNom[2] = "C";
		tabNom[3] = "C";
		tabNom[4] = "D";
		tabNom[5] = "D";
		tabNom[6] = "M";
		tabNom[7] = "M";
		tabNom[8] = "R";
		tabNom[9] = "R";
		tabNom[10] = "S";
		tabNom[11] = "S";
		// affichage de l'élément à l'indice 1
		// System.out.printf(tabPrenom[1], tabNom[1]);
		
		// affichage de tout les éléments du tableau
		for(int i = 0; i <=tabPrenom.length-1; i++)
		{
			System.out.println(i + " " + tabPrenom[i] + " " + tabNom[i]);
		}

	}

}

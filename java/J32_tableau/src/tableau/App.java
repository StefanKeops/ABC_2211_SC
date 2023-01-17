package tableau;

public class App {

		public static void main(String[] args) {
			
		int[] tabEntier = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		// double pi = Math.PI;
		
		// declaration d'un tableau de chaine de caractère
		
		String [] tabFigureGeometrique = new String[4];
		
		// stokage de valeur dans le tableau tabFigureGeometrique
		
		tabFigureGeometrique[0] = "Figure Geometrique";
		tabFigureGeometrique[1] = "       Cerc       ";
		tabFigureGeometrique[2] = "     Triangle     ";
		tabFigureGeometrique[3] = "      Carré       ";
		
		String [] tabRayon = new String[4];
		// stokage de valeur dans le tableau tabRayon (raza)
		
		tabRayon[0] = "Cotes - Rayon ";
		tabRayon[1] = "    10 cm     ";
		tabRayon[2] = "    10 cm     ";
		tabRayon[3] = "    10 cm     ";
		
		String [] tabDiametre = new String [4];
		
		// stokage de valeur dans le tableau tabDiametre (diametrul)
		
		tabDiametre[0] = "Hauteur - Diametre";
		tabDiametre[1] = "        " + String.valueOf(2 * 10) + "        ";
		tabDiametre[2] = " " + String.valueOf((10 * Math.sqrt(3)) / 4);
		tabDiametre[3] = "      10   cm     ";
		
		String [] tabAire = new String[4];
		
		// stokage de valeur dans le tableau tabAire (arie)
		
		tabAire[0] = "      Aire       ";
		tabAire[1] = String.valueOf(Math.PI  * 10 * 10);
		tabAire[2] = String.valueOf(10 * 10 * (Math.sqrt(3) / 4));
		
		String [] tabPerimetre = new String[4];
		
		// stokage de valeur dans le tableau tabPerimetre (perimetru)
		
		tabPerimetre[0] = "Perimetre";
		tabPerimetre[1] = String.valueOf(2 * Math.PI * 10);
		tabPerimetre[2] = String.valueOf(3 * 10);
		
		// affichage de tout les éléments du tableau
		for(int i = 0; i <=tabFigureGeometrique.length-1; i++)
		{
		System.out.println(i + " " + "|" + " " + tabFigureGeometrique[i] + " " + "|" + " " + tabRayon[i] + " " + "|" + " " + tabDiametre[i]+  " " + "cm" + " " + "|" + " " + tabAire[i]+  " " + "cm²" + " " + "|" + " " + tabPerimetre[i]+  " " + "cm");
		}

	}

}

package tableau;

public class App {

		public static void main(String[] args) {
			
		int[] tabEntier = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		
		// declaration d'un tableau de chaine de caractère
		
		String [] tabFigureGeometrique = new String[7];
		
		// stokage de valeur dans le tableau tabFigureGeometrique
		
		tabFigureGeometrique[0] = "Figure Geometrique";
		tabFigureGeometrique[1] = "------------------";
		tabFigureGeometrique[2] = "      Cercle      ";
		tabFigureGeometrique[3] = "     Triangle     ";
		tabFigureGeometrique[4] = "      Carré       ";
		tabFigureGeometrique[5] = "     Trapèze      ";
		tabFigureGeometrique[6] = "    Rectangle     ";
		
		String [] tabRayon = new String[7];
		// stokage de valeur dans le tableau tabRayon (raza)
		
		tabRayon[0] = "             Valeurs             ";
		tabRayon[1] = "---------------------------------";
		tabRayon[2] = "            r = 10 cm            ";
		tabRayon[3] = "            l = 10 cm            ";
		tabRayon[4] = "            l = 10 cm            ";
		tabRayon[5] = " l = 10 cm, B = 15 cm, b = 10 cm ";
		tabRayon[6] = "        l = 10 cm, L = 15        ";
		
		String [] tabDiametre = new String [7];
		
		// stokage de valeur dans le tableau tabDiametre (diametrul)
		
		tabDiametre[0] = "Hauteur - Diametre";
		tabDiametre[1] = "------------------";
		tabDiametre[2] = "        " + String.valueOf(2 * 10) + "        ";
		tabDiametre[3] = " " + String.valueOf((10 * Math.sqrt(3)) / 4);
		tabDiametre[4] = "        10        ";
		tabDiametre[5] = "        " + String.valueOf(10 - 2.5) + "       ";
		tabDiametre[6] = "        10        ";
		
		String [] tabAire = new String[7];
		
		// stokage de valeur dans le tableau tabAire (arie)
		
		tabAire[0] = "      Aire       ";
		tabAire[1] = "-----------------";
		tabAire[2] = String.valueOf(Math.PI  * 10 * 10);
		tabAire[3] = String.valueOf(10 * 10 * (Math.sqrt(3) / 4));
		tabAire[4] = "       " + String.valueOf(10 * 10) + "       ";
		tabAire[5] = "       " +String.valueOf(((15+10) / 2) * 7.5) + "      ";
		tabAire[6] = "       " + String.valueOf(15 * 10) + "       ";
		
		String [] tabPerimetre = new String[7];
		
		// stokage de valeur dans le tableau tabPerimetre (perimetru)
		
		tabPerimetre[0] = "     Perimetre   ";
		tabPerimetre[1] = "-----------------";
		tabPerimetre[2] = String.valueOf(2 * Math.PI * 10);
		tabPerimetre[3] = "        " + String.valueOf(3 * 10) + "       ";
		tabPerimetre[4] = "        " + String.valueOf(4 * 10) + "       ";
		tabPerimetre[5] = "        " + String.valueOf(2 * 10 + 15 + 10 ) + "       ";
		tabPerimetre[6] = "        " + String.valueOf((2 * 10) + (2 *15)) + "       ";
		
		// affichage de tout les éléments du tableau
		for(int i = 0; i <=tabFigureGeometrique.length-1; i++)
		{
		System.out.println(i + " " + "|" + " " + tabFigureGeometrique[i] + " " + "|" + " " + tabRayon[i] + " " + "|" + " " + tabDiametre[i]+  " " + "cm" + " " + "|" + " " + tabAire[i]+  " " + "cm²" + " " + "|" + " " + tabPerimetre[i]+  " " + "cm" + "|");
		}

	}

}

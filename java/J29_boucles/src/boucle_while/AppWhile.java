package boucle_while;

public class AppWhile {
	
	/**
	 * Afficher tous les nombres de 1 à 100
	 * en remplaçant les multiples de 7 par "bzz"
	 * et les multiples de 5 par "biz"
	 * @param args
	 */
	public static void main(String[] args)
	{
		int indice = 1;
		
		while(indice <= 100)
		{						
			if(indice % 7 == 0) {
				System.out.println("bzzz");
			} else {
				System.out.println(indice);
			}
			
			indice++;
		}	
		
	}

}

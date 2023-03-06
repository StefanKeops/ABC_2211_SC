package exemple_robot;



public class Robot {
	
	private String name;
	
	public Robot(String name)
	{
		this.name = name;
	}

	public enum Action {
		HAUT,
		BAS,
		GAUCHE,
		DROITE,
		TETE;
	}
	
	public void deplacement(Action action) {
		switch(action)
		{
		case HAUT:
			System.out.println("Le robot avance");
			break;
		case BAS:
			System.out.println("le robot recule");
			break;
		case GAUCHE:
			System.out.println("Le robot tourne à gauche");
			break;
		case DROITE:
			System.out.println("Le robot tourne à droite");
			break;
		case TETE:
			System.out.println("Le robot tourne sa tete à 360°");
			break;
		}
		
	}
}

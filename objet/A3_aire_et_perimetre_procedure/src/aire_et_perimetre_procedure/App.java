package aire_et_perimetre_procedure;

public class App {
	
	public static void perimetre(int a, int b, int c)
	{
	
	a = 2;
	b = 3;
	c = 4;
	int perimetre;
	
	perimetre = a + b + c;
	
	System.out.println("Le perimetre du triangle est :" + perimetre);
	}
	
	public static void aire(int a, int b, int c)
	{
		
	a = 2;
	b = 3;
	c = 4;
	double aire;	
	int perimetre= a + b + c;
	
	aire = Math.sqrt(perimetre * (perimetre-a)*(perimetre-b)*(perimetre-c));
	
	System.out.println("L'aire du triangle est :" + aire);
	
	}

	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int c = 4;
		
		perimetre(a, b, c);
		aire(a, b, c);
	}

}

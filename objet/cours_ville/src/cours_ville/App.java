	package cours_ville;
	
	public class App {

		public static void main(String[] args) {
			
			Ville ville = new Ville();
			Ville ville1 = new Ville("Marseille", 807321, "France");
			Ville ville2 = new Ville("Mulhouse", 107215, "France");
			
			System.out.println("\n Ville "+ville.getnomVille()+" ville de "+ville.getNbHabitants()
								+" habitants se situant en "+ville.getNomPays());
			System.out.println(" Ville1 "+ville1.getnomVille()+" ville de "+ville1.getNbHabitants()
			+" habitants se situant en "+ville1.getNomPays());
			System.out.println(" Ville2 "+ville2.getnomVille()+" ville de "+ville2.getNbHabitants()
			+" habitants se situant en "+ville2.getNomPays()+"\n\n");
			
			Ville temp = new Ville();
			temp = ville1;
			ville1 = ville2;
			ville2 = temp;
			System.out.println(" Ville1 "+ville1.getnomVille()+" ville de "+ville1.getNbHabitants()
			+" habitants se situant en "+ville1.getNomPays());
			System.out.println(" Ville2 "+ville2.getnomVille()+" ville de "+ville2.getNbHabitants()
			+" habitants se situant en "+ville2.getNomPays());
			
			ville1.setNomVille("Hong kong");
			ville1.setNomPays("Chine");
			ville2.setNomVille("paris");
			System.out.println(" Ville1 "+ville1.getnomVille()+" ville de "+ville1.getNbHabitants()
			+" habitants se situant en "+ville1.getNomPays());
			System.out.println(" Ville2 "+ville2.getnomVille()+" ville de "+ville2.getNbHabitants()
			+" habitants se situant en "+ville2.getNomPays());
			
			System.out.println("\n\n"+ville.decrisToi());
			System.out.println(ville.decrisToi());
			System.out.println(ville2.decrisToi()+"\n\n");
			System.out.println(ville1.comparer(ville2));
		
		}

	}

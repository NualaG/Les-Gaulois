package histoire;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personnages.Gaulois asterix = new personnages.Gaulois("Astérix", 8);
		personnages.Romain minus = new personnages.Romain("Minus", 6);
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		

	}

}

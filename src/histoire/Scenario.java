package histoire;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personnages.Gaulois asterix = new personnages.Gaulois("Astérix", 8);
		personnages.Romain minus = new personnages.Romain("Minus", 6);
		personnages.Gaulois obelix = new personnages.Gaulois("Obélix", 0);
		personnages.Druide panoramix = new personnages.Druide("Panoramix", 5, 10);
		
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		
		asterix.boirePotion(panoramix);
		asterix.parler("Bonjour");
		
		minus.parler("UN GAU... UN GAUGAU...");
		
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		

	}

}

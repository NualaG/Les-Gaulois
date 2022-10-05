package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum = 20;
	private Gaulois[] villageois = new Gaulois[nbVillageoisMaximum];
	
	

	
	public Village(String nom) {
		this.nom = nom;
	} 
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		
	}
	

}

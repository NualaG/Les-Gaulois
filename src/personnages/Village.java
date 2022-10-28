package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new villageois[nbVillageoisMaximum];
		
	} 
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gauloisAAjouter) {
		if (nbVillageois < nbVillageoisMaximum) {
			villageois[nbVillageois] = gauloisAAjouter;
			nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int numeroDuVillageois){
		return villageois[numeroDuVillageois];
	}

	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles", 30);
		Gaulois gaulois = village.trouverHabitant(30);
	}
}

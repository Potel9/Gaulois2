package personnages;

public class Village {
	private String nom;
	private Chef chef; 
	private int nbVillageoisMax; 
	private Gaulois[] villageois = new Gaulois[nbVillageoisMax]; 
	private int nbVillageois = 0;
	

	 public Village(String nom, int nbVillageoisMax) {
	        this.nom = nom;
	        this.nbVillageoisMax = nbVillageoisMax;
	        this.villageois = new Gaulois[nbVillageoisMax]; // Initialiser ici avec la bonne taille
	    }

public String getNom() {
	return nom;
}
public void setChef(Chef chef) {
	this.chef = chef; 
	System.out.println(chef.getNom()+" est désormais chef du village. " );
}

public int getNbVillageois() {
	return nbVillageois;
}
public void ajouterHabitant(Gaulois gaulois){
	if (nbVillageois < nbVillageoisMax) {
	this.nbVillageois+= 1 ; 
	villageois[nbVillageois]= gaulois ; 
	System.out.println("Bienvenus : "+ gaulois.getNom());
	 
}
}

public Gaulois trouverHabitant(int numHabitant) {
	return villageois[numHabitant]; 
	
}

public void afficherVillageois() {
	System.out.println("Dans le village du chef "+chef.getNom()+" vivent les légendaires gaulois :\n");
	for (int i = 0 ; i <nbVillageois; i++  ) {
		System.out.println(trouverHabitant(i)\n);
	}
	
}

public static void main(String[] args) {
	Village village = new Village("Village des irréductibles", 30);
	//Gaulois gaulois = village.trouverHabitant(30); exception parce que le tableau est indexé en mémoire de 0 à 29 //
	Chef abra = new Chef("Abraracourcix",6,village);
	Gaulois asterix = new Gaulois("Astérix", 8); 
	village.ajouterHabitant(asterix); 
	village.setChef(abra); 
	village.afficherVillageois();
	
	
}




}
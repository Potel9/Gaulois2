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
	System.out.println(chef.getNom()+" est d�sormais chef du village. " );
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
	System.out.println("Dans le village du chef "+chef.getNom()+" vivent les l�gendaires gaulois :\n");
	for (int i = 0 ; i <nbVillageois; i++  ) {
		System.out.println(trouverHabitant(i)\n);
	}
	
}

public static void main(String[] args) {
	Village village = new Village("Village des irr�ductibles", 30);
	//Gaulois gaulois = village.trouverHabitant(30); exception parce que le tableau est index� en m�moire de 0 � 29 //
	Chef abra = new Chef("Abraracourcix",6,village);
	Gaulois asterix = new Gaulois("Ast�rix", 8); 
	village.ajouterHabitant(asterix); 
	village.setChef(abra); 
	village.afficherVillageois();
	
	
}




}
package personnages;
import java.util.Random;

public class Druide {
private String nom;
private int effetPotionMin;
private int effetPotionMax;
private int forcePotion = 1 ; 

public Druide(String nom, int effetPotionMin, int effetPotionMax) {
	this.nom = nom;
	this.effetPotionMin = effetPotionMin;
	this.effetPotionMax = effetPotionMax;
	parler("Bonjour, je suis le druide " + nom
			+ " et ma potion peut aller d'une force " + effetPotionMin + " � "
			+ effetPotionMax + ".");
}

public String getNom() {
	return nom;
}

public void parler(String texte) {
	System.out.println(prendreParole() + "� " + texte + "�");
}

private String prendreParole() {
	return "Le druide " + nom + " : ";
	}


public int preparerPotion() {
    Random r = new Random();
    int range = effetPotionMax - effetPotionMin + 1; // Calcul de la plage de valeurs possibles
    int forcePotion = r.nextInt(range) + effetPotionMin; // G�n�rer un nombre dans la plage et ajouter effetPotionMin

    if (forcePotion > 7) {
        parler("J'ai pr�par� une super potion de force " + forcePotion);
    } else {
        parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " + forcePotion);
    }

    return forcePotion;
}

public void booster(Gaulois gaulois) {
    if (gaulois.getNom().equals("Ob�lix")) {
        parler("Non, Ob�lix !... Tu n�auras pas de potion magique !");
    } else {
        int forcePotion = preparerPotion();
        gaulois.boirePotion(forcePotion);
    }
}}	
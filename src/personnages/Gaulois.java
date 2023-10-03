package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;



public Gaulois(String nom, int force) {
	this.nom = nom;
	this.force = force;
}

public String getNom() {
	return nom;
}

public void parler(String texte) {
	System.out.println(prendreParole() + "� " + texte + "�");
}

private String prendreParole() {
	return "Le gaulois " + nom + " : ";
}

public void frapper(Romain romain) {
    int forceCoup = (force / 3) * effetPotion;
    System.out.println(nom + " envoie un grand coup dans la m�choire de "
            + romain.getNom() + " avec une force de " + forceCoup);
    romain.recevoirCoup(forceCoup);
}

public void boirePotion(int forcePotion) {
    effetPotion *= forcePotion;
    parler("Merci Druide, je sens que ma force est " + effetPotion + " fois d�cupl�e.");
}


@Override
public String toString() {
	return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="
			+ effetPotion + "]";
}}

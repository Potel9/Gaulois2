package personnages;

public class scenario {
    public static void main(String[] args) {
        // Cr�ation des personnages
        Gaulois obelix = new Gaulois("Ob�lix", 25);
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Romain minus = new Romain("Minus", 6);
        Druide panoramix = new Druide("Panoramix", 5, 10);

        // Afficher les messages du druide Panoramix
        panoramix.parler("Je vais aller pr�parer une petite potion...");
        panoramix.preparerPotion();

        // Essayer de faire boire une potion � Ob�lix (qui ne devrait pas fonctionner)
        panoramix.booster(obelix);

        // Afficher les r�actions d'Ob�lix
        obelix.parler("Par B�l�nos, ce n'est pas juste!");

        // Faire boire une potion � Ast�rix
        panoramix.booster(asterix);

        // Ast�rix parle
        asterix.parler("Bonjour");

        // Minus parle
        minus.parler("UN GAU... UN GAUGAU...");

        // Ast�rix frappe Minus
        asterix.frapper(minus);

        // Afficher les �tats finaux des personnages
        System.out.println(obelix);
        System.out.println(asterix);
        System.out.println(minus);
        System.out.println(panoramix);
    }
}

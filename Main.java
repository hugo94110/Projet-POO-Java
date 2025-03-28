public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        // Ajouter des plats au menu pour tester
        menu.ajouterPlat(new Plat("Cheese naan butter chicker", 12, "plat"));
        menu.ajouterPlat(new Plat("Cheese naan poulet curry", 11, "plat"));
        menu.ajouterPlat(new Plat("Cheese naan poulet tandoori", 11, "plat"));
        menu.ajouterPlat(new Plat("Oasis pomme cassis framboise", 1.5, "boisson"));

        //Afficher le menu
        System.out.println("Menu :");
        menu.afficherMenu();

        Commande commande = new Commande();

        // Ajout plats commande
        commande.ajouterPlat(menu.getPlatsMenu().get(0));
        commande.ajouterPlat(menu.getPlatsMenu().get(3));

        // Afficher la commande
        System.out.println("\nCommande :");
        commande.afficherCommande();
    }
}

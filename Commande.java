import java.util.ArrayList;

public class Commande {
    private ArrayList<Plat> listePlats = new ArrayList<>();
    private double totalPrix;

    // Constructeur
    public Commande() {}

    public void ajouterPlat(Plat p) {
        // Ajouter un plat dans l'ArrayList
        listePlats.add(p);
    }

    public double totalCommande() {
        double totalCommande = 0;

        // Boucle pour parcourir les plats et calculer le total
        for(int i=0; i<listePlats.size(); i++) {
            totalCommande += listePlats.get(i).getPrix();
        }
        return totalCommande;
    }

    public void afficherCommande() {
        // On parcours la liste de plats pour les afficher
        for(int i=0; i<listePlats.size(); i++) {
            System.out.println(listePlats.get(i).toString());
        }

        System.out.println("Prix total : " + totalCommande()+"€");
    }

    // Getter
    public ArrayList<Plat> getListePlats() {
        return listePlats;
    }

    //Setter
    public void setListePlats(ArrayList<Plat> listePlats) {
        this.listePlats = listePlats;
    }
}
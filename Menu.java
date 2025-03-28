import java.util.ArrayList;

public class Menu {
    private ArrayList<Plat> platsMenu = new ArrayList<>();

    public Menu() {}

    public void ajouterPlat(Plat p) {
        platsMenu.add(p);
    }

    public void afficherMenu() {
        // Boucle pour parcourir le menu et afficher les plats avec la méthode toString
        for(int i=0; i<platsMenu.size(); i++) {
            System.out.println(platsMenu.get(i).toString());
        }
    }

    // Getter
    public ArrayList<Plat> getPlatsMenu() {
        return platsMenu;
    }

    // Setter
    public void setPlatsMenu(ArrayList<Plat> platsMenu) {
        this.platsMenu = platsMenu;
    }
}
public class Plat {
    private String nom;
    private double prix;
    private String type;

    // Constructeur
    public Plat(String nom, double prix, String type) {
        this.nom = nom;
        this.prix = prix;
        this.type = type;
    }

    //Getter
    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }
    public String getType() {
        return type;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "[Plat] - "+nom+", "+prix+"€ ("+type+")";
    }
}

public class Ordinateur {
    private String Nom;
    private String Marque;
    private String Description;
    private int Nb_stock;
    private float Prix;

    public Ordinateur(String nom, String marque, String description, int nb_stock) {
        Nom = nom;
        Marque = marque;
        Description = description;
        Nb_stock = nb_stock;
    }

    public Ordinateur() {
    }

    public float getPrix() {
        return Prix;
    }

    public String getNom() {
        return Nom;
    }

    public String getMarque() {
        return Marque;
    }

    public String getDescription() {
        return Description;
    }

    public int getNb_stock() {
        return Nb_stock;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setNb_stock(int nb_stock) {
        Nb_stock = nb_stock;
    }

    public void setPrix(float prix) {
        Prix = prix;
    }
    @Override
    public String toString() {
        return "Ordinateur{" +
                "Nom='" + Nom + '\'' +
                ", Marque='" + Marque + '\'' +
                ", Description='" + Description + '\'' +
                ", Nb_stock=" + Nb_stock +
                ", Prix=" + Prix +
                '}';
    }
    public float PrixQuantite(int Quantite){
        return Prix*Quantite;
    }
}

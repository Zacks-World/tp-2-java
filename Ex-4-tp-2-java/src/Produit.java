public class Produit {
    private int Id;
    private String Nom;
    private String Marque;
    private float Prix;
    private String Description;
    private int Nb_Stock;

    public Produit(int id, String nom, String marque, float prix, String description, int nb_Stock) {
        Id = id;
        Nom = nom;
        Marque = marque;
        Prix = prix;
        Description = description;
        Nb_Stock = nb_Stock;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public float getPrix() {
        return Prix;
    }

    public void setPrix(float prix) {
        Prix = prix;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getNb_Stock() {
        return Nb_Stock;
    }

    public void setNb_Stock(int nb_Stock) {
        Nb_Stock = nb_Stock;
    }

    @Override
    public String toString() {
        return "{" +
                "Id=" + Id +
                ", Nom='" + Nom + '\'' +
                ", Marque='" + Marque + '\'' +
                ", Prix=" + Prix +
                ", Description='" + Description + '\'' +
                ", Nb_Stock=" + Nb_Stock +
                '}';
    }
}

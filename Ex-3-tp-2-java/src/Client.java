import java.util.ArrayList;
import java.util.List;

public class Client {
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String Email;
    private String Ville;
    private String Telephone;
    private List<Commande> Commandes =new ArrayList<>();

    public Client(String nom, String prenom, String adresse, String email, String ville, String telephone) {
        Nom = nom;
        Prenom = prenom;
        Adresse = adresse;
        Email = email;
        Ville = ville;
        Telephone = telephone;
//        Commandes = commandes;
    }

    public Client() {
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public List<Commande> getCommandes() {
        return Commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        Commandes = commandes;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", Email='" + Email + '\'' +
                ", Ville='" + Ville + '\'' +
                ", Telephone='" + Telephone +
                '}';
    }
    public void AjouterCommande(Commande comd)
    {
        for(Commande Comd : Commandes) {
            if (Comd.equals(comd)) {
                System.out.println("La commande est déjà dans la liste.");
                return;
            }
        }
        Commandes.add(comd);
    }
    public void SupprimerCommande(Ordinateur comd){
        for(Commande Comd : Commandes) {
            if (Comd.equals(comd)) {
                Commandes.remove(comd);
                return;
            }
        }
        System.out.println("La commande n'existe pas dans la liste.");
    }
}

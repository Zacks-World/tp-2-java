import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private String Nom;
    private String Description;
    private List<Ordinateur> Ordinateurs;

    public Categorie(String nom, String description) {
        Nom = nom;
        Description = description;
        Ordinateurs=new ArrayList<>() {};
    }
    public void AjouterOrdinateur(Ordinateur ordinateur)
    {
        for(Ordinateur Ord : Ordinateurs) {
            if (Ord.equals(ordinateur)) {
                System.out.println("L'ordinateur est déjà dans la liste.");
                return;
            }
        }
        Ordinateurs.add(ordinateur);
    }
    public void SupprimerOrdinateur(Ordinateur ordinateur){
        for(Ordinateur Ord : Ordinateurs) {
            if (Ord.equals(ordinateur)) {
                Ordinateurs.remove(Ord);
                return;
            }
        }
        System.out.println("L'ordinateur n'existe pas dans la liste.");
    }

    public List<Ordinateur> RechercherParPrix(float Prix)
    {
        List<Ordinateur> OrdinateurParPrix=new ArrayList<>();
        for(Ordinateur Ord : Ordinateurs) {
            if (Prix==(Ord.getPrix())) {
                OrdinateurParPrix.add(Ord);
            }
        }
            return OrdinateurParPrix;
    };
}

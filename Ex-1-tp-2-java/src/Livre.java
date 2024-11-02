public class Livre {
    private int ISBN;
    private Auteur Auteur;
    private String Titre;

    public Livre(String titre,int isbn, Auteur auteur) {
        ISBN = isbn;
        Auteur = auteur;
        Titre=titre;
    }

    public String Afficher() {
        return "Livre{" +
                "ISBN=" + ISBN +
                "," + Auteur.Afficher() +
                ", Titre='" + Titre + '\'' +
                '}';
    }
}

public class Auteur extends Personne {
    private int numAuteur;
    public Auteur(String nom, String prenom, String email, String tel, int age,int numauteur) {
        super(nom, prenom, email, tel, age);
        numAuteur=numauteur;
    }

    @Override
    public String Afficher() {
        return "Auteur{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Age=" + Age +
                ", numAuteur=" + numAuteur +
                '}';
    }
}

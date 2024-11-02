public class Adherent extends Personne{
    private int numAdherent;
    public Adherent(String nom, String prenom, String email, String tel, int age,int numadherent) {
        super(nom, prenom, email, tel, age);
        numAdherent=numadherent;
    }

    @Override
    public String Afficher() {
        return "Adherent{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Age=" + Age +
                ", numAdherent=" + numAdherent +
                '}';
    }

}

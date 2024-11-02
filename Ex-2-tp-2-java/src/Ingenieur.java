public class Ingenieur extends Employe{
    private String Specialite;
    public Ingenieur(String nom, String prenom, String email, String tel, double salaire,String specialite) {
        super(nom, prenom, email, tel, salaire);
        Specialite=specialite;
    }

    @Override
    public String toString() {
        return "Ingenieur{" +
                "Specialite='" + Specialite + '\'' +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Salaire=" + Salaire +
                '}';
    }

    @Override
    public double Calculersalaire() {
        return Salaire*1.15;
    }
}

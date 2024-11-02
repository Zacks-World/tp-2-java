public abstract class Employe {
    protected String Nom;
    protected String Prenom;
    protected String Email;
    protected String Tel;
    protected double Salaire;

    public Employe(String nom, String prenom, String email, String tel, double salaire) {
        Nom = nom;
        Prenom = prenom;
        Email = email;
        Tel = tel;
        Salaire = salaire;
    }

    public Employe() {
    }
    public abstract double Calculersalaire ();
}

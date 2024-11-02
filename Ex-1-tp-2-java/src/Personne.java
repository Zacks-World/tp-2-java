public class Personne {
    protected String Nom;
    protected String Prenom;
    protected String Email;
    protected String Tel;
    protected int Age;
    public Personne(String nom,String prenom,String email,String tel,int age)
    {
        Nom=nom;
        Prenom=prenom;
        Email=email;
        Tel=tel;
        Age=age;
    }

    public String Afficher() {
        return "Personne{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Age=" + Age +
                '}';
    }
}

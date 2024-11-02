public class Manager extends Employe {
    private String Service;
    public Manager(String nom, String prenom, String email, String tel, double salaire,String service) {
        super(nom, prenom, email, tel, salaire);
        Service=service;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Service='" + Service + '\'' +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Salaire=" + Salaire +
                '}';
    }

    @Override
    public double Calculersalaire() {
        return Salaire*1.2;
    }
}

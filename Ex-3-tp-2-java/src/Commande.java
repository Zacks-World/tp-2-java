import java.util.Date;

public class Commande {
    private int Reference;
    private String Etat_Commande;
    private Date date;
    private Client client;

    public int getReference() {
        return Reference;
    }

    public void setReference(int reference) {
        Reference = reference;
    }

    public String getEtat_Commande() {
        return Etat_Commande;
    }

    public void setEtat_Commande(String etat_Commande) {
        Etat_Commande = etat_Commande;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Commande(int reference, String etat_Commande, Date date, Client client) {
        Reference = reference;
        Etat_Commande = etat_Commande;
        this.date = date;
        this.client = client;
    }

    public Commande() {
    }

    @Override
    public String toString() {
        return "Commande{" +
                "Reference=" + Reference +
                ", Etat_Commande='" + Etat_Commande + '\'' +
                ", date=" + date +
                ", client=" + client.toString() +
                '}';
    }
}

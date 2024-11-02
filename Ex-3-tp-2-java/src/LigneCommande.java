public class LigneCommande {
    private int Quantite;
    private Commande commande;
    //List Ordinateurs
    private Ordinateur ordinateur;

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int quantite) {
        Quantite = quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Ordinateur getOrdinateur() {
        return ordinateur;
    }

    public void setOrdinateur(Ordinateur ordinateur) {
        this.ordinateur = ordinateur;
    }

    public LigneCommande(int quantite, Commande commande, Ordinateur ordinateur) {
        Quantite = quantite;
        this.commande = commande;
        this.ordinateur = ordinateur;
    }

    public LigneCommande() {
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "Quantite=" + Quantite +
                ", commande=" + commande +
                ", ordinateur=" + ordinateur +
                '}';
    }
}

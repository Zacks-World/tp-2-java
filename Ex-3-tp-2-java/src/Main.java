import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Ordinateur> Ordinateurs=new ArrayList<>();
        Ordinateur Ord1 =new Ordinateur("OptiPlex 7010","Dell","Haute Gamme",200);
        Ordinateur Ord2 =new Ordinateur("MacBook","Apple","Haute Gamme",300);
        Ordinateur Ord3 =new Ordinateur("MateBook","Huawei","Haute Gamme",100);
        Ordinateurs.add(Ord1);
        Ordinateurs.add(Ord2);
        Ordinateurs.add(Ord3);
        Categorie categorie=new Categorie("Pc Portable","Portable");
        Client client=new Client("EL GUAZZAR","Zakaria","Ain Chok Hay Oussra","elguazzar@gmail.com","Casablanca","0661316861");
        Commande commande=new Commande(1,"Actif",new Date(),client);
        client.AjouterCommande(commande);
        List<LigneCommande> LignesCommandes=new ArrayList<>();
        LigneCommande ligne1=new LigneCommande(6,commande,Ord1);
        LigneCommande ligne2=new LigneCommande(23,commande,Ord2);
        LigneCommande ligne3=new LigneCommande(15,commande,Ord3);
        LignesCommandes.add(ligne1);
        LignesCommandes.add(ligne2);
        LignesCommandes.add(ligne3);
        System.out.println(commande.toString());
    }

}
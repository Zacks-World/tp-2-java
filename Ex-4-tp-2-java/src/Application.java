import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) {
        Produit produit;
        Scanner scanner = new Scanner(System.in);
        List<Produit> ProduitsMain=new ArrayList<>();
        MetierProduitImpl metierproduitimpl=new MetierProduitImpl(ProduitsMain);
        int choix=1;
        while (choix!=6) {
            System.out.println("\nMenu:");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher des produits par mot clé");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Récupérer et afficher un produit par ID");
            System.out.println("5. Supprimer un produit par id");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");
            int Id;
            choix = scanner.nextInt();
            switch (choix)
            {
                case 1:
                    for (Produit prod:ProduitsMain)
                        System.out.print(prod.toString());
                    break;
                case 2:
                    System.out.print("Entrer un mot clé : ");
                    System.out.print(metierproduitimpl.findByNom(scanner.next()).toString());
                    break;
                case 3:
                    String[] StringInfos= new String[3];
                    int[] IntInfos = new int[2];
                    float prix;
                    System.out.print("Entrer l'identifiant du produit : ");
                    IntInfos[0]= scanner.nextInt();
                    System.out.print("Entrer le nom du produit : ");
                    StringInfos[0]=scanner.next();
                    System.out.print("Entrer la marque du produit : ");
                    StringInfos[1]=scanner.next();
                    System.out.print("Entrer le prix du produit : ");
                    prix= scanner.nextFloat();
                    System.out.print("Entrer la description du produit : ");
                    StringInfos[2]=scanner.next();
                    System.out.print("Entrer le nombre du produit : ");
                    IntInfos[1]= scanner.nextInt();
                    produit=new Produit(IntInfos[0],StringInfos[0],StringInfos[1],prix,StringInfos[2],IntInfos[1]);
                    ProduitsMain.add(produit);
                    break;
                case 4:
                    System.out.print("Entrer l'identifiant du produit : ");
                    System.out.print(metierproduitimpl.findById(scanner.nextInt()).toString());
                    break;
                case 5:
                    System.out.print("Entrer l'identifiant du produit : ");
                    metierproduitimpl.delete(scanner.nextInt());
                    break;
                case 6:
                    System.out.print("Vous avez quitté le programme.");
                default:
                    System.out.print("Choix invalide.");
            }
        }
    }
}
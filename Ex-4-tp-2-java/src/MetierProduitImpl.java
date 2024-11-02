import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetierProduit{
    private List<Produit> Produits;

    public MetierProduitImpl(List<Produit> produits) {
        Produits = produits;
    }

    @Override
    public Produit add(Produit p) {
        Produits.add(p);
        return p;
    }

    @Override
    public List<Produit> getAll() {
        return Produits;
    }

    @Override
    public List<Produit> findByNom(String motCle) {
        List<Produit> ProduitsByNom=new ArrayList<>();
        for(Produit prod:Produits)
        {
            if (prod.getNom().contains(motCle))
                ProduitsByNom.add(prod);
        }
        return ProduitsByNom;
    }

    @Override
    public Produit findById(long id) {
        for(Produit prod:Produits)
        {
            if (prod.getId()==id)
                return prod;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        for(Produit prod:Produits)
        {
            if (prod.getId()==id)
            {
                Produits.remove(prod);
                return;
            }
        }
    }
}

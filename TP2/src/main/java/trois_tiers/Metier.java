package trois_tiers;
public class Metier
{
    private Stockage stockage;
    
    public Metier() {
        System.out.println("Appel du constructeur Metier()");
    }
    
    public void setStockage(Stockage stockage) {
        System.out.println("Appel de Metier.setStockage(" + stockage + ")");
        this.stockage = stockage;
    }
    
    public Metier(Stockage stockage) {
        System.out.println("Appel du constructeur Metier(stockage=" + stockage + ")");
        this.stockage = stockage;
    }
    
    public String toString() {
        System.out.println("Appel de Metier.toString()");
        return "Metier(stockage=" + this.stockage.toString() + ")";
    }
}

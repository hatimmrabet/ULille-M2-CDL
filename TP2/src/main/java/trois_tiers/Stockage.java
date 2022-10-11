package trois_tiers;
public class Stockage
{
    private String nomFichier;
    
    public Stockage() {
        System.out.println("Appel du constructeur Stockage()");
    }
    
    public void setNomFichier(String nomFichier) {
        System.out.println("Appel de Stockage.setNomFichier(" + nomFichier + ")");
        this.nomFichier = nomFichier;
    }
    
    public Stockage(String nomFichier) {
        System.out.println("Appel du constructeur Stockage(nomFichier=" + nomFichier + ")");
        this.nomFichier = nomFichier;
    }
    
    public String toString() {
        System.out.println("Appel de Stockage.toString()");
        return "Stockage(nomFichier=" + this.nomFichier + ")";
    }
}

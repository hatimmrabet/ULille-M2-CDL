package trois_tiers;
public class Presentation
{
    private String utilisateur;
    
    private Metier metier;
    
    public Presentation() {
        System.out.println("Appel du constructeur Presentation()");
    }
    
    public void setUtilisateur(String utilisateur) {
        System.out.println("Appel de Presentation.setMessage(" + utilisateur + ")");
        this.utilisateur = utilisateur;
    }
    
    public void setMetier(Metier metier) {
        System.out.println("Appel de Presentation.setMetier(" + metier + ")");
        this.metier = metier;
    }
    
    public Presentation(String utilisateur, Metier metier) {
        System.out.println("Appel du constructeur Presentation(utilisateur=" + utilisateur + ", metier=" + metier + ")");
        this.utilisateur = utilisateur;
        this.metier = metier;
    }
    
    public String toString() {
        System.out.println("Appel de Presentation.toString()");
        return "Presentation(utilisateur=" + this.utilisateur + " metier=" + this.metier.toString() + ")";
    }
}

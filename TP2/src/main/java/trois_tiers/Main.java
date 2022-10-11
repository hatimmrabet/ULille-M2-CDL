package trois_tiers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Configurantion XML");
        configurationXML();
        // System.out.println("Configuration 1");
        // configuration1();
        // System.out.println("Configuration 2");
        // configuration2();
        // System.out.println("Configuration 3");
        // configuration3();
    }

    public static void configurationXML() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "trois_tiers/configuration.xml");
        Presentation presentation = ctx.getBean("presentation", Presentation.class);
        System.out.println(presentation);
        System.out.println("Fermer configuration.xml");
        ctx.close();
    }
    
    public static void configuration1() {
        Object o = new Presentation("Philippe Merle", new Metier(new Stockage("fichier.txt")));
    }
    
    public static void configuration2() {
        Stockage stockage = new Stockage("fichier.txt");
        Metier metier = new Metier(stockage);
        Presentation presentation = new Presentation("Philippe Merle", metier);
    }
    
    public static void configuration3() {
        Stockage stockage = new Stockage();
        stockage.setNomFichier("fichier.txt");
        Metier metier = new Metier();
        metier.setStockage(stockage);
        Presentation presentation = new Presentation();
        presentation.setUtilisateur("Philippe Merle");
        presentation.setMetier(metier);
    }
}

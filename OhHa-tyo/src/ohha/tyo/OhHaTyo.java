package ohha.tyo;
import Kayttoliittyma.Launcher;
/**
 * Käynnistää ohjelman
 * @author Ilja
 */
public class OhHaTyo {

    
    /**
     * Luo uuden istanssin launcher-käyttöliittymäluokasta ja aloittaa ohjelman
     * @param args
     */
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.aloita();
    }                           
}

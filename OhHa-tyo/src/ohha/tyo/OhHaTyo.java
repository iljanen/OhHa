package ohha.tyo;
import Kayttoliittyma.Launcher;
import java.util.ArrayList;
import java.util.Scanner;
import ohha.tyo.Kalenteri;
import Save_Load.TuoKalenteri;
/**
 * Käynnistää ohjelman
 * @author Ilja
 */
public class OhHaTyo {

    private Tulostaja tulostaja = new Tulostaja();
    
    /**
     * Luo uuden istanssin launcher-käyttöliittymäluokasta ja aloittaa ohjelman
     * @param args
     */
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.aloita();
    }                           
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tyo;
import Kayttoliittyma.Launcher;
import java.util.ArrayList;
import java.util.Scanner;
import ohha.tyo.Kalenteri;
import Save_Load.TuoKalenteri;
/**
 *
 * @author Ilja
 */
public class OhHaTyo {

    /**
     * @param args the command line arguments
     */
    private Tulostaja tulostaja = new Tulostaja();
    
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.aloita();
    }                           
}

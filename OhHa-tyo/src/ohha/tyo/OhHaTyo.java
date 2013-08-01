/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tyo;

/**
 *
 * @author Ilja
 */
public class OhHaTyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Henkilo kaveri = new Kaveri("Mika", 23, "0404404440");
        System.out.println(kaveri.tulosta());
    }
}

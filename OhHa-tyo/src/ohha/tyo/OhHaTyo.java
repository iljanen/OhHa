/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tyo;
import java.util.ArrayList;
import java.util.Scanner;
import ohha.tyo.Kalenteri;
/**
 *
 * @author Ilja
 */
public class OhHaTyo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        int n;
        Kalenteri kalenteri = new Kalenteri();      
        boolean cont = true;       
        
            while(cont){
                System.out.println("1. Lisää kaveri.");
                System.out.println("2. Listaa kaverit.");
                System.out.println("Mitä haluat tehdä? (syötä numero)");
                n = lukija.nextInt();
                switch(n){
                        case 1: kalenteri.lisaaKaveri();
                                break;
                        case 2: kalenteri.listaaKaverit();
                                break;
            }    
        }
                           
        
        
        
        
    }
}

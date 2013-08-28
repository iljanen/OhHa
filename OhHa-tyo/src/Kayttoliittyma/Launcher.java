package Kayttoliittyma;

import Save_Load.TuoKalenteri;
import java.util.Scanner;
import ohha.tyo.*;

/**
 * Luokka hoitaa tekstikäyttöliittymän tulostuksen ja actionit 
 * @author Ilja
 */
public class Launcher {
    
    private Tulostaja tulostaja = new Tulostaja();
    private Scanner lukija = new Scanner(System.in);
    private int n;
    private Kalenteri kalenteri;
    
    /**
     * Parametriton konstruktori Launcher
     */
    public Launcher(){
        this.kalenteri = new Kalenteri();
    }
    
    /**
     *  Parametrillinen konstruktori Launcher
     * @param kalenteri
     */
    public Launcher(Kalenteri kalenteri){
        this.kalenteri = kalenteri;
    }
    /**
     *  Kysyy ladataanko kalenteri vai aloitetaanko uusi
     */
    public void lataaKalenteri(){
        System.out.println("1.Uusi kalenteri.");
        System.out.println("2.Lataa kalenteri.");
        int y = tulostaja.kysyNumero("");
        if(y==2){
            Kalenteri apu;
            TuoKalenteri lataa = new TuoKalenteri("SaveObj.sav");
            apu = lataa.palautaKalenteri();
            this.kalenteri = apu;
        }
    }
    
    
    /**
     *  Tämä kutsutaan Main-metodista ja se aloittaa ohjelman käyttöliittymän
     */
    public void aloita(){
        
        lataaKalenteri();
        
        tulostaja.tulostaMenu(kalenteri);
    }
}
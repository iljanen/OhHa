package Kayttoliittyma;

import Save_Load.TuoKalenteri;
import ohha.tyo.*;

/**
 * Luokka hoitaa tekstikäyttöliittymän tulostuksen ja actionit 
 * @author Ilja
 */
public class Launcher {
    
    private Tulostaja tulostaja = new Tulostaja();
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
        int valittuAction = tulostaja.kysyNumero("");
        if(valittuAction==2){
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
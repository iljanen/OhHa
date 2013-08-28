package Save_Load;

import java.io.*;
import java.util.ArrayList;
import ohha.tyo.*;

/**
 * Luokka kalenterin lukemiseen ja tuomiseen tiedostosta
 * @author Ilja
 */
public class TuoKalenteri {
    
    private Kalenteri kalenteri = new Kalenteri();
    
    /**
     * Konstruktori
     */
    public TuoKalenteri(String tiedosto){
        tuoKalenteri(tiedosto);
    }
    /**
     * palauttaa ladatun kalenterin Launcherin käyttöön
     * @return
     */
    public Kalenteri palautaKalenteri(){
        return kalenteri;
    }
    /**
     * Lukee kalenterin tiedostosta ja asettaa muuttujat
     */
    private void tuoKalenteri(String tiedosto){
        
        try{
            FileInputStream saveFile = new FileInputStream(tiedosto);
            ObjectInputStream save = new ObjectInputStream(saveFile);
            
            this.kalenteri.setKaverilista((ArrayList<Kaveri>)save.readObject());
            this.kalenteri.setAskarlista((ArrayList<Tekeminen>)save.readObject());
            System.out.println("Lataus onnistui!");
        }catch(Exception e){
            System.out.println("Lataus epäonnistui!");
        }
    }
}

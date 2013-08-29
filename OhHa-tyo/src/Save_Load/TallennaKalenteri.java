package Save_Load;

import java.io.*;
import ohha.tyo.*;


/**
 * Luokka kalenterin viemiseen tiedostoon
 * @author Ilja
 */
public class TallennaKalenteri {
    
    private Kalenteri apu = new Kalenteri();
    
    /**
     * Konstruktori
     * @param kalenteri
     */
    public TallennaKalenteri(Kalenteri kalenteri){
        this.apu = kalenteri;
    }
    
    /**
     * Metodi lukee ja vie kalenterin tiedostoon ja heittää poikkeuksen,
     * jos se epäonnistuu
     * @param kalenteri
     */
    public void tallennaTiedostoon(Kalenteri kalenteri, String tiedosto){
        
        try{
            FileOutputStream saveFile=new FileOutputStream(tiedosto);
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            
            save.writeObject(kalenteri.kaverilista());
            save.writeObject(kalenteri.askarlista());
            save.close();
            System.out.println("Tallennus onnistui!");           
        }catch(Exception e){
            System.out.println("Tallennus epäonnistui! :(");
        }
        
    }
    
    /**
     * Käyttöliittymä kutsuu tämän metodin käyttäjän halutessa tallentaa kalenterin.
     * @param kalenteri
     */
    public void tallennaKalenteri(Kalenteri kalenteri, String tiedosto){
        tallennaTiedostoon(kalenteri, tiedosto);
    }
    
    
    
}

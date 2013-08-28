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
    public void tallennaTiedostoon(Kalenteri kalenteri){
        
        try{
            FileOutputStream saveFile=new FileOutputStream("SaveObj.sav");
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            
            save.writeObject(kalenteri.kaverilista());
            save.writeObject(kalenteri.askarlista());
            save.close();
            System.out.println("Tallennus onnistui!");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Tallennus epäonnistui! :(");
        }
        
    }
    
    public void tallennaKalenteri(Kalenteri kalenteri){
        tallennaTiedostoon(kalenteri);
    }
    
    
    
}

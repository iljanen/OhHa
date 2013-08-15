package Save_Load;

import java.io.*;
import ohha.tyo.*;

public class TallennaKalenteri {
    
    private Kalenteri apu = new Kalenteri();
    
    public TallennaKalenteri(Kalenteri kalenteri){
        this.apu = kalenteri;
    }
    
    public void tallennaTiedostoon(Kalenteri kalenteri){
        
        try{
            FileOutputStream saveFile=new FileOutputStream("SaveObj.sav");
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            
            save.writeObject(kalenteri.kaverilista());
            save.writeObject(kalenteri.askarlista());
            save.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    
}

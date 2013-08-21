package Save_Load;

import java.io.*;
import java.util.ArrayList;
import ohha.tyo.*;

public class TuoKalenteri {
    
    private Kalenteri kalenteri = new Kalenteri();
    
    public TuoKalenteri(){
        tuoKalenteri();
    }
    public Kalenteri palautaKalenteri(){
        return kalenteri;
    }
    
    private void tuoKalenteri(){
        
        try{
            FileInputStream saveFile = new FileInputStream("SaveObj.sav");
            ObjectInputStream save = new ObjectInputStream(saveFile);
            
            this.kalenteri.setKaverilista((ArrayList<Kaveri>)save.readObject());
            this.kalenteri.setAskarlista((ArrayList<Tekeminen>)save.readObject());
            System.out.println("Lataus onnistui!");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Lataus epäonnistui!");
        }
    }
}

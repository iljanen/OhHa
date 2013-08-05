package ohha.tyo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tekeminen {
    
    private String aika;
    private String paikka;
    private String askar;
    
    public Tekeminen(String aika, String paikka, String askar){
        this.aika = aika;
        this.paikka = paikka;
        this.askar = askar;        
    }
    
    public String tulosta(){
        return aika+"\n"+paikka+"\n"+askar;
    }
    
    
}

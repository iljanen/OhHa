package ohha.tyo;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tekeminen implements Serializable{
    
    private Date aika;
    private String paikka;
    private String askar;
    
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    public Tekeminen(Date aika, String paikka, String askar){
        this.aika = aika;
        this.paikka = paikka;
        this.askar = askar;        
    }
    
    public Date Aika(){
        return this.aika;
    }
    
    public String AikaTekstina(){
        return df.format(aika);
    }
    
    public String Paikka(){
        return this.paikka;
    }
    
    public String Askar(){
        return this.askar;
    }
    
    public String tulosta(){
        return df.format(aika) +"\n"+paikka+"\n"+askar;
    }
    
    
}

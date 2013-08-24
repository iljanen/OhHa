package ohha.tyo;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Luokka Tekeminen-oliolle
 * @author Ilja
 */
public class Tekeminen implements Serializable{
    
    private Date aika;
    private String paikka;
    private String askar;
    
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    /**
     * Konstruktori
     * @param aika
     * @param paikka
     * @param askar
     */
    public Tekeminen(Date aika, String paikka, String askar){
        this.aika = aika;
        this.paikka = paikka;
        this.askar = askar;        
    }
    
    /**
     * getter ajalle
     * @return
     */
    public Date Aika(){
        return this.aika;
    }
    
    /**
     * getter ajalle, formatoituna
     * @return
     */
    public String AikaTekstina(){
        return df.format(aika);
    }
    
    /**
     * getter paikalle
     * @return
     */
    public String Paikka(){
        return this.paikka;
    }
    
    /**
     * getter askareelle
     * @return
     */
    public String Askar(){
        return this.askar;
    }
    
    /**
     * toString-metodi Tekeminen-oliolle
     * @return
     */
    public String tulosta(){
        return df.format(aika) +"\n"+paikka+"\n"+askar;
    }
    
    
}

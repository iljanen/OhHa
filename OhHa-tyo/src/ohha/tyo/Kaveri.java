package ohha.tyo;

import java.io.Serializable;


/**
 * Luokka Kaveri-oliolle, implements Serializable on tallennusta varten
 * @author Ilja
 */
public class Kaveri implements Serializable{

    private String nimi;
    private int ika;
    private String puhelin;
    
    /**
     * Parametrillinen konstruktori Kaveri-oliolle
     * @param nimi
     * @param ika
     * @param puhelin
     */
    public Kaveri(String nimi, int ika, String puhelin){ //Konstruktori
        this.nimi = nimi;
        this.ika = ika;
        this.puhelin = puhelin;
    }
    /**
     * Parametritön konstruktori Kaveri-oliolle
     */
    public Kaveri(){
        this.nimi = "";
        this.ika = 0;
        this.puhelin = "";
    }
    
    /**
     * getter nimelle
     * @return
     */
    public String Nimi(){
        return this.nimi;
    }
    
    /**
     * getter iälle
     * @return
     */
    public int Ika(){
        return this.ika;
    }
    
    /**
     * getter puhelinnumerolle
     * @return
     */
    public String Puhelin(){
        return this.puhelin;
    }
    
    /**
     * setter nimelle
     * @param nimi
     */
    public void muokkaaNimi(String nimi){
        this.nimi = nimi;
    }
    
    /**
     * setter iälle
     * @param ika
     */
    public void muokkaaIka(int ika){
        this.ika = ika;
    }
    
    /**
     * setter puhelinnumerolle
     * @param puhelin
     */
    public void muokkaaPuhelin(String puhelin){
        this.puhelin = puhelin;
    }
    
    /**
     * toString-metodi kaveri-olioille
     * @return
     */
    public String tulosta(){ //Palauttaa Kaveri-olion tiedot
        return "Nimi: "+this.nimi +"\nIkä: "+this.ika+"\nPuhelin: "+this.puhelin;
    }
    
}

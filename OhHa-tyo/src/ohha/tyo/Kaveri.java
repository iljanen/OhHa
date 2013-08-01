
package ohha.tyo;


public class Kaveri implements Henkilo {

    private String nimi;
    private int ika;
    private String puhelin;
    
    public Kaveri(String nimi, int ika, String puhelin){
        this.nimi = nimi;
        this.ika = ika;
        this.puhelin = puhelin;
    }
    
    public String tulosta(){
        return "Nimi: "+this.nimi +"\nIkä: "+this.ika+"\nPuhelin: "+this.puhelin;
    }
    
}

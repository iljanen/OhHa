
package ohha.tyo;


public class Kaveri {

    private String nimi;
    private int ika;
    private String puhelin;
    
    public Kaveri(String nimi, int ika, String puhelin){ //Konstruktori
        this.nimi = nimi;
        this.ika = ika;
        this.puhelin = puhelin;
    }
    public Kaveri(){
        this.nimi = "";
        this.ika = 0;
        this.puhelin = "";
    }
    
    public String Nimi(){
        return this.nimi;
    }
    
    public int Ika(){
        return this.ika;
    }
    
    public String Puhelin(){
        return this.puhelin;
    }
    
    public void muokkaaNimi(String nimi){
        this.nimi = nimi;
    }
    
    public void muokkaaIka(int ika){
        this.ika = ika;
    }
    
    public void muokkaaPuhelin(String puhelin){
        this.puhelin = puhelin;
    }
    
    public String tulosta(){ //Palauttaa Kaveri-olion tiedot
        return "Nimi: "+this.nimi +"\nIkä: "+this.ika+"\nPuhelin: "+this.puhelin;
    }
    
}

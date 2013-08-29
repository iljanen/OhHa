package ohha.tyo;

import Kayttoliittyma.Tulostaja;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Luokka sisältää metodit kalenterin käyttämiseen
 * @author Ilja
 */
public class Kalenteri {
    
    private Tulostaja tulostaja = new Tulostaja();
    private ArrayList<Kaveri>kaverilista;
    private ArrayList<Tekeminen>askarlista;
    DateFormat ajanMuuttaja = new SimpleDateFormat("dd/MM/yyyy");
    
    /**
     * Konstruktori, alustaa kalenterin
     */
    public Kalenteri(){
        this.askarlista = new ArrayList<Tekeminen>();
        this.kaverilista = new ArrayList<Kaveri>();
    }
    
    /**
     * Metodi kaverin lisäämiseen kalenteriin, parametritön
     */
    public void lisaaKaveri(){ 
        String nimi;
        int ika;
        String puhelin;       
        nimi = tulostaja.kysy("Kaverin nimi: ");
        ika = tulostaja.kysyNumero("Kaverin ikä: ");        
        puhelin = tulostaja.kysy("Kaverin puhelinnumero: ");
        if(puhelin.isEmpty()){
            puhelin = "Ei ole.";
        }
        
        Kaveri kaveri = new Kaveri(nimi, ika, puhelin);
        
        kaverilista.add(kaveri);
    }
    
    /**
     * Metodi kaverin lisäämiseen kalenteriin, parametrillinen
     * @param kaveri
     */
    public void lisaaKaveri(Kaveri kaveri){
        if(kaveri.Puhelin().equals("")){
            kaveri.muokkaaPuhelin("Ei ole.");
        }
        kaverilista.add(kaveri);
    }
    
    /**
     * Metodi kaverin muokkaamiseen
     * @param muokattava
     */
    public void muokkaaKaveria (Kaveri muokattava){
        if(muokattava == null){
        }else{
            String nimi = tulostaja.kysy("Syötä uusi nimi: ");
            muokattava.muokkaaNimi(nimi);
            int ika = tulostaja.kysyNumero("Syötä uusi ikä: ");
            muokattava.muokkaaIka(ika);
            String puhelin = tulostaja.kysy("Syötä uusi puhelinnumero: ");
            muokattava.muokkaaPuhelin(puhelin);
        }
        
    }
    
    /**
     * Metodi kaverin poistoon
     * @param poistettava
     */
    public void poistaKaveri(Kaveri poistettava){ //Luokka testausta varten.
        Kaveri pois = new Kaveri();
        if(poistettava == null){            
        }else{
            for(Kaveri kaveri : kaverilista){
                if(poistettava.equals(kaveri)){
                    pois = kaveri;
                    System.out.println("Poisto onnistui!");
                }           
            }
        }
        kaverilista.remove(pois);
    }
    
    /**
     * getter kaverilistalle
     * @return
     */
    public ArrayList<Kaveri> kaverilista(){ //Palauttaa kaverilistan sisällön
        return kaverilista;
    }
    
    /**
     * Lukee ArrayListin kavereita ja tulostaa ne
     */
    public void listaaKaverit(){
        if(kaverilista.isEmpty()){
            System.out.println("Kalenterissa ei ole kavereita.\n");            
        }else{
            for( Kaveri kaveri : kaverilista){
                System.out.println(kaveri.tulosta());
                System.out.println("\n");
            }            
            System.out.println("-----------");
            System.out.println("Tulostettu");
        }
    }
    
    /**
     * Metodi askareen lisäämiseen kalenteriin, parametritön
     */
    public void lisaaTekeminen(){
        Date aika;
        String aikaApu;
        String paikka;
        String askar;
        aikaApu = tulostaja.kysy("Muistutuksen aika? Muodossa dd/mm/20yy :");
        aika = muutaAika(aikaApu);   
        paikka = tulostaja.kysy("Paikka? :");
        askar = tulostaja.kysy("Muistutus: ");
        
        Tekeminen tekeminen = new Tekeminen(aika, paikka, askar);
        askarlista.add(tekeminen);
    }
    
    /**
     * Metodi askareen lisäämiseen kalenteriin, parametrillinen
     * @param tekeminen
     */
    public void lisaaTekeminen(Tekeminen tekeminen){
        askarlista.add(tekeminen);
    }
    
    /**
     * Metodi askareen muokkaamiseen
     */
    public void muokkaaTekeminen(){
        
    }
    
    /**
     * getter askarlistalle
     * @return
     */
    public ArrayList<Tekeminen> askarlista(){
        return askarlista;
    }
    
    /**
     * Lukee ArrayListin tekemisiä ja tulostaa ne
     */
    public void listaaTekemiset(){
        for(Tekeminen tekeminen : askarlista){
            System.out.println(tekeminen.tulosta()+"\n");
        }
        System.out.println("-----------\nTulostettu");
    }
    
    
    /**
     * Metodi Date-tietotyypin muotoilemiseen luettavaampaan muotoon
     * @param aika
     * @return
     */
    public Date muutaAika(String aika){
        Date d = null;
        boolean jatka = true;
        do{
            try{
                d = ajanMuuttaja.parse(aika);
                jatka = false;
                return d;
            }catch(ParseException e){
                aika = tulostaja.kysy("Ei pysty muuttamaan: " + aika);
            } 
        }while(jatka);
        
        return null;       
    }
    
    /**
     * Setter kaverilistalle
     * @param kaverilista
     */
    public void setKaverilista(ArrayList<Kaveri> kaverilista){
        this.kaverilista = kaverilista;
    }
    
    /**
     * Setter askarlistalle
     * @param askarlista
     */
    public void setAskarlista(ArrayList<Tekeminen> askarlista){
        this.askarlista = askarlista;
    }
    
}

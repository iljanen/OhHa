package ohha.tyo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Kalenteri {
    
    private Tulostaja tulostaja = new Tulostaja();
    private Scanner lukija = new Scanner(System.in);
    private ArrayList<Kaveri>kaverilista;
    private ArrayList<Tekeminen>askarlista;
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    public Kalenteri(){
        this.askarlista = new ArrayList<Tekeminen>();
        this.kaverilista = new ArrayList<Kaveri>();
    }
    
    public void lisaaKaveri(){ //Parametriton metodi kaverin lisäämiseen
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
    
    public void lisaaKaveri(Kaveri kaveri){ //Parametrillinen metodi kaverin lisäämiseen
        if(kaveri.Puhelin().equals("")){
            kaveri.muokkaaPuhelin("Ei ole.");
        }
        kaverilista.add(kaveri);
    }
    
    public void muokkaaKaveria (){
        boolean Loop = true;
        boolean onnistui = false;
        while(Loop){
            System.out.println("Muokkaus aloitettu");
            System.out.println("------------------");
            String nimi = tulostaja.kysy("Syötä kaverin nimi tai jätä tyhjäksi lopettaaksesi : ");
            if(nimi.trim().isEmpty()){
                System.out.println("Muokkaus peruttu");
                System.out.println("----------------");
                break;
            }
            for(Kaveri kaveri : kaverilista){
                if(nimi.equalsIgnoreCase(kaveri.Nimi())){
                    System.out.println("Syötä uusi nimi: ");
                    String uusiNimi = lukija.nextLine();
                    kaveri.muokkaaNimi(uusiNimi);
                    onnistui = true;
                    Loop = false;
                }
            }
            if(onnistui == true){
                System.out.println("Muokkaus onnistui.");
            }else{
                System.out.println("Kaveria ei löytynyt.");
            }
        }
    }
    
    public void poistaKaveri(){
        boolean Loop = true;
        boolean onnistui = false;
        Kaveri poistettava = new Kaveri();
        while (Loop){
            System.out.println("Poisto aloitettu");
            System.out.println("----------------");
            System.out.println("Syötä kaverin nimi tai jätä tyhjäksi lopettaaksesi : ");
            String nimi = lukija.nextLine();
            if(nimi.trim().isEmpty()){
                System.out.println("Poisto peruttu");
                System.out.println("--------------");
                break;
            }
            for(Kaveri kaveri : kaverilista){
                if(nimi.equalsIgnoreCase(kaveri.Nimi())){
                    poistettava = kaveri;
                    onnistui = true;
                    Loop = false;
                }
            }
            if(onnistui == true){
                kaverilista.remove(poistettava);
                System.out.println("Kaveri poistettu kalenterista.");
            }else{
                System.out.println("Kaveria ei löytynyt.");
            }
        }
    }
    
    public ArrayList<Kaveri> kaverilista(){ //Palauttaa kaverilistan sisällön
        return kaverilista;
    }
    
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
    
    public void lisaaTekeminen(){
        Date aika;
        String aikaApu;
        String paikka;
        String askar;
        System.out.println("Muistutuksen aika? Muodossa dd/mm/20yy :");
        aikaApu = lukija.nextLine();
        aika = muutaAika(aikaApu);
        System.out.println("Paikka? :");
        paikka = lukija.nextLine();
        System.out.println("Muistutus: ");
        askar = lukija.nextLine();
        
        Tekeminen tekeminen = new Tekeminen(aika, paikka, askar);
        askarlista.add(tekeminen);
    }
    
    public void lisaaTekeminen(Tekeminen tekeminen){
        askarlista.add(tekeminen);
    }
    
    public ArrayList<Tekeminen> askarlista(){
        return askarlista;
    }
    
    public void listaaTekemiset(){
        for(Tekeminen tekeminen : askarlista){
            System.out.println(tekeminen.tulosta()+"\n");
        }
        System.out.println("-----------\nTulostettu");
    }
    
    public Date muutaAika(String aika){
        Date d = null;
        boolean jatka = true;
        do{
            try{
                d = df.parse(aika);
                jatka = false;
                return d;
            }catch(ParseException e){
                System.out.println("Ei pysty muuttamaan: " + aika);
                aika = lukija.nextLine();
            } 
        }while(jatka);
        
        return null;
        
    }
}

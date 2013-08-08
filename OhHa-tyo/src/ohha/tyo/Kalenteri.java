package ohha.tyo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Kalenteri {
    
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
        System.out.println("Kaverin nimi: ");
        nimi = lukija.nextLine();
        System.out.println("Kaverin ikä: ");
        ika = Integer.parseInt(lukija.nextLine());
        System.out.println("Kaverin puhelinnumero: "); 
        puhelin = lukija.nextLine();
        
        Kaveri kaveri = new Kaveri(nimi, ika, puhelin);
        kaverilista.add(kaveri);
    }
    
    public void lisaaKaveri(Kaveri kaveri){ //Parametrillinen metodi kaverin lisäämiseen
        kaverilista.add(kaveri);
    }
    
    public ArrayList<Kaveri> kaverilista(){ //Palauttaa kaverilistan sisällön
        return kaverilista;
    }
    
    public void listaaKaverit(){
        for( Kaveri kaveri : kaverilista){
            System.out.println(kaveri.tulosta());
            System.out.println("\n");
        }
        System.out.println("-----------");
        System.out.println("Tulostettu");
    }
    
    public void lisaaTekeminen(){
        Date aika;
        String aikaApu;
        String paikka;
        String askar;
        System.out.println("Muistutuksen aika? :");
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

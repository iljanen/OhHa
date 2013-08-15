package ohha.tyo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import Save_Load.TuoKalenteri;
import Save_Load.TallennaKalenteri;

public class Launcher {
    
    private Scanner lukija = new Scanner(System.in);
    private int n;
    private Kalenteri kalenteri;      
    private boolean cont = true;
    private boolean jatka = true;
    
    public Launcher(){
        this.kalenteri = new Kalenteri();
    }
    
    public Launcher(Kalenteri kalenteri){
        this.kalenteri = kalenteri;
    }
    public void lataaKalenteri(){
        System.out.println("1.Uusi kalenteri.");
        System.out.println("2.Lataa kalenteri.");
        int y = lukija.nextInt();
        if(y==2){
            Kalenteri apu;
            TuoKalenteri lataa = new TuoKalenteri();
            apu = lataa.palautaKalenteri();
            this.kalenteri = apu;
        }
    }
    
    public void tallennaKalenteri(){
        TallennaKalenteri tallenna = new TallennaKalenteri(kalenteri);
        tallenna.tallennaTiedostoon(this.kalenteri);
    }
    
    public void aloita(){
        
        lataaKalenteri();
        
        while(cont){
            boolean started = true;
            System.out.println("**Päävalikko**");
            System.out.println("--------------");
            System.out.println("1. Lisää kaveri.");
            System.out.println("2. Listaa kaverit.");
            System.out.println("3. Muokkaa kaverin tietoja.");
            System.out.println("4. Poista kaveri kalenterista.");
            System.out.println("5. Lisää askar.");
            System.out.println("6. Listaa askareet.");
            System.out.println("7. Tallenna kalenteri.");
            System.out.println("0. Lopeta.");
            System.out.println("Mitä haluat tehdä? (syötä numero)");
            do {
                try{
                    n = lukija.nextInt();
                    jatka = false;
                }catch(InputMismatchException e){
                    System.err.printf("\nVirhe: %s\n", e);
                    lukija.nextLine();
                    System.out.println("Et syöttänyt numeroa, kokeile uudestaan");                
                }
            }while(jatka);
            
            
            switch(n){
                case 1: kalenteri.lisaaKaveri();
                        break;
                case 2: kalenteri.listaaKaverit();
                        break;
                case 3: kalenteri.muokkaaKaveria();
                        break;
                case 4: kalenteri.poistaKaveri();
                        break;
                case 5: kalenteri.lisaaTekeminen();
                        break;
                case 6: kalenteri.listaaTekemiset();
                        break;
                case 7: tallennaKalenteri();
                        break;
                case 0: System.exit(0);        
                default: 
                                                                    
            
            }
        }
    }
}
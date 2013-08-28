package ohha.tyo;

import Save_Load.TallennaKalenteri;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Luokan on tarkoitus korvata Scanner-metodit yhdellä luokalla
 * @author Ilja
 */
public class Tulostaja {
    
    private Scanner lukija;
    private Scanner intLukija;
    private TallennaKalenteri tallenna;
    
    /**
     * Konstruktori tulostajalle
     */
    public Tulostaja(){
        this.lukija = new Scanner(System.in);
        this.intLukija = new Scanner(System.in);
    }
    
    /**
     * Tulostaa kysymyksen ja ottaa talteen käyttäjän vastauksen
     * @param kysymys
     * @return
     */
    public String kysy(String kysymys){
        String vastaus;
        System.out.println(kysymys);
        vastaus = lukija.nextLine();
        return vastaus;
    }
    
    /**
     * Tulostaa kysymyksen ja ottaa talteen käyttäjän vastauksen, vain numeroidut
     * @param kysymys
     * @return
     */
    public int kysyNumero(String kysymys){
        int vastaus;
        System.out.println(kysymys);
        while(!intLukija.hasNextInt()){
            System.out.println("Vain numero käy! Kokeile uudestaan.");
            intLukija.next();
        }
        vastaus = intLukija.nextInt();
        return vastaus;
    }
    /**
     * erillinen metodi kaverin poistamisen avuksi
     * @param lista
     * @return
     */
    public Kaveri kysyPoistettavaKaveri(ArrayList<Kaveri>lista){
        boolean Loop = true;
        boolean onnistui = false;
        Kaveri poistettava = new Kaveri();
        System.out.println("Poisto aloitettu");
        System.out.println("----------------");
        while (Loop){        
            System.out.println("Syötä kaverin nimi tai jätä tyhjäksi lopettaaksesi : ");
            String nimi = lukija.nextLine();
            if(nimi.trim().isEmpty()){
                System.out.println("Poisto peruttu");
                System.out.println("--------------");
                break;
            }
            for(Kaveri kaveri : lista){
                if(nimi.equalsIgnoreCase(kaveri.Nimi())){
                    poistettava = kaveri;
                    return kaveri;
                }else{
                    System.out.println("Ei löytynyt tämän nimistä kaveria!\n");
                }
            }
        }
        return null;
    }
    
    /**
     * metodi kaverin muokkaamisen helpottamiseksi
     * @param lista
     * @return
     */
    public Kaveri kysyMuokattavaKaveri(ArrayList<Kaveri>lista){
        boolean Loop = true;
        Kaveri muokattava = new Kaveri();
        System.out.println("Muokkaus aloitettu");
        System.out.println("------------------");
        while (Loop){
            System.out.println("Syötä kaverin nimi tai jätä tyhjäksi lopettaaksesi : ");
            String nimi = lukija.nextLine();
            if(nimi.trim().isEmpty()){
                System.out.println("Muokkaus peruttu");
                System.out.println("----------------");
                break;
            }
            for(Kaveri kaveri : lista){
                if(nimi.equalsIgnoreCase(kaveri.Nimi())){
                    muokattava = kaveri;
                    return kaveri;
                }else{
                    System.out.println("Ei löytynyt tämän nimistä kaveria!\n");
                }
            }
        }
        return null;
    }
    
    /**
     * tulostaa menu-valikon käyttöliittymälle
     * @param kalenteri
     */
    public void tulostaMenu(Kalenteri kalenteri){
        
            int n = 0;
       
            while(true){
            boolean jatka = true;
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
                case 3: kalenteri.muokkaaKaveria(kysyMuokattavaKaveri(kalenteri.kaverilista()));
                        break;
                case 4: kalenteri.poistaKaveri(kysyPoistettavaKaveri(kalenteri.kaverilista()));
                        break;
                case 5: kalenteri.lisaaTekeminen();
                        break;
                case 6: kalenteri.listaaTekemiset();
                        break;               
                case 7: tallenna = new TallennaKalenteri(kalenteri);
                        tallenna.tallennaKalenteri(kalenteri);
                        break;
                case 0: System.out.println("Heippa!");
                        System.exit(0);        
                default: 
                                                                    
            
            }
            }
            
    }
}

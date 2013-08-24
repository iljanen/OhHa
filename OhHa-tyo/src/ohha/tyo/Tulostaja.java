package ohha.tyo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Luokan on tarkoitus korvata Scanner-metodit yhdellä luokalla
 * @author Ilja
 */
public class Tulostaja {
    
    private Scanner lukija;
    private Scanner intLukija;
    
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
}

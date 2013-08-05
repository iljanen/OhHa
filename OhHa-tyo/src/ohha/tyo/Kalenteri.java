package ohha.tyo;

import java.util.Scanner;
import java.util.ArrayList;

public class Kalenteri {
    
    private Scanner lukija = new Scanner(System.in);
    private ArrayList<Henkilo>kaverilista;
    
    public Kalenteri(){
        this.kaverilista = new ArrayList<Henkilo>();
    }
    
    public void lisaaKaveri(){
        String nimi;
        int ika;
        String puhelin;
        System.out.println("Kaverin nimi: ");
        nimi = lukija.nextLine();
        System.out.println("Kaverin ikä: ");
        ika = Integer.parseInt(lukija.nextLine());
        System.out.println("Kaverin puhelinnumero: "); 
        puhelin = lukija.nextLine();
        
        Henkilo kaveri = new Kaveri(nimi, ika, puhelin);
        kaverilista.add(kaveri);
    }
    
    public void listaaKaverit(){
        for( Henkilo kaveri : kaverilista){
            kaveri.tulosta();
            System.out.println("Tulostettu");
        }
    }
}

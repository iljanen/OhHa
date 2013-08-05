package ohha.tyo;

import java.util.Scanner;
import java.util.ArrayList;

public class Kalenteri {
    
    private Scanner lukija = new Scanner(System.in);
    private ArrayList<Kaveri>kaverilista;
    
    public Kalenteri(){
        this.kaverilista = new ArrayList<Kaveri>();
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
        
        Kaveri kaveri = new Kaveri(nimi, ika, puhelin);
        kaverilista.add(kaveri);
    }
    
    public void listaaKaverit(){
        for( Kaveri kaveri : kaverilista){
            System.out.println(kaveri.tulosta());
            System.out.println("\n");
        }
        System.out.println("-----------");
        System.out.println("Tulostettu");
    }
}

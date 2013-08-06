package ohha.tyo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Launcher {
    
    private Scanner lukija = new Scanner(System.in);
    private int n;
    private Kalenteri kalenteri;      
    private boolean cont = true;
    
    public Launcher(){
        this.kalenteri = new Kalenteri();
    }
    
    public void aloita(){
        
        while(cont){
            boolean started = true;
            System.out.println("1. Lisää kaveri.");
            System.out.println("2. Listaa kaverit.");
            System.out.println("Mitä haluat tehdä? (syötä numero)");
            try{
                n = lukija.nextInt();
            }catch(InputMismatchException e){
                System.err.printf("\nVirhe: %s\n", e);
                System.out.println("Et syöttänyt numeroa, kokeile uudestaan");
                lukija.next();
            }
            
            switch(n){
                case 1: kalenteri.lisaaKaveri();
                        break;
                case 2: kalenteri.listaaKaverit();
                        break;
                        
                default: 
                                                                    
            
            }
        }
    }
}
package ohha.tyo;

import java.util.Scanner;

public class Tulostaja {
    
    private Scanner lukija;
    private Scanner intLukija;
    
    public Tulostaja(){
        this.lukija = new Scanner(System.in);
        this.intLukija = new Scanner(System.in);
    }
    
    public String kysy(String kysymys){
        String vastaus;
        System.out.println(kysymys);
        vastaus = lukija.nextLine();
        return vastaus;
    }
    
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
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tyo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ilja
 */
public class KalenteriTest {
    
    public KalenteriTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void kaverinLisääminenToimii() {
        Kalenteri kalenteri = new Kalenteri();
        Kaveri kaveri = new Kaveri("Mika", 23, "04509786");
        kalenteri.lisaaKaveri(kaveri);
        ArrayList<Kaveri>lista = new ArrayList<Kaveri>();
        lista.add(kaveri);
        assertEquals(lista, kalenteri.kaverilista());
    }
    
    @Test
    public void kaveriIlmanPuhelinta(){
        Kalenteri kalenteri = new Kalenteri();
        Kaveri kaveri = new Kaveri("Mika", 23, "");
        kalenteri.lisaaKaveri(kaveri);
        assertEquals("Ei ole.", kaveri.Puhelin());
    }
    
    @Test
    public void nimenMuokkausTesti(){
        Kaveri kaveri = new Kaveri("Mika", 23, "09850");
        kaveri.muokkaaNimi("Miksu");
        assertEquals("Miksu", kaveri.Nimi());
    }
    
    @Test
    public void poistoToimii(){        
        Kalenteri kalenteri = new Kalenteri();
        Kalenteri tyhja = new Kalenteri();
        Kaveri kaveri = new Kaveri("Mika", 23, "09850");
        kalenteri.lisaaKaveri(kaveri);
        kalenteri.poistaKaveri(kaveri);
        assertEquals(tyhja.kaverilista(), kalenteri.kaverilista());
    }

    
    @Test
    public void testListaaKaverit() {
        Kalenteri kalenteri = new Kalenteri();
        Kaveri kaveri = new Kaveri("Mika", 23, "04509786");
        Kaveri kaveri2 = new Kaveri("Kelmu", 42, "2344356");
        kalenteri.lisaaKaveri(kaveri);
        kalenteri.lisaaKaveri(kaveri2);
        ArrayList<Kaveri>lista = new ArrayList<Kaveri>();
        lista.add(kaveri);
        lista.add(kaveri2);
        assertEquals(lista, kalenteri.kaverilista());
    }
    
    @Test
    public void testaaAjanMuutos() throws ParseException{
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date aika;
        String aikaApu = "23/05/2014"; 
        aika = df.parse(aikaApu);
        Tekeminen tekeminen = new Tekeminen(aika, "Tiksi", "Hammas");
        assertEquals("23/05/2014", tekeminen.AikaTekstina());
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tyo;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    /**
     * Test of lisaaKaveri method, of class Kalenteri.
     */
    @Test
    public void kaverinLisääminenToimii() {
        Kalenteri kalenteri = new Kalenteri();
        Kaveri kaveri = new Kaveri("Mika", 23, "04509786");
        kalenteri.lisaaKaveri(kaveri);
        ArrayList<Kaveri>lista = new ArrayList<Kaveri>();
        lista.add(kaveri);
        assertEquals(lista, kalenteri.kaverilista());
    }
    /**
     * Testaa voiko puhelin olla tyhjä.
     */
    @Test
    public void kaveriIlmanPuhelinta(){
        Kalenteri kalenteri = new Kalenteri();
        Kaveri kaveri = new Kaveri("Mika", 23, "");
        kalenteri.lisaaKaveri(kaveri);
        assertEquals("Ei ole.", kaveri.Puhelin());
    }

    /**
     * Test of listaaKaverit method, of class Kalenteri.
     */
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
}

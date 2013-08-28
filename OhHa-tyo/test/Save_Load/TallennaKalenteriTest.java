/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Save_Load;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import ohha.tyo.Kalenteri;
import ohha.tyo.Kaveri;
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
public class TallennaKalenteriTest {
    
    public TallennaKalenteriTest() {
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
     * Test of tallennaKalenteri method, of class TallennaKalenteri.
     * Tallentaa asetetun kalenterin tiedostoon ja tarkistaa ettei tiedosto ole tyhjä!
     */
    @Test
    public void testLuokkaTallennaKalenteriToimii() throws FileNotFoundException, IOException {
        Kalenteri kalenteri = new Kalenteri();
        Kaveri kaveri = new Kaveri("Mika", 23, "093580");
        kalenteri.lisaaKaveri(kaveri);
        TallennaKalenteri instance = new TallennaKalenteri(kalenteri);
        instance.tallennaKalenteri(kalenteri, "test1.sav");
        BufferedReader br = new BufferedReader(new FileReader("test1.sav"));     
        if (br.readLine() == null) {
            fail("Tiedosto on tyhjä!");
        }else{
            assertTrue("Kaikki ok!", true);
        }
        
    }
}

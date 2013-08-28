/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Save_Load;

import ohha.tyo.Kalenteri;
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
public class TuoKalenteriTest {
    
    public TuoKalenteriTest() {
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
     * Test of palautaKalenteri method, of class TuoKalenteri.
     * Tuo testausta varten olevasta tiedostosta kalenterin ja tarkistaa, ettei se ole tyhjä tuonnin jälkeen.
     */
    @Test
    public void testKalenteriTuodaanOnnistuneestiTiedostosta() {
        TuoKalenteri instance = new TuoKalenteri("test.sav");
        Kalenteri result = instance.palautaKalenteri();
        if(result.kaverilista().isEmpty()){
            fail("Kalenteria ei tuotu tiedostosta!");
        }else{
            assertTrue("Kalenteri tuotiin onnistuneesti tiedostosta!", true);
        }
    }
}

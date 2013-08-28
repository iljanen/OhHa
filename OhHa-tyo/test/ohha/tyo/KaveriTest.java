/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tyo;

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
public class KaveriTest {
    
    public KaveriTest() {
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
    public void KaveriTulostuuOikein(){
        Kaveri kaveri = new Kaveri("Mika", 23, "0976543");
        assertEquals("Nimi: Mika\nIkä: 23\nPuhelin: 0976543",kaveri.tulosta());
    }
      
}

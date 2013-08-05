/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tyo;

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
public class TekeminenTest {
    
    public TekeminenTest() {
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
     * Test of tulosta method, of class Tekeminen.
     */
    @Test
    public void merkintaTulostuuOikein() {
        Tekeminen askare = new Tekeminen("23.06.2013", "Tikkurila", "Hammaslääkäri");
        System.out.println(askare.tulosta());
        assertEquals("23.06.2013\nTikkurila\nHammaslääkäri", askare.tulosta());
    }
}

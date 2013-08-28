/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.tyo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public void merkintaTulostuuOikein() throws ParseException {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = df.parse("23-12-2011");
        Tekeminen askare = new Tekeminen(d1 , "Tikkurila", "Hammaslääkäri");
        assertEquals("23/12/2011\nTikkurila\nHammaslääkäri", askare.tulosta());
    }
}

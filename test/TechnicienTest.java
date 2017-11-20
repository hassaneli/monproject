/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hassan ali
 */
public class TechnicienTest {
    
    public TechnicienTest() {
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
     * Test of calculerSalaire method, of class Technicien.
     */
    @Test
    public void testCalculerSalaire() {
        System.out.println("calculerSalaire");
        Technicien instance = null;
        double expResult = 0.0;
        double result = instance.calculerSalaire();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitre method, of class Technicien.
     */
    @Test
    public void testGetTitre() {
        System.out.println("getTitre");
        Technicien instance = null;
        String expResult = "";
        String result = instance.getTitre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

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
public class EmployeTest {
    
    public EmployeTest() {
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
     * Test of calculerSalaire method, of class Employe.
     */
    @Test
    public void testCalculerSalaire() {
        System.out.println("calculerSalaire");
        Employe instance = null;
        double expResult = 0.0;
        double result = instance.calculerSalaire();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitre method, of class Employe.
     */
    @Test
    public void testGetTitre() {
        System.out.println("getTitre");
        Employe instance = null;
        String expResult = "";
        String result = instance.getTitre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Employe.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Employe instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EmployeImpl extends Employe {

        public EmployeImpl() {
            super("", "", 0, "");
        }

        public double calculerSalaire() {
            return 0.0;
        }
    }
    
}

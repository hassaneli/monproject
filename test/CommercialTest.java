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
public class CommercialTest {
    
    public CommercialTest() {
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
     * Test of getChiffreAffaire method, of class Commercial.
     */
    @Test
    public void testGetChiffreAffaire() {
        System.out.println("getChiffreAffaire");
        Commercial instance = null;
        double expResult = 0.0;
        double result = instance.getChiffreAffaire();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CommercialImpl extends Commercial {

        public CommercialImpl() {
            super("", "", 0, "", 0.0);
        }

        @Override
        public double calculerSalaire() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}

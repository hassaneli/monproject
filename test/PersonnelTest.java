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
public class PersonnelTest {
    
    public PersonnelTest() {
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
     * Test of ajouterEmploye method, of class Personnel.
     */
    @Test
    public void testAjouterEmploye() {
        System.out.println("ajouterEmploye");
        Employe e = null;
        Personnel instance = new Personnel();
        instance.ajouterEmploye(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salaireMoyen method, of class Personnel.
     */
    @Test
    public void testSalaireMoyen() {
        System.out.println("salaireMoyen");
        Personnel instance = new Personnel();
        double expResult = 0.0;
        double result = instance.salaireMoyen();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficherSalaires method, of class Personnel.
     */
    @Test
    public void testAfficherSalaires() {
        System.out.println("afficherSalaires");
        Personnel instance = new Personnel();
        instance.afficherSalaires();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

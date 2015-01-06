/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhotonicCrystal_1D;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Horang
 */
public class JonesMatrixTest {
    
    public JonesMatrixTest() {
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
     * Test of product method, of class JonesMatrix.
     */
    @Test
    public void testProduct() {
        System.out.println("product");
        JonesMatrix jm1 = null;
        JonesMatrix jm2 = null;
        JonesMatrix instance = new JonesMatrix();
        JonesMatrix expResult = null;
        JonesMatrix result = instance.product(jm1, jm2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmatrix method, of class JonesMatrix.
     */
    @Test
    public void testGetmatrix() {
        System.out.println("getmatrix");
        JonesMatrix instance = new JonesMatrix();
        double[][] expResult = null;
        double[][] result = instance.getmatrix();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setmatrix method, of class JonesMatrix.
     */
    @Test
    public void testSetmatrix() {
        System.out.println("setmatrix");
        double[][] imatrix = null;
        JonesMatrix instance = new JonesMatrix();
        instance.setmatrix(imatrix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

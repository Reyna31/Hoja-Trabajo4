/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscar
 */
public class simpleEncaTest {
    
    public simpleEncaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of agregar method, of class simpleEnca.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Object item = null;
        simpleEnca instance = new simpleEnca();
        instance.agregar(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showprim method, of class simpleEnca.
     */
    @Test
    public void testShowprim() {
        System.out.println("showprim");
        simpleEnca instance = new simpleEnca();
        Object expResult = null;
        Object result = instance.showprim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showulti method, of class simpleEnca.
     */
    @Test
    public void testShowulti() {
        System.out.println("showulti");
        simpleEnca instance = new simpleEnca();
        Object expResult = null;
        Object result = instance.showulti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminaprim method, of class simpleEnca.
     */
    @Test
    public void testEliminaprim() {
        System.out.println("eliminaprim");
        simpleEnca instance = new simpleEnca();
        Object expResult = null;
        Object result = instance.eliminaprim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminaulti method, of class simpleEnca.
     */
    @Test
    public void testEliminaulti() {
        System.out.println("eliminaulti");
        simpleEnca instance = new simpleEnca();
        Object expResult = null;
        Object result = instance.eliminaulti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of status method, of class simpleEnca.
     */
    @Test
    public void testStatus() {
        System.out.println("status");
        simpleEnca instance = new simpleEnca();
        boolean expResult = false;
        boolean result = instance.status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamano method, of class simpleEnca.
     */
    @Test
    public void testTamano() {
        System.out.println("tamano");
        simpleEnca instance = new simpleEnca();
        int expResult = 0;
        int result = instance.tamano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

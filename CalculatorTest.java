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
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of sumar method, of class Calculator.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculator.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculator.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Calculator.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class Calculator.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        Calculator instance = new Calculator();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Calculator.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.sum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtraction method, of class Calculator.
     */
    @Test
    public void testSubtraction() {
        System.out.println("subtraction");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.subtraction(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInt method, of class Calculator.
     */
    @Test
    public void testIsInt() {
        System.out.println("isInt");
        String value = "";
        Calculator instance = new Calculator();
        boolean expResult = false;
        boolean result = instance.isInt(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of manageOperator method, of class Calculator.
     */
    @Test
    public void testManageOperator() {
        System.out.println("manageOperator");
        String operator = "";
        Calculator instance = new Calculator();
        instance.manageOperator(operator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

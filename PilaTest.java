/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piladeobjetos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author marge
 */
public class PilaTest {
    
    public PilaTest() {
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
     * Test of push method, of class Pila.
     */
    @Ignore
    public void testPushClaseEquivalencia() {
        System.out.println("push");
        Object o = "hola";
        Pila instance = new Pila();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Ignore
    public void testPopClaseEquivalencia() {
        System.out.println("pop");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push("hola");
        for (int i = 0; i < instance.size() - 1; i++) {
            result.push(instance.get(i));
        }
        instance.pop();
        assertEquals(instance, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of top method, of class Pila.
     */
    @Ignore
    public void testTopClaseEquivalencia() {
        System.out.println("top");
        Pila instance = new Pila();
        Object o = "hola";
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class Pila.
     */
    @Ignore
    public void testIsEmptyWithInstances() {
        System.out.println("isEmpty");
        Pila instance = new Pila();
        Object o = "hola";
        instance.push(o);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Ignore
    public void testIsEmptyWithoutInstances() {
        System.out.println("isEmpty");
        Pila instance;
        instance = new Pila();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Ignore
    public void testPushErrorsTipicsWithNull() {
        System.out.println("push");
        Object o = null;
        Pila instance = new Pila();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Ignore
    public void testPopErrorsTipicsWithNull() {
        System.out.println("pop");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push(null);
        for (int i = 0; i < instance.size() - 1; i++) {
            result.push(instance.get(i));
        }
        instance.pop();
        assertEquals(instance, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of top method, of class Pila.
     */
    @Ignore
    public void testTopErrorsTipicsWithNull() {
        System.out.println("top");
        Pila instance = new Pila();
        Object o = null;
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class Pila.
     */
    @Ignore
    public void testIsEmptyErrorsTipicsWithNull() {
        System.out.println("isEmpty");
        Pila instance = new Pila();
        Object o = null;
        instance.push(o);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testPushErrorsTipicsWithLongValues() {
        System.out.println("push");
        Object o = 456456456456L;
        Pila instance = new Pila();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testPopErrorsTipicsWithLongValues() {
        System.out.println("pop");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push(456456456456L);
        for (int i = 0; i < instance.size() - 1; i++) {
            result.push(instance.get(i));
        }
        instance.pop();
        assertEquals(instance, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of top method, of class Pila.
     */
    @Test
    public void testTopErrorsTipicsWithLongValues() {
        System.out.println("top");
        Pila instance = new Pila();
        Object o = 456456456456L;
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class Pila.
     */
    @Test
    public void testIsEmptyErrorsTipicsWithLongValues() {
        System.out.println("isEmpty");
        Pila instance = new Pila();
        Object o = 456456456456L;
        instance.push(o);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}

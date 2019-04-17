/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cua;

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
public class CuaTest {
    
    public CuaTest() {
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
     * Test of push method, of class Cua.
     */
    @Ignore
    public void testPushClaseEquivalencia() {
        System.out.println("push");
        Object o = "hola";
        Cua instance = new Cua();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Ignore
    public void testdropFirstClaseEquivalencia() {
        System.out.println("dropFirst");
        Cua instance = new Cua();
        Cua result = new Cua();
        instance.push("hola");
        for (int i = 1; i < instance.size(); i++) {
            result.push(instance.get(i));
        }
        instance.dropFirst();
        assertEquals(instance, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of top method, of class Pila.
     */
    @Ignore
    public void testFirstClaseEquivalencia() {
        System.out.println("first");
        Cua instance = new Cua();
        Object o = "hola";
        instance.push(o);
        Object result = instance.first();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class Pila.
     */
    @Ignore
    public void testIsEmptyWithInstances() {
        System.out.println("isEmpty");
        Cua instance = new Cua();
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
        Cua instance;
        instance = new Cua();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Ignore
    public void testPushErrorsTipicsWithNull() {
        System.out.println("push");
        Object o = null;
        Cua instance = new Cua();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Ignore
    public void testDropFirstErrorsTipicsWithNull() {
        System.out.println("dropFirst");
        Cua instance = new Cua();
        Cua result = new Cua();
        instance.push(null);
        for (int i = 1; i < instance.size(); i++) {
            result.push(instance.get(i));
        }
        instance.dropFirst();
        assertEquals(instance, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of top method, of class Pila.
     */
    @Ignore
    public void testFirstErrorsTipicsWithNull() {
        System.out.println("First");
        Cua instance = new Cua();
        Object o = null;
        instance.push(o);
        Object result = instance.first();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class Pila.
     */
    @Ignore
    public void testIsEmptyErrorsTipicsWithNull() {
        System.out.println("isEmpty");
        Cua instance = new Cua();
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
        Cua instance = new Cua();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testDropFirstErrorsTipicsWithLongValues() {
        System.out.println("dropFirst");
        Cua instance = new Cua();
        Cua result = new Cua();
        instance.push(456456456456L);
        for (int i = 1; i < instance.size(); i++) {
            result.push(instance.get(i));
        }
        instance.dropFirst();
        assertEquals(instance, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of top method, of class Pila.
     */
    @Test
    public void testFirstErrorsTipicsWithLongValues() {
        System.out.println("top");
        Cua instance = new Cua();
        Object o = 456456456456L;
        instance.push(o);
        Object result = instance.first();
        assertEquals(o, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class Pila.
     */
    @Test
    public void testIsEmptyErrorsTipicsWithLongValues() {
        System.out.println("isEmpty");
        Cua instance = new Cua();
        Object o = 456456456456L;
        instance.push(o);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

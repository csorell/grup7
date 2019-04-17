/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llistaordenada;

import java.util.ArrayList;
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
public class LlistaOrdenadaTest {
    
    public LlistaOrdenadaTest() {
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
     * Test of fusionaArrays method, of class LlistaOrdenada.
     */
    @Test
    public void testFusionaArraysClassesEquivalencia() {
        System.out.println("fusionaArrays");
        
        int[] a = {2,5,4};
        int[] b = {1,3,6};
        ArrayList<Integer> expResult = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
            expResult.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            expResult.add(b[i]);
        }
        
        ArrayList<Integer> result = LlistaOrdenada.fusionaArrays(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ordenarArray method, of class LlistaOrdenada.
     */
    @Test
    public void testOrdenarArrayClassesEquivalencia() {
        System.out.println("ordenarArray");
        
        int[] a = {2,5,4};
        int[] b = {1,3,6};
        ArrayList<Integer> arrayFusionada = new ArrayList<>();
        ArrayList<Integer> expResult = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
            arrayFusionada.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            arrayFusionada.add(b[i]);
        }
        
        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        expResult.add(4);
        expResult.add(5);
        expResult.add(6);
        
        ArrayList<Integer> result = LlistaOrdenada.ordenarArray(arrayFusionada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Ignore
    public void testFusionaArraysErrorsTipicsWithNull() {
        System.out.println("fusionaArrays");
        int[] a = null;
        int[] b = null;
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = LlistaOrdenada.fusionaArrays(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ordenarArray method, of class LlistaOrdenada.
     */
    @Ignore
    public void testOrdenarArrayErrorsTipicsWithNull() {
        System.out.println("ordenarArray");
        ArrayList<Integer> arrayFusionada = null;
        LlistaOrdenada.ordenarArray(arrayFusionada);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Ignore
    public void testFusionaArraysErrorsTipicsWithNegativeValues() {
        System.out.println("fusionaArrays");
        
        int[] a = {-2,5,-4};
        int[] b = {1,3,-6};
        ArrayList<Integer> expResult = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
            expResult.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            expResult.add(b[i]);
        }
        
        ArrayList<Integer> result = LlistaOrdenada.fusionaArrays(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ordenarArray method, of class LlistaOrdenada.
     */
    @Ignore
    public void testOrdenarArrayErrorsTipicsWithNegativeValues() {
        System.out.println("ordenarArray");
        
        int[] a = {-2,5,-4};
        int[] b = {1,3,-6};
        ArrayList<Integer> arrayFusionada = new ArrayList<>();
        ArrayList<Integer> expResult = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
            arrayFusionada.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            arrayFusionada.add(b[i]);
        }
        
        expResult.add(-6);
        expResult.add(-4);
        expResult.add(-2);
        expResult.add(1);
        expResult.add(3);
        expResult.add(5);
        
        ArrayList<Integer> result = LlistaOrdenada.ordenarArray(arrayFusionada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Ignore
    public void testFusionaArraysErrorsTipicsWithLongValues() {
        System.out.println("fusionaArrays");
        
        long[] a = {223523532523L,5,4};
        long[] b = {1,3,6};
        ArrayList<Integer> expResult = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
            expResult.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            expResult.add(b[i]);
        }
        
        ArrayList<Integer> result = LlistaOrdenada.fusionaArrays(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ordenarArray method, of class LlistaOrdenada.
     */
    @Ignore
    public void testOrdenarArrayErrorsTipicsWithLongValues() {
        System.out.println("ordenarArray");
        
        long[] a = {2,5,4};
        long[] b = {1,3,6};
        ArrayList<Integer> arrayFusionada = new ArrayList<>();
        ArrayList<Integer> expResult = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
            arrayFusionada.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            arrayFusionada.add(b[i]);
        }
        
        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        expResult.add(4);
        expResult.add(5);
        expResult.add(6);
        
        ArrayList<Integer> result = LlistaOrdenada.ordenarArray(arrayFusionada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salaris;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marge
 */
public class salarisTest {
    
    public salarisTest() {
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
     * Test of calculaSalarioBruto method, of class salaris.
     */
    @Test
    public void testCalculaSalarioBrutoWithLongValues() {
        System.out.println("calculaSalarioBruto");
        float ventasMes = 10000000000L;
        float horasExtra = 0;
        salaris.TipoEmpleado tipo = salaris.TipoEmpleado.vendedor;
        salaris instance = new salaris();
        float expResult = 1200.0F;
        float result = instance.calculaSalarioBruto(ventasMes, horasExtra, tipo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculaSalarioNeto method, of class salaris.
     */
    @Test
    public void testCalculaSalarioNetoWithLongValues() {
        System.out.println("calculaSalarioNeto");
        float salarioBruto = 10000000L;
        salaris instance = new salaris();
        float expResult = 8200000L;
        float result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

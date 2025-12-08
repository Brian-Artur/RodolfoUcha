/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.inventario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author brianaf
 */
public class InventarioTest {
    
 @Test
    public void testConstructorSinParametros() {
        // Act
        Inventario inventario = new Inventario();
        
        // Assert
        assertNotNull("El inventario no debería ser null", inventario);
        assertEquals("El stock inicial debería ser 50", 50, inventario.getStockActual());
    }
    
    
    

    /**
     * Test of añadirStock method, of class Inventario.
     */
    @Test
    public void testAñadirStock() {
        System.out.println("a\u00f1adirStock");
        int cantidad = 0;
        Inventario instance = new Inventario();
        int expResult = 0;
        int result = instance.añadirStock(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirarStock method, of class Inventario.
     */
    @Test
    public void testRetirarStock() {
        System.out.println("retirarStock");
        int cantidad = 0;
        Inventario instance = new Inventario();
        int expResult = 0;
        int result = instance.retirarStock(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of necesitaReposicion method, of class Inventario.
     */
    @Test
    public void testNecesitaReposicion() {
        System.out.println("necesitaReposicion");
        Inventario instance = new Inventario();
        boolean expResult = false;
        boolean result = instance.necesitaReposicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVacio method, of class Inventario.
     */
    @Test
    public void testEstaVacio() {
        System.out.println("estaVacio");
        Inventario instance = new Inventario();
        boolean expResult = false;
        boolean result = instance.estaVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStockActual method, of class Inventario.
     */
    @Test
    public void testGetStockActual() {
        System.out.println("getStockActual");
        Inventario instance = new Inventario();
        int expResult = 0;
        int result = instance.getStockActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPorcentajeOcupacion method, of class Inventario.
     */
    @Test
    public void testCalcularPorcentajeOcupacion() {
        System.out.println("calcularPorcentajeOcupacion");
        Inventario instance = new Inventario();
        double expResult = 0.0;
        double result = instance.calcularPorcentajeOcupacion();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Inventario.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Inventario.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

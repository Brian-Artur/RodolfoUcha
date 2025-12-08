/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.joselv.calculadorapruebas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joselv
 */
public class CalculadoraPruebasTest {

    public CalculadoraPruebasTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /*
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
     */
    /**
     * Test of sumar method, of class CalculadoraPruebas.
     */
    @org.junit.jupiter.api.Test
    public void testSumar() {
        int a = 5;
        int b = 3;
        int resultadoEsperado = 8;

        // Act (Ejecución)
        CalculadoraPruebas instance = new CalculadoraPruebas();

        int resultadoReal = instance.sumar(a, b);

        // Assert (Verificación)
        assertEquals(resultadoEsperado, resultadoReal,
                "La suma de 5 + 3 debería ser 8");
        /*
        System.out.println("sumar");
        int a = 5;
        int b = 3;
        CalculadoraPruebas instance = new CalculadoraPruebas();
        int expResult = 8;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
         */
    }

    /**
     * Test of restar method, of class CalculadoraPruebas.
     */
    @org.junit.jupiter.api.Test
    public void testRestar() {
        int a = 10;
        int b = 4;
        int resultadoEsperado = 6;

        // Act (Ejecución)
        CalculadoraPruebas instance = new CalculadoraPruebas();

        int resultadoReal = instance.restar(a, b);

        // Assert (Verificación)
        assertEquals(resultadoEsperado, resultadoReal,
                "La resta de 10 - 4 debería ser 6");
    }

    /**
     * Test of multiplicar method, of class CalculadoraPruebas.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplicar() {
        int a = 6;
        int b = 7;
        int resultadoEsperado = 42;

        // Act (Ejecución)
        CalculadoraPruebas instance = new CalculadoraPruebas();

        int resultadoReal = instance.multiplicar(a, b);

        // Assert (Verificación)
        assertEquals(resultadoEsperado, resultadoReal,
                "La resta de 6 * 7 debería ser 42");
    }

    /**
     * Test of dividir method, of class CalculadoraPruebas.
     */
    @org.junit.jupiter.api.Test
    public void testDividir() {
        int a = 15;
        int b = 3;
        double resultadoEsperado = 5.0;

        // Act (Ejecución)
        CalculadoraPruebas instance = new CalculadoraPruebas();

        double resultadoReal = instance.dividir(a, b);

        // Assert (Verificación)
        assertEquals(resultadoEsperado, resultadoReal,
                "La división de 15 entre 3 debería ser 5");
    }

    /**
     * Test of dividir method with decimals, of class CalculadoraPruebas.
     */
    @org.junit.jupiter.api.Test
    public void testDividirConDecimales() {
        int a = 7;
        int b = 2;
        double resultadoEsperado = 3.5;

        // Act (Ejecución)
        CalculadoraPruebas instance = new CalculadoraPruebas();

        double resultadoReal = instance.dividir(a, b);

        // Assert (Verificación)
        assertEquals(resultadoEsperado, resultadoReal,
                "La división de 7 entre 2 debería ser 3.5");
    }

    /**
     * Test of dividir method, of class CalculadoraPruebas.
     */
    @org.junit.jupiter.api.Test
    public void testDividirPorCero() {
        // Arrange
        int a = 10;
        int b = 0;
        double resultadoEsperado = 5.0;

        // Act (Ejecución) & Assert (Validación)
        CalculadoraPruebas instance = new CalculadoraPruebas();

        //double resultadoReal = instance.dividir(a, b);

        ArithmeticException exception = assertThrows(ArithmeticException.class,
                () -> instance.dividir(a, b),
                "Debería lanzar ArithmeticException al dividir por cero");

        assertTrue(exception.getMessage().contains("No se puede dividir por cero"));
    }
    
    /**
     * Test of elevadoCubo method, of class CalculadoraPruebas.
     */
    @org.junit.jupiter.api.Test
    public void testelevadoCubo() {
        int a = 6;
        int resultadoEsperado = 216;

        // Act (Ejecución)
        CalculadoraPruebas instance = new CalculadoraPruebas();

        int resultadoReal = instance.elevadoCubo(a);

        // Assert (Verificación)
        assertEquals(resultadoEsperado, resultadoReal,
                "La resta de 6 debería ser 216");
    }
    

    /**
     * Test of main method, of class CalculadoraPruebas.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraPruebas.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of elevadoCubo method, of class CalculadoraPruebas.
     */
    @Test
    public void testElevadoCubo() {
        System.out.println("elevadoCubo");
        int a = 0;
        CalculadoraPruebas instance = new CalculadoraPruebas();
        int expResult = 0;
        int result = instance.elevadoCubo(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}

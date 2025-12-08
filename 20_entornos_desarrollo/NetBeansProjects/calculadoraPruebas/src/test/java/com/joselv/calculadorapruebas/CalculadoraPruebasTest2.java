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
public class CalculadoraPruebasTest2 {

    public CalculadoraPruebasTest2() {
    }

    private CalculadoraPruebas calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new CalculadoraPruebas();
    }

    @Test
    void testSumar() {
        assertEquals(8, calculadora.sumar(5, 3));
    }

    @Test
    void testRestar() {
        assertEquals(6, calculadora.restar(10, 4));
    }

    @Test
    void testMultiplicar() {
        assertEquals(42, calculadora.multiplicar(6, 7));
    }

    @Test
    void testDividir() {
        assertEquals(5.0, calculadora.dividir(15, 3), 0.001);
    }

    @Test
    void testDividirConDecimales() {
        assertEquals(3.5, calculadora.dividir(7, 2), 0.001);
    }

    @Test
    void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}



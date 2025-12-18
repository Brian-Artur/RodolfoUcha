/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.joselv.inventario;

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

class InventarioTest {

    private Inventario inventario;

    @BeforeEach
    void setUp() {
        // Se ejecuta antes de cada test
        inventario = new Inventario();
    }

    // 1. PRUEBAS DEL CONSTRUCTOR
    @Test
    void testConstructorSinParametros() {
        // Arrange & Act
        Inventario inv = new Inventario();
        
        // Assert
        assertEquals(50, inv.getStockActual(), 
                    "El constructor sin parámetros debería establecer stock en 50");
    }

    @Test
    void testConstructorConParametros() {
        // Arrange & Act
        Inventario inv = new Inventario(75);
        
        // Assert
        assertEquals(75, inv.getStockActual(), 
                    "El constructor con parámetros debería establecer el stock correctamente");
    }

    @Test
    void testConstructorConStockNegativo() {
        // Arrange, Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> new Inventario(-10),
            "Debería lanzar IllegalArgumentException con stock negativo"
        );
        
        assertTrue(exception.getMessage().contains("negativo"),
                  "El mensaje de error debería indicar 'negativo'");
    }

    // 2. PRUEBAS DE AÑADIR STOCK
    @Test
    void testAñadirStockNormal() {
        // Arrange
        int stockInicial = inventario.getStockActual(); // 50
        
        // Act
        int resultado = inventario.añadirStock(20);
        
        // Assert
        assertEquals(70, resultado, "50 + 20 debería ser 70");
        assertEquals(70, inventario.getStockActual(), 
                    "El stock actual debería actualizarse a 70");
    }

    @Test
    void testAñadirStockCantidadNegativa() {
        // Arrange
        int stockInicial = inventario.getStockActual();
        
        // Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> inventario.añadirStock(-5),
            "Debería lanzar excepción al añadir cantidad negativa"
        );
        
        assertEquals(stockInicial, inventario.getStockActual(),
                    "El stock no debería cambiar tras intento inválido");
    }

    @Test
    void testAñadirStockNoExcedeMaximo() {
        // Arrange
        Inventario inv = new Inventario(95); // Cercano al máximo
        
        // Act
        int resultado = inv.añadirStock(10);
        
        // Assert
        assertEquals(100, resultado, 
                    "95 + 10 debería limitarse a 100 (máximo)");
        assertEquals(100, inv.getStockActual());
    }

    @Test
    void testAñadirStockEnLimiteMaximo() {
        // Arrange
        Inventario inv = new Inventario(100); // Ya en máximo
        
        // Act
        int resultado = inv.añadirStock(5);
        
        // Assert
        assertEquals(100, resultado, 
                    "Al estar en máximo, añadir stock no debería cambiar el valor");
    }

    // 3. PRUEBAS DE RETIRAR STOCK
    @Test
    void testRetirarStockNormal() {
        // Arrange
        int stockInicial = inventario.getStockActual(); // 50
        
        // Act
        int resultado = inventario.retirarStock(15);
        
        // Assert
        assertEquals(35, resultado, "50 - 15 debería ser 35");
        assertEquals(35, inventario.getStockActual(), 
                    "El stock actual debería actualizarse a 35");
    }

    @Test
    void testRetirarStockCantidadNegativa() {
        // Arrange
        int stockInicial = inventario.getStockActual();
        
        // Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> inventario.retirarStock(-5),
            "Debería lanzar excepción al retirar cantidad negativa"
        );
        
        assertEquals(stockInicial, inventario.getStockActual(),
                    "El stock no debería cambiar tras intento inválido");
    }

    @Test
    void testRetirarStockInsuficiente() {
        // Arrange
        Inventario inv = new Inventario(10);
        // Act & Assert
        // Uso de IllegarArgumentException
        IllegalStateException exception = assertThrows(
            IllegalStateException.class,
            () -> inv.retirarStock(15),
            "Debería lanzar excepción al retirar más que disponible"
        );
        // Posible uso de getMessage().contains
                assertEquals(10, inv.getStockActual());

    }

    @Test
    void testRetirarTodoElStock() {
        // Arrange
        Inventario inv = new Inventario(32);
        // Act
        int resultado = inv.retirarStock(32);
        // Assert
        assertEquals(0, resultado, "Retirar todo el stock deja 0");
                assertEquals(0, inv.getStockActual());

    }

    // 4. PRUEBAS DE NECESITA REPOSICIÓN
    @Test
    void testNecesitaReposicionConStockBajo() {
        // Arrange
        Inventario inv = new Inventario(2);
        // Act
        boolean resultado = inv.necesitaReposicion();
        // Assert
        assertTrue(resultado, "Con stock de 2 sí necesita reposición");
    }

    @Test
    void testNoNecesitaReposicionConStockAlto() {
        // Arrange
        Inventario inv = new Inventario(87);
        // Act
        boolean resultado = inv.necesitaReposicion();
        // Assert
        assertFalse(resultado, "Con stock de 87 no necesita reposición");
    }

    @Test
    void testNecesitaReposicionEnLimite() {
        // Arrange
        Inventario inv = new Inventario(10);
        // Act
        boolean resultado = inv.necesitaReposicion();
        // Assert
        assertTrue(resultado, "Con stock de 15 no necesita reposición");
    }

    // 5. PRUEBAS DE PORCENTAJE DE OCUPACIÓN
    @Test
    void testCalcularPorcentajeOcupacion50PorCiento() {
        // Arrange
        Inventario inv = new Inventario(50);
        // Act
        double porcentaje = inv.calcularPorcentajeOcupacion();
        // Assert
        assertEquals(50.0, porcentaje, 0.001, "50 unidades -> 50%");
    }

    @Test
    void testCalcularPorcentajeOcupacion0PorCiento() {
        // Arrange
        Inventario inv = new Inventario(0);
        // Act
        double porcentaje = inv.calcularPorcentajeOcupacion();
        // Assert
        assertEquals(0, porcentaje, 0.001, "0 unidades -> 0%");
    }

    @Test
    void testCalcularPorcentajeOcupacion100PorCiento() {
        // Arrange
        Inventario inv = new Inventario(100);
        // Act
        double porcentaje = inv.calcularPorcentajeOcupacion();
        // Assert
        assertEquals(100, porcentaje, 0.001, "100 unidades -> 100%");
    }

    @Test
    void testCalcularPorcentajeOcupacionConDecimales() {
        // Arrange
        Inventario inv = new Inventario(33);
        // Act
        double porcentaje = inv.calcularPorcentajeOcupacion();
        // Assert
        assertEquals(33, porcentaje, 0.001, "33 unidades -> 33.0%");
    }

    // 6. PRUEBAS INTEGRADAS (Operaciones secuenciales)
    @Test
    void testOperacionesSecuenciales() {
        // Arrange
        Inventario inv = new Inventario(20);
        
        // Act - Secuencia de operaciones
        inv.añadirStock(15);   // 20 + 15 = 35
        inv.retirarStock(10);  // 35 - 10 = 25
        inv.añadirStock(5);    // 25 + 5 = 30
        inv.retirarStock(8);   // 30 - 8 = 22
        
        // Assert

    }

    @Test
    void testGetStockActualConsistente() {
        // Arrange
        int stockInicial = inventario.getStockActual();
        
        // Act & Assert - Verificar que getStockActual es consistente
        inventario.añadirStock(10);
        assertEquals(stockInicial + 10, inventario.getStockActual(),
                    "getStockActual debería reflejar el cambio tras añadir");
        
        inventario.retirarStock(5);
        assertEquals(stockInicial + 5, inventario.getStockActual(),
                    "getStockActual debería reflejar el cambio tras retirar");
    }
}
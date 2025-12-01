/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.joselv.calculadorapruebas;

/**
 *
 * @author joselv
 */
public class CalculadoraPruebas {
    
     /**
     * Suma dos números enteros
     */
    public int sumar(int a, int b) {
        return a + b;
    }
    
    /**
     * Resta dos números enteros
     */
    public int restar(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplica dos números enteros
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Divide dos números enteros
     * @throws ArithmeticException si se intenta dividir por cero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("Minicalcultadora para jugar con JUnit5. Soy joselv");
    }
    
    /**
     * Multiplica dos números enteros
     */
    public int elevadoCubo(int a) {
        return a * a * a;
    }
}

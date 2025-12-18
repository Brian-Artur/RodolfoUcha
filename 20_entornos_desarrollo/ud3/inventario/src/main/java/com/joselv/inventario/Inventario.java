/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.joselv.inventario;

/**
 *
 * @author joselv
 */
public class Inventario {

    private int stockActual;
    private final int STOCK_MAXIMO = 100;
    private final int STOCK_MINIMO = 10;

    public Inventario() {
        this.stockActual = 50; // Stock inicial
    }

    public Inventario(int stockInicial) {
        if (stockInicial < 0) {
            throw new IllegalArgumentException("El stock inicial no puede ser negativo");
        }
        this.stockActual = stockInicial;
    }

    /**
     * Añade unidades al inventario
     *
     * @param cantidad número de unidades a añadir
     * @return nuevo stock después de la operación
     * @throws IllegalArgumentException si la cantidad es negativa
     */
    public int añadirStock(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("No se puede añadir una cantidad negativa");
        }
        stockActual += cantidad;
        if (stockActual > STOCK_MAXIMO) {
            stockActual = STOCK_MAXIMO;
        }
        return stockActual;
    }

    /**
     * Retira unidades del inventario
     *
     * @param cantidad número de unidades a retirar
     * @return nuevo stock después de la operación
     * @throws IllegalArgumentException si la cantidad es negativa
     * @throws IllegalStateException si no hay suficiente stock
     */
    public int retirarStock(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("No se puede retirar una cantidad negativa");
        }
        if (cantidad > stockActual) {
            throw new IllegalStateException("Stock insuficiente. Disponible: " + stockActual);
        }
        stockActual -= cantidad;
        return stockActual;
    }

    /**
     * Verifica si es necesario realizar un pedido
     *
     * @return true si el stock está por debajo del mínimo
     */
    public boolean necesitaReposicion() {
        return stockActual <= STOCK_MINIMO;
    }

    /**
     * Verifica si el inventario está vacío
     *
     * @return true si no hay unidades en stock
     */
    public boolean estaVacio() {
        return stockActual == 0;
    }

    /**
     * Obtiene el nivel de stock actual
     */
    public int getStockActual() {
        return stockActual;
    }

    /**
     * Calcula el porcentaje de ocupación del almacén
     *
     * @return porcentaje de 0 a 100
     */
    public double calcularPorcentajeOcupacion() {
        return ((double) stockActual / STOCK_MAXIMO) * 100;
    }

    public static void main(String[] args) {
        System.out.println("Inventario para jugar con JUnit5. Soy joselv");
    }
}

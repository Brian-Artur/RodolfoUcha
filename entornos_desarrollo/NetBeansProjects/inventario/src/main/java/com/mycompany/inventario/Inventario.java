package com.mycompany.inventario;

/**
 *
 * @author brianaf
 */
public class Inventario {
    int stockActual = 0;
    final int STOCK_MAXIMO = 100;
    final int STOCK_MINIMO = 10;
    
    public Inventario() {
        this.stockActual = 50; // Stock inicial
    }
    
    public Inventario(int stockInicial) {
        if (stockInicial < 0) {
            throw new IllegalArgumentException("El stock inicial no puede ser negativo");
        }
        this.stockActual = stockInicial;
    }
    
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
    
    public boolean necesitaReposicion() {
        return stockActual < STOCK_MINIMO;
    }
    
    public boolean estaVacio() {
        return stockActual == 0;
    }
    
    public int getStockActual() {
        return stockActual;
    }
    
    public double calcularPorcentajeOcupacion() {
        return ((double) stockActual / STOCK_MAXIMO) * 100;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

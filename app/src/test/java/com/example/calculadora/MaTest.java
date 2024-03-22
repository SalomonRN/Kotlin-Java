package com.example.calculadora;

import junit.framework.TestCase;

import org.junit.Test;

public class MaTest extends TestCase {

    @Test
    public void testFuncionResta() {

        Ma m = new Ma();
        double resultado = m.funcionResta(4, 3);
        assertEquals(1.0, resultado);
    }

    @Test
    public void testFuncionSuma() {

        Ma m = new Ma();
        double resultado = m.funcionSuma(4, 3);
        assertEquals(7.0, resultado);
    }

    @Test
    public void testFuncionMultiplicacion() {

        Ma m = new Ma();
        double resultado = m.funcionMultiplicacion(4, 3);
        assertEquals(12.0, resultado);
    }

    @Test
    public void testFuncionDivision() {

        Ma m = new Ma();
        double resultado = m.funcionDivision(12, 3);
        assertEquals(4.0, resultado);
    }

    @Test
    public void testFuncionPotencia() {

        Ma m = new Ma();
        double resultado = m.funcionPotencia(2, 4);
        assertEquals(16.0, resultado);
    }

    @Test
    public void testFuncionSucesion() {

        Ma m = new Ma();
        long resultado = m.funcionSucesion(5);
        assertEquals(5, resultado);
    }

    @Test
    public void testFuncionFactorial() {

        Ma m = new Ma();
        double resultado = m.funcionFactorial(5);
        assertEquals(120.0, resultado);
    }
}
package org.lucasrocha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputadorTest {

    @Test
    void deveRetornarPrecoComputadorDaApple() {
        Marca marca = new Apple();
        Computador tablet = new Computador(1000.0f);
        tablet.setMarca(marca);
        assertEquals(7500.0f, tablet.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComputadorDaSamsung() {
        Marca marca = new Samsung();
        Computador tablet = new Computador(1000.0f);
        tablet.setMarca(marca);
        assertEquals(6000.0f, tablet.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoComputadorDaPositivo() {
        Marca marca = new Positivo();
        Computador tablet = new Computador(1000.0f);
        tablet.setMarca(marca);
        assertEquals(5250.0f, tablet.calcularPreco(),0.01f);
    }
}

package org.lucasrocha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelularTest {

    @Test
    void deveRetornarPrecoCelularDaApple() {
        Marca marca = new Apple();
        Celular celular = new Celular(1000.0f);
        celular.setMarca(marca);
        assertEquals(3000.0f, celular.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCelularDaSamsung() {
        Marca marca = new Samsung();
        Celular celular = new Celular(1000.0f);
        celular.setMarca(marca);
        assertEquals(2400.0f, celular.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCelularDaPositivo() {
        Marca marca = new Positivo();
        Celular celular = new Celular(1000.0f);
        celular.setMarca(marca);
        assertEquals(2100.0f, celular.calcularPreco(), 0.01f);
    }
}

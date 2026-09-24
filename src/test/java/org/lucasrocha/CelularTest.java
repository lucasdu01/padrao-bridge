package org.lucasrocha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AparelhoTest {

    @Test
    void deveRetornarAparelhoCelularApple() {
        Marca marca = new Apple();
        Celular celular = new Celular(1000.0f);
        celular.setMarca(marca);
        assertEquals(3000.0f, celular.calcularPreco());
    }
}

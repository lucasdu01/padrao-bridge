package org.lucasrocha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TabletTest {

    @Test
    void deveRetornarPrecoTabletDaApple() {
        Marca marca = new Apple();
        Tablet tablet = new Tablet(1000.0f);
        tablet.setMarca(marca);
        assertEquals(4500.0f, tablet.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTabletDaSamsung() {
        Marca marca = new Samsung();
        Tablet tablet = new Tablet(1000.0f);
        tablet.setMarca(marca);
        assertEquals(3600.0f, tablet.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoTabletDaPositivo() {
        Marca marca = new Positivo();
        Tablet tablet = new Tablet(1000.0f);
        tablet.setMarca(marca);
        assertEquals(3150.0f, tablet.calcularPreco(),0.01f);
    }
}

package org.lucasrocha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotebookTest {

    @Test
    void deveRetornarPrecoNotebookDaApple() {
        Marca marca = new Apple();
        Notebook tablet = new Notebook(1000.0f);
        tablet.setMarca(marca);
        assertEquals(6000.0f, tablet.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoNotebookDaSamsung() {
        Marca marca = new Samsung();
        Notebook tablet = new Notebook(1000.0f);
        tablet.setMarca(marca);
        assertEquals(4800.0f, tablet.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoNotebookDaPositivo() {
        Marca marca = new Positivo();
        Notebook tablet = new Notebook(1000.0f);
        tablet.setMarca(marca);
        assertEquals(4200.0f, tablet.calcularPreco(),0.01f);
    }
}

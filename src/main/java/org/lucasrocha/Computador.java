package org.lucasrocha;

public class Computador extends Aparelho{

    public Computador(float precoBase){
        super(precoBase);
    }

    public float calcularPreco(){
        return (this.precoBase + 4000) * (1 + this.marca.valorizacao());
    }
}

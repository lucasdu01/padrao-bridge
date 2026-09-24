package org.lucasrocha;

public class Celular extends Aparelho {

    public Celular(float precoBase){
        super(precoBase);
    }

    public float calcularPreco(){
        return (this.precoBase + 1000) * (1 + this.marca.valorizacao());
    }
}

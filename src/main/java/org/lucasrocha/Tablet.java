package org.lucasrocha;

public class Tablet extends Aparelho {

    public Tablet(float precoBase){
        super(precoBase);
    }

    public float calcularPreco(){
        return (this.precoBase + 2000) * (1 + this.marca.valorizacao());
    }
}

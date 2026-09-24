package org.lucasrocha;

public class Notebook extends Aparelho {
    public Notebook (float precoBase){
        super(precoBase);
    }

    public float calcularPreco(){
        return (this.precoBase + 3000) * (1 + this.marca.valorizacao());
    }
}

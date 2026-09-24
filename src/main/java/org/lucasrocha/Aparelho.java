package org.lucasrocha;

public abstract class Aparelho {

    protected Marca marca;

    protected float precoBase;

    public Aparelho(float precoBase){
        this.precoBase = precoBase;
    }
     public void setMarca(Marca marca){
        this.marca = marca;
     }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}

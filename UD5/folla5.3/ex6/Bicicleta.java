package ex6;

import java.io.Serializable;

public class Bicicleta implements Serializable{

    private String modelo;
    private String cor;

        public Bicicleta(String model, String color) {
        this.modelo = model;
        this.cor = color;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    
}
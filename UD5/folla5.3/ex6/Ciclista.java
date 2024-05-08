package ex6;

import java.io.Serializable;

public class Ciclista implements Serializable{
    private String nome;
    private Bicicleta bici;
    static final long serialVersionUID = 1L;

    public Ciclista(String nom, Bicicleta bicicleta){
        this.nome = nom;
        this.bici = bicicleta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public Bicicleta getBici() {
        return bici;
    }

    public void setBici(Bicicleta bicicleta) {
        this.bici = bicicleta;
    }

    

    
}
package UD3;

/**
 * Usuario
 */
public class Usuario {
    /* ATRIBUTOS */

    private String nome;
    private int idade;

    /*MÉTODOS */  
    public Usuario(String nomString, int idad){
        nome = nomString;
        this.idade = idad;
    }

    public void setNome(String nom){
        nome = nom;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        if(idade >=0 && idade < 120){
            this.idade = idade;
        }
    }

    public int getIdade( ){
        return idade;
    }
}
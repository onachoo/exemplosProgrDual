package UD3.herdanza;

/**
 * Electrodomestico
 */
public class Electrodomestico {

    private String codigo;
    private int prezo;
    public Electrodomestico(){
        codigo = "sin asignar";
        prezo = 0;
    }
    public Electrodomestico(String code, int prz){
        codigo = code;
        prezo = prz;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String code){
        codigo = code;
    }
    public int getPrezo(){
        return prezo;
    }
    public void setPrezo(int prz){
        prezo = prz;
    }


}
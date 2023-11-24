package UD3.herdanza;

public class Lavadora extends Electrodomestico{

    private int cargaKgs;

    public Lavadora(){
        super();
        this.setCodigo("codigoLavadora");
        cargaKgs = 0;
    }
    public Lavadora(String codigo, int prez, int cargaKgs) {
        
        super(codigo, prez);
        
        this.cargaKgs = cargaKgs;
    }

    public int getCarga(){
        return cargaKgs;
        
    }
}
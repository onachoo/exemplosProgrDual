package UD3;

public class AppEsfera {

    public static void main(String[] args) {
        
        Esfera esfera1 = new Esfera();
        System.out.println("Temos "+Esfera.numEsferas);
        Esfera esfera2 = new Esfera();
        System.out.println("Temos "+Esfera.numEsferas);

        double vol = esfera1.getVolume();
        esfera1.setRadio(2.0);
        System.out.println("O volume de esfera1 "+ vol);
    
        double radioMaior = Esfera.devolveRadioMaior(esfera1, esfera2);
        System.out.println("O radio maior é "+  radioMaior);
    }


}
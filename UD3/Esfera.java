package UD3;

public class Esfera {
    private double radio;
    private static final double PI = 3.1416;

    public static int numEsferas = 0; 

    public Esfera(){
        radio = 1;
        numEsferas++;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double rad){
        radio = rad;
    }

    public double getVolume(){
        double volume = 4.0/3 * PI * radio * radio * radio;
        return volume;
    }

    public static double devolveRadioMaior(Esfera esf1, Esfera esf2){
        if( esf1.radio > esf2.radio){
            return esf1.radio;
        } else {
            return esf2.radio;
        }
    }
    
}
public class ArraySuma10primeiros {

    public static void main(String[] args) {
        
        int [] arrayEnteiros = new int[10];
        /* TER NO ARRAY OS 10 PRIMEIROS NÚMEROS E CALCULAR A SUMA */

        for (int i = 0; i < arrayEnteiros.length; i++) {
            arrayEnteiros [i] = i + 1;
        }
        int suma = 0;
        for (int i = 0; i < arrayEnteiros.length; i++) {
            suma = suma + arrayEnteiros[i];
        }
        for (int valor : arrayEnteiros) {
            suma +=  valor;
        }

        System.out.println("A suma vale "+ suma);
    }
}
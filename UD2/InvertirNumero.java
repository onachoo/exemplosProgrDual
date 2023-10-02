import java.util.Scanner;

public class InvertirNumero {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un ńúmero de 4 cifras");
        int numero = entrada.nextInt();
        int numeroInvertido;
        /* 5781 */
        if(numero > 999 && numero < 10000){
            int miles = numero / 1000;
            int resto = numero % 1000;
            int centenas = resto / 100;
            resto = resto % 100;
            int decenas = resto / 10;
            int unidades = resto % 10;
            numeroInvertido = unidades * 1000 + decenas* 100 + centenas * 10 + miles;
            System.out.println(" O número invertido será "+ numeroInvertido);
        } else {
            System.out.println("O número NON ten 4 cifras!!!!");
        }
    }
}
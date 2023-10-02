import java.util.Scanner;

public class MenorMaiorMedio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce un número");
        int numero1 = entrada.nextInt();
        System.out.println("introduce un número");
        int numero2 = entrada.nextInt();
        System.out.println("introduce un número");
        int numero3 = entrada.nextInt();
        int menor;
        int maior;
        int medio;

        if(numero1 < numero2){
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }

        /* O MEDIO! */
        if( numero3 < menor) {
            medio = menor;
            menor = numero3;    
        } else if(numero3 > menor && numero3 < maior) {

        } else {  /* numero3 > maior */

        }



    }
}
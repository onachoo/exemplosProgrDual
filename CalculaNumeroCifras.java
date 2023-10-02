import java.util.Scanner;

public class CalcularNumeroCifras {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce un número");
        int numeroEnteiro = entrada.nextInt();
        int cifras = 0;
            /*    345 ->  34  -> 3  -> 0 */
        while(numeroEnteiro > 0){
            numeroEnteiro = numeroEnteiro / 10;
            /*DIVIDO POR 10 */
            cifras++;

        }

        System.out.println("O número de cifras é "+ cifras);

        
    }

}
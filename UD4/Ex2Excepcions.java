import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2Excepcions {

    public static void main(String[] args) {
        int numero = 0;
        int factorial = 1;
        Scanner entrada = new Scanner(System.in);
        int flagCatch = 0;
        while (factorial == 1){
            try{
                System.out.println("Introduce un número");
                numero = entrada.nextInt();
                for(int i = 1; i <= numero; i++){
                  factorial = factorial * i;
                }
            } catch(InputMismatchException e){
                entrada.next();
                System.out.println("Tes que introducir un número enteiro");
            }
        }
        System.out.println("O factorial de "+numero+" é "+factorial);      
    }
}
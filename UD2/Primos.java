import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {     
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = entrada.nextInt();
        int flag = 0;
        for(int i = 2; i <= numero / 2  ; i++){
            if(numero % i == 0){
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("o numero é primo");
        } else {
            System.out.println("O número NON é primo");
        }

    }
}






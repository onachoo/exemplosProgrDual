import java.util.Scanner;
public class ExemploIf {
        public static void main(String[] args) {
           
            Scanner entrada = new Scanner(System.in);

            System.out.println("INtroduce un número");
            int numero = entrada.nextInt();
            /*   CONDICIÓN:    VARIABLE OPERADOR VALOR/VARIABLE   
             *  OPERADOR: >, <, >=, <=, == , != 
             */
             if (numero > 10) {
                System.out.println("O número é maior que 10! ");
             }
                /* 2 OPCIÓNS:  */
            if (numero < 100) {
                System.out.println("O número é menor que 100");
             } else {
                  System.out.println("O número é maior ou igual que 100");
             }
            

             
               /* VARIAS  OPCIÓNS:  */
             if (numero < 100) {
                System.out.println("O número é menor que 100");
             } else if (numero == 100) {
                System.out.println("O número é igual que 100");
             } else {
                  System.out.println("O número é mario que 100");
             }




             
             System.out.println("Ata logo");
            }
}
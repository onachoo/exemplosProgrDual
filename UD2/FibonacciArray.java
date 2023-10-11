import java.util.Scanner;
public class FibonacciArray {
      public static void main(String[] args) {    
        int [] arrayEnteiros = new int[8];
        Scanner entrada = new Scanner(System.in);

        /* GARDAR OS NÚMEROS DA SERIE DE FIBONACCI: 0,1,1,2,3,5,8,13 */
        arrayEnteiros[0] = 0;
        arrayEnteiros[1] = 1;
        
        
        for (int i = 2; i < arrayEnteiros.length; i++) {
                arrayEnteiros[i] = arrayEnteiros[i-2] +arrayEnteiros[i-1];
         }

        for(int i = 0; i < 8; i++){  /* ACCEDO AO VALOR EMPREGANDO O ÍNDICE */
            System.out.println("O número na posición "+i+" é "+arrayEnteiros[i]);
        }

        }
    }

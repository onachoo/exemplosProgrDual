import java.util.Scanner;

public class ExemploArray1 {
  
    public static void main(String[] args) {
        
        int [] arrayEnteiros = new int[7];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < arrayEnteiros.length; i++) {
            System.out.println("Introduce un valor enteiro");
            arrayEnteiros[i] = entrada.nextInt();
        }

        arrayEnteiros[3] = 0; 

        System.out.println(arrayEnteiros[0]);

        for (int enteiro : arrayEnteiros) {  /* ACCEDO AO VALOR DIRECTAMENTE */
            System.out.println(enteiro);
        }
        
        for(int i = 0; i < 7; i++){  /* ACCEDO AO VALOR EMPREGANDO O ÍNDICE */
            System.out.println("O número na posición "+i+" é "+arrayEnteiros[i]);
        }

        }
    }

import java.util.Scanner;

public class BisestoconReturn {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce un ano");

        int ano = entrada.nextInt();
        /* NON MÚLTIPLO DE 4 */
        if(ano % 4 != 0){
            System.out.println("ANO non bisesto");
            return;
        } 
        /*OS MÚLTIPLOS DE 100. */
        if(ano % 100 == 0){  
                if(ano % 400 == 0){
                    System.out.println("Ano bisesto!");
                } else {
                    System.out.println("Ano NON bisesto!");
                }
                return;
        }        
        /* MÚLTIPLO DE 4 PERO NON DE 100 */
            System.out.println("Ano bisesto!");
        
        }
    }

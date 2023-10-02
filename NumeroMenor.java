import java.util.Scanner;

public class NumeroMenor {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int primeiroNumero , segundoNumero, terceiroNumero;
        System.out.println("INtroduce o primeiro número");
        primeiroNumero = entrada.nextInt();
        System.out.println("INtroduce o segundo número");
        segundoNumero = entrada.nextInt();
        System.out.println("INtroduce o terceiro número");
        terceiroNumero = entrada.nextInt();
        
        int menor = primeiroNumero;
        

        if(segundoNumero < menor){
            menor = segundoNumero;
        }
        if(terceiroNumero < menor){
            menor = terceiroNumero;
        }
        System.out.println("O menor é "+ menor);

    }
}

















import java.util.Scanner;

public class TaboaMultiplicarVariasVeces {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int numeroEnteiro;
        int resultado;
        String resposta;
        do{
            System.out.println("INtroduce un número");

            numeroEnteiro = escaner.nextInt();
            escaner.nextLine(); /* CAPTURO O INTRO */
            for (int i = 1; i < 10 ; i++) {
                resultado = i * numeroEnteiro;
                System.out.println(i + " x " + numeroEnteiro + " = "+ resultado);
            }
            System.out.println("Queres continuar? si/non");
            resposta = escaner.nextLine();
        } while(resposta.equals("si"));

    }
}
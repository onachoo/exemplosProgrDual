/* PIDO VARIABLE POR TECLADO E MOSTRO O SEU VALOR */

import java.util.Scanner;

public class PideVariables {
    public static void main(String[] args) {
        Scanner escaner= new Scanner(System.in);
        System.out.println("INtroduce un enteiro");
        int numeroEnteiro = escaner.nextInt();
        escaner.nextLine(); /* INTRO */

        System.out.println("Introduce Santiago");
        String nome = escaner.nextLine();
        System.out.println(nome);

        escaner.close();
    }
    
}
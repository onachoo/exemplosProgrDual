import java.util.Scanner;
public class ArraysMenu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        System.out.println("a) Introducir os 5 números");
        System.out.println("b) Mostrar os 5 números");
        System.out.println("c) Saír");
        while(!opcion.equals("c")){
            if(opcion.equals("a")){

                System.out.println("Teríamos aquí que introducir os 5 números");
            }
            else if(opcion.equals("b")){

               System.out.println("Mostramos aquí os 5 números");
            }
            System.out.println("a) Introducir os 5 números");
            System.out.println("b) Mostrar os 5 números");
            System.out.println("c) Saír");
            opcion = entrada.nextLine();
        }
    }
}
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

                /* Código para introducir os números */
            }
            else if(opcion.equals("b")){

                /* Código para mostrar os números */
            }
            System.out.println("a) Introducir os 5 números");
            System.out.println("b) Mostrar os 5 números");
            System.out.println("c) Saír");
            opcion = entrada.nextLine();
        }
    }
}
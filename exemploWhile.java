import java.util.Scanner;

public class exemploWhile {

    public static void main(String[] args) {     
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quere continuar?");
        String palabra = "si";
        palabra = entrada.nextLine();
        
        while(palabra.equals("si")){
            System.out.println(palabra);
            System.out.println("Quere continuar?");
            palabra = entrada.nextLine();
        } 
    }
}
       

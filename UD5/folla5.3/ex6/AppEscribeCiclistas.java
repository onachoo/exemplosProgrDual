package ex6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * AppEscribeCiclistas
 */
public class AppEscribeCiclistas {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       Ciclista ciclista1 = introducirCiclista(teclado);
       Ciclista ciclista2 = introducirCiclista(teclado);

        try (BicicletaOutputStream output = new BicicletaOutputStream(Files.newOutputStream(Paths.get("ciclistas.dat")))){
            output.writeObject(ciclista1); 
            output.writeObject(ciclista2);   
        } catch(IOException e){
            System.out.println("Error E/S: " + e);
        }

        teclado.close();
    }
    
    public static Ciclista introducirCiclista(Scanner entrada){
        String modeloBici;
        String corBici;
        String nomeCiclista;
        
        System.out.println("Introduce o modelo da bici");
        modeloBici = entrada.nextLine();
        System.out.println("A cor da bici?");
        corBici = entrada.nextLine();
        System.out.println("Como se chama o ciclista");
        nomeCiclista = entrada.nextLine();

        Bicicleta bici = new Bicicleta(modeloBici,corBici);
        Ciclista ciclista = new Ciclista(nomeCiclista, bici);
        
        
        return ciclista;
    }
    
}
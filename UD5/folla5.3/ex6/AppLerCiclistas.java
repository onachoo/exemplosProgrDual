package ex6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class AppLerCiclistas {

    public static void main(String[] args) {
        
        try (BicicletaInputStream input = new BicicletaInputStream(Files.newInputStream(Paths.get("ciclistas.dat")))){
            System.out.println("EEOO");
            Ciclista ciclista = null;
            while((ciclista = (Ciclista) input.readObject())!=null){
                System.out.println("O ciclista "+ciclista.getNome()+
                    " leva unha "+ciclista.getBici().getModelo()+" de cor "+ ciclista.getBici().getCor());
            }

        } catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println("Chegamos ao final do ficheiro. Non hai máis ciclistas");
        } catch(ClassNotFoundException e ){
            System.out.println("Non hai gardados ciclistas no ficheiro");
        }
    }
}
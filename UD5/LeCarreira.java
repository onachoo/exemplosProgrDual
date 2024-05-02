import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class LeCarreira {
      public static void main(String[] args) {
    //Uso de recursos e excepcións clásica sen try with resources
   
        FileInputStream fis = null;
        DataInputStream entrada = null;
        int dorsal;
        double tempo;
        try {
            fis = new FileInputStream("carreira.bin");
            entrada = new DataInputStream(fis);
            while ((dorsal = entrada.readInt())!= 0 && (tempo = entrada.readDouble())!=-1.0) {   
                //lemos  un double do ficheiro. 
                //O bucle remata cando se chega ao final do ficheiro e se lanza a excepción EOFException                                           
                System.out.println("O corredor con dorsal "+dorsal+" rematou con tempo "+tempo);  //móstrase na pantalla
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }
}
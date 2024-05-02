import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class GardarCarreira {   
    public static void main(String[] args) {
    //Uso de recursos e excepcións clásica sen try with resources            
        Scanner sc = new Scanner(System.in);                                                                      
        FileOutputStream fos = null;
        DataOutputStream saida = null;
        int dorsal;
        double tempo;
        try {
            fos = new FileOutputStream("carreira.bin");
            saida = new DataOutputStream(fos);
            /*NON FACEMOS COMPROBACIÓN DE QUE OS DATOS SON CORRECTOS */
            System.out.println("Introduce dorsal e tempo dos 5 corredores:");
            for(int i = 0; i < 5; i++){
                System.out.print("Introduce o dorsal. ");
                dorsal = sc.nextInt();
                System.out.println("Introduce o tempo (segs con decimais)");
                tempo = sc.nextDouble();
                saida.writeInt(dorsal);  //gardamos dorsal
                saida.writeDouble(tempo); //Gardamos o tempo double no ficheiro                                   
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            try {
                if (fos != null) {
                    fos.close();
                }
                if (saida != null) {
                    saida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
       }
    }
}
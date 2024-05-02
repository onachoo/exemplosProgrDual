package exercicio13;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class LeCarreiraArrayList {
    public static void main(String[] args) {   
       
        int dorsal;
        double tempo;
        Scanner entradaTeclado = new Scanner(System.in);
        String resposta = "non";
        ArrayList <Corredor> corredores = new ArrayList<Corredor>();
        
        try (DataInputStream entrada = new DataInputStream(new FileInputStream("carreira.bin"))) {        
            while ((dorsal = entrada.readInt())!= 0 && (tempo = entrada.readDouble())!=-1.0) {   
                //lemos do ficheiro 
                //O bucle remata cando se chega ao final do ficheiro e se lanza a excepción EOFException                                           
                corredores.add(new Corredor (dorsal, tempo));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
        

        for (Corredor corredor : corredores) {
            System.out.println("O corredor con dorsal "+corredor.dorsal +  " fixo de tempo: "+corredor.tempo);
        }
        System.out.println("Queres gardar máis tempos? s/n");
        resposta = entradaTeclado.next();
        if(resposta.equals("s")){
            while(resposta.equals("s") ){
                System.out.print("Introduce o dorsal. ");
                dorsal = entradaTeclado.nextInt();
                System.out.println("Introduce o tempo (segs con decimais)");
                tempo = entradaTeclado.nextDouble();
                corredores.add(new Corredor (dorsal, tempo));
                entradaTeclado.nextLine();
                System.out.println("Queres gardar máis tempos? s/n");
                resposta = entradaTeclado.nextLine();
                }
            try (DataOutputStream saida = new DataOutputStream(new FileOutputStream("carreira.bin"))) {
                for (Corredor corredor : corredores) {
                    saida.writeInt(corredor.dorsal); 
                    saida.writeDouble(corredor.tempo);
                }
            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }catch (IOException e) {
                System.out.println(e.getMessage());
            } 

        }
    entradaTeclado.close();    
    }
}
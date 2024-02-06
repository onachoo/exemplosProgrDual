/*Empregando as clases do exercicio anterior, define unha clase AppExercicio7 
que defina un array de 3 ordenadores. A continuación se pedirán os valores por teclado para eses 
3 ordenadores con JOptionPane. O programa deberá controlar todas as excepcións posibles de entrada
 de datos, de modo que se un ordenador non se pode montar non se engadirá ao array. As 
 restriccións do exercicio anterior tamén deben impedir engadir un ordenador ao array. Cada 
 vez que se lance unha excepción deberá saír por consola unha descrición da mesma.

Unha vez introducidos valores correctos para os 3 ordenadores, o programa mostrará as 
características deses 3 ordenadores. */
package Ordenador;

import javax.swing.JOptionPane;

/**
 * AppExercicio7
 */
public class AppExercicio7 {
    public static void main(String[] args) {
        Ordenador [] listaOrdenadores =  new Ordenador[3];
        for (int i = 0; i < listaOrdenadores.length; i++) {
            Ordenador pc = new Ordenador();
            do {
                String numeroDeSerie = JOptionPane.showInputDialog("Introduce un número de serie");
                String m_capacidade = JOptionPane.showInputDialog("Introduce la capacidad de la memoria en GB");
                String m_tipo = JOptionPane.showInputDialog("Introduce el tipo de la memoria");
                String m_velocidade = JOptionPane.showInputDialog("Introduce la velocidad de la memoria");
                String d_capacidade = JOptionPane.showInputDialog("Introduce la capacidad del disco duro");
                String d_tipo = JOptionPane.showInputDialog("Introduce el tipo de disco duro");
                String d_velocidade = JOptionPane.showInputDialog("Introduce la velocidad del disco duro");
                String p_modelo = JOptionPane.showInputDialog("Introduce el modelo del procesador");
                String p_velocidade = JOptionPane.showInputDialog("Introduce la velocidad del procesador");
                String prezo = JOptionPane.showInputDialog("Introduce el precio");
                           
                try {
                    pc = new Ordenador(numeroDeSerie, Integer.valueOf(m_capacidade), m_tipo, Integer.valueOf(m_velocidade),
                                 Double.valueOf(d_capacidade), d_tipo, Integer.valueOf(d_velocidade), p_modelo, 
                                 Double.valueOf(p_velocidade), Integer.valueOf(prezo));
                } catch (OrdenadorException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e){
                    System.out.println("Houbo datos mal introducidos");
                }
            } while (pc.getNumeroDeSerie()==null);
            
            listaOrdenadores[i]=pc;
        }
        
        for (Ordenador ordenador : listaOrdenadores) {
            System.out.println(ordenador.getNumeroDeSerie());
        }
    }
    
}
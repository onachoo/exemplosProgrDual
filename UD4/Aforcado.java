package UD4;

import javax.swing.JOptionPane;

public class Aforcado {

    public static void main(String[] args) {
     
        StringBuilder cadeaIntroducida = new StringBuilder("        ");
        String cadeaAdivinhar = "cantando";
        StringBuilder cadeaMostra = new StringBuilder("_ _ _ _ _ _ _ _");
        int intentos = 0;
        String mensaxe = "Introduce unha letra \n "+cadeaMostra.toString();
        while(!cadeaAdivinhar.equals(cadeaIntroducida.toString()) &&  intentos < 10){
            char letra = JOptionPane.showInputDialog(null,mensaxe).charAt(0);

            for(int i = 0; i < cadeaAdivinhar.length(); i++){
                if(letra == cadeaAdivinhar.charAt(i)){
                    cadeaIntroducida.setCharAt(i, letra);
                    cadeaMostra.setCharAt(2*i, letra);
                }
            }
            intentos++;
            mensaxe = "Introduce unha letra \n "+cadeaMostra.toString();
        }
        if(intentos < 10){
            JOptionPane.showMessageDialog(null,"Noraboa! Acertaches en "+intentos+ " intentos");  
        } else  {
            JOptionPane.showMessageDialog(null,"Non acertaches. A palabra era "+cadeaAdivinhar);
        }
        

        
    }
}



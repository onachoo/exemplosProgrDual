package UD3;

public class AppUsuario {
    public static void main(String[] args) {
        
        Usuario eva = new Usuario("Eva", 30);

        System.out.println("O nome é "+eva.getNome()+" e a idade de Eva é "+eva.getIdade());
        eva.setNome("Eva María");
        System.out.println("O nome é "+eva.getNome());
        eva.setIdade(231);
        
        System.out.println("O nome é "+eva.getIdade());








    }

}
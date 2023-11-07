package UD3;

public class AppEmpregado {

    public static void main(String[] args) {
        
        Empregado miguel= new Empregado("Eva",10 );
        Empregado ana= new  Empregado("Valentino",23 );
        miguel.asignaNome("Miguel");
        ana.nome="Ana";
        System.out.println("Os novos empregados son "+miguel.nome+" e "+ ana.getNome());  
    
    }
}
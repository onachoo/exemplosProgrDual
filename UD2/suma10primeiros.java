import java.util.Scanner;

public class suma10primeiros {

    public static void main(String[] args) {     
        
        Scanner entrada = new Scanner(System.in);
    

        int suma = 0;
        for(int i=1; i < 10 ; i++){
           suma = suma + i;
       }
       System.out.println(" A suma dos 10 primeiros números vale "+ suma );

    }
}






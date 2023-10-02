import java.util.Scanner;

public class Anos {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Introduza o ano");
        int anoNac = sca.nextInt();
        System.out.println("Introduza o mes");
        int mesNac = sca.nextInt();
        System.out.println("Introduza o dia");
        int diaNac = sca.nextInt();
        int anos;
        if(mesNac < 9) {
            anos = 2023 - anoNac;
   
        } else if (mesNac > 9 ){
            anos = 2023 - anoNac - 1;
        } else {    /* NACE NESTE MES DE SETEMBRO */
            if (diaNac <= 19) {  /* XA CUMPLIU ANOS */
                anos = 2023 - anoNac;
            } else {
                anos = 2023 - anoNac - 1;
            }
        }
        System.out.println(" Tes "+anos+ " anos!");
    }
}
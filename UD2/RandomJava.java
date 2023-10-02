public class RandomJava {

    public static void main(String[] args) {
        
        /* ALEATORIO ENTRE 1.0 E 10.0  */
        double aleatorioDouble = Math.random()* 10  + 1.0;
        System.out.println(aleatorioDouble);

        /* ALEATORIO ENTRE 1.0 E 5.0  */
         aleatorioDouble = Math.random()* 5  + 1.0;
        System.out.println(aleatorioDouble);


        /* PARA UN ALEATORIO ENTEIRO HAI QUE CONVERTER O DOUBLE QUE NOS DÁ A FUNCIÓN A INT */
        /* ENTEIRO ALEATORIO ENTRE 1 E 10*/
        int aleatorioEnteiro = (int) (Math.random()* 10)  + 1;
        System.out.println(aleatorioEnteiro);
    }
}
package UD3.herdanza;

class AppLavadora {

    public static void main(String[] args) {
        Lavadora lava1 = new Lavadora();

        System.out.println("codigo "+lava1.getCodigo());
        System.out.println("prezo "+ lava1.getPrezo());
        System.out.println("A carga "+lava1.getCarga());

        Lavadora lava2 = new Lavadora("123L",600, 9);
        System.out.println("codigo "+lava2.getCodigo());
        System.out.println("prezo "+ lava2.getPrezo());
        System.out.println("A carga "+lava2.getCarga());
        
    }
}
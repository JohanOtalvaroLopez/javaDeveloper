package ejemplo;

public interface Servicio {
    int dato=100;

    void metodo1();
    double metodo1(int a);

    private void secreto(){
        System.out.println("Este es el codigo secreto");
    }

    default void metodo2(){
        secreto();
        System.out.println("Este metodo lleva codigo");
        secreto();
        Servicio.utileria();
    }

    static void utileria(){

        System.out.println("Este es el metodo utilitario!!!");
    }
}
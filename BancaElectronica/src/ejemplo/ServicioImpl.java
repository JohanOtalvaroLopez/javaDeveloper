package ejemplo;

public class ServicioImpl implements Servicio {
    @Override
    public void metodo1() {
        System.out.println("Implementacion del metodo abstracto 1");
    }

    @Override
    public double metodo1(int a) {
        System.out.println("Implementacion del metodo abstracto 2: " + a);
        return 0;
    }

    @Override
    public void metodo2() {
        Servicio.super.metodo2();
        System.out.println("Mejor reescribir el metodo");
    }

    public static void utileria() {
        System.out.println("Este es un metdodo de la clase ServicioImpl");
    }

    public void copia() {
        System.out.println("Estoy copiando");
    }
}
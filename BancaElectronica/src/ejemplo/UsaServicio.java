package ejemplo;

public class UsaServicio {
    public static void main(String[] args) {
        //Servicio s = new ServicioImpl();
        ServicioImpl s = new ServicioImpl();
        s.metodo1();
        s.metodo1(10);
        s.metodo2();
        s.copia();
    }
}
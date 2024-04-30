package hilos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Alumno implements Runnable {

    String nombre;
    int duerme;

    @Override
    public void run() {
        System.out.println("Hola, soy " + nombre + ", comencé a las :" + LocalDateTime.now());
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " va en la vuelta " + i);
            try {
                Thread.sleep(duerme);
            } catch (InterruptedException e) {
                System.out.println("Alguien me despertó antes de tiempo: " + e.getMessage());
            }
        }
        System.out.println("Hola de nuevo, soy " + nombre + ", terminé a las :" + LocalDateTime.now());
    }

    public Alumno(String nombre, int duerme) {
        this.nombre = nombre;
        this.duerme = duerme;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuerme() {
        return duerme;
    }

    public void setDuerme(int duerme) {
        this.duerme = duerme;
    }

    public static void main(String[] args) {
        System.out.println("Procesadores: " + Runtime.getRuntime().availableProcessors());
        Thread t1 = new Thread(new Alumno("Pepito", 2000));
        Thread t2 = new Thread(new Alumno("Mariana", 5000));
        Thread t3 = new Thread(new Alumno("Angie", 1000));
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Ya llegó al final del método Main");
    }
}

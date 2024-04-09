package ejemplo;

public class Helicoptero extends Vehiculo implements Volador{
    private String marca;
    private double velocidad;

    public Helicoptero(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    @Override
    public void despegar() {
        System.out.println("Acelera el motor y las aspas hasta levantar el vuelo");
    }

    @Override
    public void volar() {
        System.out.println("Con el mando puede dirigirse a cualquier lugar");
    }

    @Override
    public void aterrizar() {
        System.out.println("Disminuye la velocidad y se posa en un lugar plano");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Helicoptero{" +
                "marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}

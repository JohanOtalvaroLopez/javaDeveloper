package ejemplo;

public class Aguila extends Animal implements Volador{

    private String embergadura;

    public Aguila(String nombre, String color, int numeroPatas, String embergadura) {
        super(nombre, color, numeroPatas);
        this.setEmbergadura(embergadura);
    }

    public String getEmbergadura() {
        return embergadura;
    }

    public void setEmbergadura(String embergadura) {
        this.embergadura = embergadura;
    }

    @Override
    public String toString() {
        return "Aguila{" +
                "embergadura='" + embergadura + '\'' +
                '}';
    }

    @Override
    public void despegar() {
        System.out.println("Agita las alas hasta levantar el vuelo");
    }

    @Override
    public void volar() {
        System.out.println("El Aguila planea");
    }

    @Override
    public void aterrizar() {
        System.out.println("Disminuye su velocidad y se posa en un lugar");
    }
}

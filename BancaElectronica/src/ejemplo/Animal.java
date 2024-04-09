package ejemplo;

public abstract class Animal {
    private String nombre;
    private String color;
    private int numeroPatas;

    public Animal(String nombre, String color, int numeroPatas) {
        this.setNombre(nombre);
        this.setColor(color);
        this.setNumeroPatas(numeroPatas);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", numeroPatas=" + numeroPatas +
                '}';
    }
}

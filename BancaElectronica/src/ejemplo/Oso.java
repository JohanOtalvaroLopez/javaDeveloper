package ejemplo;

public class Oso extends Animal{
    private String hibernar;

    public Oso(String nombre, String color, int numeroPatas, String hibernar) {
        super(nombre, color, numeroPatas);
        this.setHibernar(hibernar);
    }

    public String getHibernar() {
        return hibernar;
    }

    public void setHibernar(String hibernar) {
        this.hibernar = hibernar;
    }

    @Override
    public String toString() {
        return "Oso{" +
                "hibernar='" + hibernar + '\'' +
                '}';
    }
}

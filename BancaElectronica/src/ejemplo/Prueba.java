package ejemplo;

public class Prueba<T> {
    private T dato;

    public Prueba(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "dato=" + dato +
                '}';
    }
}

package ejemplo;

public class CodigoFijo implements CalculadoraServicio {
    @Override
    public int operacion(int a, int b) {
        return a + b;
    }
}

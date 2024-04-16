package ejemplo;

public class UsaCalculadoraServicio {
    public static void main(String[] args) {
        //Formato completo de un lambda
        CalculadoraServicio cs = (int a, int b) -> {
            return a * b;
        };
        int resultado = cs.operacion(10, 20);
        System.out.println("Resultado1: " + resultado);

        //Formato simplificado de un lambda
        CalculadoraServicio cs2 = (x, y) -> 2 * x + 2 * y;
        int resultado2 = cs2.operacion(10, 20);
        System.out.println("Resultado2: " + resultado2);

        CodigoFijo cf = new CodigoFijo();
        int r = cf.operacion(30, 50);
        System.out.println("R = " + r);
    }
}
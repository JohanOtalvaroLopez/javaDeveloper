package ejemplo;

// Clases Anidadas, son lo mismo que las clases "Amigas" en C++
// Una clase interna es un apoyo directo a la clase que la contiene
// La clase interna esta encapsulada en la clase que la contiene
// Usos: Manejo de objetos que son privados a la clase externa

public class Externa {
    private int valor = 100;

    // clase Miembro
    private class Interna {
        int valorInterno;

        public void imprimir() {
            System.out.println("Valor de la clase externa: " + valor);
        }
    }

    public static class Independiente {
        // Clase utileria de otra clase
        int valor;
    }

    public static void main(String[] args) {
        Externa e = new Externa();
        Externa.Interna ei = e.new Interna();
        Externa.Independiente eiStat = new Externa.Independiente();
        OperacionesImpl<Integer> suma = new OperacionesImpl();

        System.out.println(suma.opera(10.2, 15.3));

        // Quiero que en Operaciones se haga una multiplicacion
        // Usando una clase anomina queda asi
        OperacionesImpl<Integer> multiplica = new OperacionesImpl<>();

        Operaciones<Integer> division = new Operaciones<Integer>() {
            @Override
            public Integer opera(Integer a, Integer b) {
                return a / b;
            }
        };


        System.out.println(division.opera(444, 222));

        // Implementado con Lambda
        Operaciones<Double> resta = (x, y) -> x - y;
        System.out.println(resta.opera(100.3, 25.));
    }

}

class GUI {
    // Window, paneles, etiquetas, campos de captura, botones

    class ManejadoraEventos {
        // Se encarga de manejar los eventos que el
        // usuario provoque en la GUI
    }

    class ManejaBD {
        // busca datos en tabla
    }
}

@FunctionalInterface
interface Operaciones<T> {
    T opera(T a, T b);
}

class OperacionesImpl<T> implements Operaciones<Double> {


    @Override
    public Double opera(Double a, Double b) {
        return a + b;
    }
}
package ejemplo.lambdas;

import java.util.*;
import java.util.stream.Stream;

public class ManejoStreams {
    public static void main(String[] args) {
        String[] nombres = {"Angel Alberto", "Jose Daniel", "Maria Camila", "Angie Cristina"};
        for (String nombre : nombres) {
            if (nombre.contains("m")) {
                //System.out.println(nombre);
                break;
            }
        }

        //1. Generar un Stream
        //2. Aplicar cero o una o más operaciones
        //3. Terminar el Stream

        //System.out.println(Arrays.stream(nombres).getClass().getName());
        Stream<String> listaNombres = Arrays.stream(nombres);
        listaNombres.forEach(nombre-> System.out.println(nombre));

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(7);
        numeros.add(19);

        numeros.stream().forEach(n-> System.out.println(n));
    }
}


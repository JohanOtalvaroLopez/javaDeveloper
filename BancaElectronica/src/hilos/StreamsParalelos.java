package hilos;

import java.util.*;
import java.util.stream.IntStream;

public class StreamsParalelos {
    public static void main(String[] args) {
        List<Integer> numeros = IntStream.range(1,5).mapToObj(i->i).toList();
        numeros.parallelStream().forEach(n-> System.out.println(n + " mostrando el hilo:" + Thread.currentThread().getName()));
    }
}

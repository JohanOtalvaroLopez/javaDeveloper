package ejemplo.enumerados;

import java.util.Arrays;

public class UsaEnumerados {
    public static void main(String[] args) {
        DiasDeLaSemana d = DiasDeLaSemana.Lunes;
        System.out.println((Arrays.stream(DiasDeLaSemana.values()).toList()));
        d.imprime();
    }
}

package ejemplo;

public class PruebaCadenas {
    public static void main(String[] args) {
        OperaCadenas compara = (a, b) -> (a == b) ? "Cadenas iguales" : "Cadenas diferentes";
        System.out.println(compara.opera("Hola", "Mundo"));
        OperaCadenas compara2 = (a, b) -> {
            if (a.equals(b)) {
                return "Cadenas iguales";
            } else {
                return "Cadenas diferentes";
            }
        };
        System.out.println(compara2.opera("Hola", "Hola"));
        OperaCadenas concatena = (c1, c2) -> c1 + c2;
        System.out.println(concatena.opera("!!Hola ", "Mundo¡¡"));

        //OperaCadenas iniciaCon =
        //OperaCadenas terminaCon =
        //OperaCadenas comparaIgnorandoMayMin =
        //OperaCadenas buscaCadena = La cadena "es" esta en "Hoy es dia jueves" "Si/No"
    }
}


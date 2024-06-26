package ejemplo.lambdas;

import ejemplo.Persona;

import java.util.*;
import java.util.stream.Collectors;

public class ProcesaStreams {
    public static void main(String[] args) {
        /*se declara la lista*/
        List<Persona> lista = new ArrayList<>();
        /*se agregan objetos a la lista*/
        lista.add(new Persona("Zaira", 27, "EDOMEX", 'F'));
        lista.add(new Persona("Carolina", 18, "EDOMEX", 'F'));
        lista.add(new Persona("Victor", 30, "CDMX", 'M'));
        lista.add(new Persona("Javier", 32, "CDMX", 'M'));
        lista.add(new Persona("Edgar", 28, "NL", 'M'));
        lista.add(new Persona("Daniela", 36, "SON", 'F'));
        lista.add(new Persona("Luz", 25, "PUE", 'F'));
        lista.add(new Persona("Ernesto", 13, "OAX", 'M'));
        lista.add(new Persona("Alicia", 29, "QRO", 'F'));
        lista.add(new Persona("Jorge", 41, "VER", 'M'));

        /*/
        lista.stream().filter(p->p.getEdad()>30).forEach(n-> System.out.println(n));
        lista.stream().filter(p->p.getEdad()>30).filter(p->p.getNombre().startsWith("D")).forEach(p-> System.out.println("Persona:"+p));
        lista.stream().filter(p->p.getEdad()>30 && p.getNombre().startsWith("D")).forEach(System.out::println);
        lista.stream().map(p->p.getNombre()).peek(n-> System.out.println("Nombre->"+n)).filter(n->n.contains("e")).forEach(System.out::println);
        List<Persona> origen = lista.stream().filter(persona -> persona.getCiudadOrigen().equals("EDOMEX")).sorted().toList();
        origen.stream().filter(p->p.getSexo()=='F').forEach(persona -> System.out.println(persona));
        System.out.println(origen);
        lista.stream().map(p->p.getNombre()).peek(n-> System.out.println("Nombre->"+n)).filter(n->n.contains("e")).sorted().forEach(System.out::println);

        lista.stream().sorted((p1,p2)->{if(p1.getSexo()<p2.getSexo()) {return -1;}else if(p1.getSexo()>p2.getSexo()) { return 1;}else return 0;}).forEach(System.out::println);
    /*/
        //Ordenar por género
        lista.stream().sorted((p1, p2) -> ((Character) p1.getSexo()).compareTo(p2.getSexo())).forEach(System.out::println);
        lista.stream().sorted((p1, p2) -> Character.compare(p1.getSexo(), p2.getSexo())).forEach(System.out::println);
        //Ordenar por edad:
        lista.stream().sorted((p1, p2) -> ((Integer) p1.getEdad()).compareTo(p2.getEdad())).forEach(System.out::println);
        //Mayores o iguales de 25 años
        System.out.println("Personas: " + lista.stream().filter(p -> p.getEdad() >= 25).count());
        //Promedio de edad
        OptionalDouble resultado = lista.stream().mapToInt(p -> p.getEdad()).average();
        if (resultado.isPresent()) {
            System.out.println("Promedio de edades: " + resultado.getAsDouble());
        }
        Map<String, List<Persona>> mapa = lista.stream().collect(Collectors.groupingBy(persona -> persona.getCiudadOrigen()));
        System.out.println(mapa);
        for (String estado : mapa.keySet()) {
            System.out.println(estado);
            System.out.println(mapa.get(estado));
        }
        Map<Boolean, List<Persona>> mapa2 = lista.stream().collect(Collectors.partitioningBy(t -> t.getEdad() > 25));
//        System.out.println(mapa2);
        Optional<Persona> encontrada = lista.stream()
                .filter(persona -> persona.getEdad() > 27)
                .findFirst();
        if (encontrada.isPresent()) {
            System.out.println(encontrada.get());
        } else {
            System.out.println("No se encontraron personas mayores a 27 años");
        }
    }
}
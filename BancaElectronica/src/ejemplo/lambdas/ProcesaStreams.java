package ejemplo.lambdas;

import ejemplo.Persona;

import java.util.*;

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

        lista.stream().filter(p->p.getEdad()>30).forEach(n-> System.out.println(n));
        lista.stream().filter(p->p.getEdad()>30).filter(p->p.getNombre().startsWith("D")).forEach(p-> System.out.println("Persona:"+p));
        lista.stream().filter(p->p.getEdad()>30 && p.getNombre().startsWith("D")).forEach(System.out::println);
        lista.stream().map(p->p.getNombre()).peek(n-> System.out.println("Nombre->"+n)).filter(n->n.contains("e")).forEach(System.out::println);
        List<Persona> origen = lista.stream().filter(persona -> persona.getCiudadOrigen().equals("EDOMEX")).sorted().toList();
        origen.stream().filter(p->p.getSexo()=='F').forEach(persona -> System.out.println(persona));
        System.out.println(origen);
        lista.stream().map(p->p.getNombre()).peek(n-> System.out.println("Nombre->"+n)).filter(n->n.contains("e")).sorted().forEach(System.out::println);

        lista.stream().sorted((p1,p2)->{if(p1.getSexo()<p2.getSexo()) {return -1;}else if(p1.getSexo()>p2.getSexo()) { return 1;}else return 0;}).forEach(System.out::println);
    }
}
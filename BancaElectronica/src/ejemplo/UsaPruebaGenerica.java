package ejemplo;

public class UsaPruebaGenerica {
    public static void main(String[] args) {
        Prueba<String> a = new Prueba<>("Hola Mundo");
        System.out.println(a);
        a.setDato("Hola JAVA DEVELOPER");
        System.out.println(a);

        Prueba<Integer> b = new Prueba<>(100);
        System.out.println(b);
        b.setDato(999);
        System.out.println(b);
    }
}

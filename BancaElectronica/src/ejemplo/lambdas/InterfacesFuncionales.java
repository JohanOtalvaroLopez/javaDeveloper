package ejemplo.lambdas;

import negocio.Banco;
import negocio.Cliente;

import java.util.function.*;

public class InterfacesFuncionales {
    public static void main(String[] args) {
        Predicate<String> prueba = s -> s.length() > 5;
        System.out.println("La cadena es mayor a 5 caracteres : " + prueba.test("Hola Mundo"));
        Consumer<String> consumidor = cadena -> System.out.println("Consumí " + cadena);
        consumidor.accept("Refresco");

        Function<Banco, Cliente> obtieneCliente = (b)-> b.consultaCliente(123456);

        Banco banco = new Banco("Bancolombia", "Av. las vegas", "Carrera 48", "Industriales", "Antioquia", "050023", "XYZ1234", "6045109000");

        //Creación de clientes:
        Cliente c1 = new Cliente(112233, "Pepito", "Perez", "Regional", "Calle 7 Sur", "Guayabal", "Antioquia", "050030", "ABCD9876", "6042858012", "20-04-1989");
        Cliente c2 = new Cliente(998877, "Maria", "La del barrio", "Oriental", "Carrera 46", "Centro", "Antioquia", "050078", "ZXCV1234", "6042115344", "24-12-2000");

        //Agrego los clientes
        banco.agregarCliente(c1);
        banco.agregarCliente(c2);
        System.out.println(obtieneCliente.apply(banco));

        Function<String,Double> convertir = s->Double.parseDouble(s);
        System.out.println(convertir.apply("2.4")+2.6);

        Supplier<StringBuilder> proveedor = ()->new StringBuilder("No tan vacío, ");
        System.out.println(proveedor.get().append("si funciona!!!"));

        UnaryOperator<String> cadena = s-> s.toUpperCase() + " ,cómo estás?";
        System.out.println(cadena.apply("Edgardo Martinez Asprilla"));

    }
}

package base;

import negocio.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Principal {
    public static void main(String[] args) {

        //Creación del banco
        Banco bancolombia = new Banco("Bancolombia", "Av. las vegas", "Carrera 48", "Industriales", "Antioquia", "050023", "XYZ1234", "6045109000");
        System.out.println(bancolombia);

        //Creación de clientes:
        Cliente c1 = new Cliente(112233, "Pepito", "Perez", "Regional", "Calle 7 Sur", "Guayabal", "Antioquia", "050030", "ABCD9876", "6042858012", "20-04-1989");
        Cliente c2 = new Cliente(998877, "Maria", "La del barrio", "Oriental", "Carrera 46", "Centro", "Antioquia", "050078", "ZXCV1234", "6042115344", "24-12-2000");
        Cliente c3 = new Cliente(123456, "Juanita", "Murillo", "Av. Boyacá", "Carrera 170", "Engativa", "Cundinamarca", "080098", "ASDF1234", "6013335588", "01-01-2005");
        Cliente c4 = new Cliente(998877, "Adolfo", "Hernandez", "La 26 con NQS", "Calle 100", "Toberin", "Cundinamarca", "080456", "QAZX9876", "6014445533", "15-04-2008");

        //Agrego los clientes
        bancolombia.agregarCliente(c1);
        bancolombia.agregarCliente(c2);
        bancolombia.agregarCliente(c3);
        bancolombia.agregarCliente(c4);

        //Listo los clientes y consulto
        bancolombia.listarClientes();
        bancolombia.consultarCliente(123456);
        bancolombia.consultarCliente(123459);

        //Busco por RFC
        bancolombia.buscarClientePorRfc("XXXXXXX");
        bancolombia.buscarClientePorRfc("QAZX9876");

        //Elimino cliente
        bancolombia.eliminarCliente(123456);
        bancolombia.eliminarCliente(888);
        bancolombia.listarClientes();

        //Creación de cuentas:
        Cuenta cuenta1 = new CuentaDeAhorro(9999, 58000000, 5.3);
        System.out.println(cuenta1);
        Cuenta cuenta2 = new CuentaDeCheque(8888, 99999999, 14500);
        System.out.println(cuenta2);
        Cuenta cuenta3 = new CuentaDeCheque(7777, 11111111, 28700);
        System.out.println(cuenta3);



    }
}

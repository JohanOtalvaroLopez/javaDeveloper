package base;

import negocio.*;

public class Principal {
    public static void main(String[] args) {

        Banco bancolombia = new Banco("Bancolombia", "Av. las vegas", "Carrera 48", "Industriales", "Antioquia", "050023", "XYZ1234", "6045109000");
        System.out.println(bancolombia);

        Cliente cliente1 = new Cliente(112233, "Pepito Perez", "Regional", "Calle 7 Sur", "Guayabal", "Antioquia", "050030", "ABC9876", "6042858012", "20-04-1989");
        System.out.println(cliente1);

        Cliente cliente2 = new Cliente(998877, "Maria la del barrio", "Oriental", "Carrera 46", "Centro", "Antioquia", "050078", "KODKU9635", "6042115344", "24-12-2000");
        System.out.println(cliente2);

        Cuenta cuenta1 = new CuentaDeAhorro(9999, 58000000, 5.3);
        System.out.println(cuenta1);

        Cuenta cuenta2 = new CuentaDeCheque(8888, 99999999, 14500);
        System.out.println(cuenta2);
    }
}

package negocio;

import java.util.ArrayList;
import java.util.*;
import java.util.TreeSet;

public class Banco implements ServicioClientes {
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private Set<Cliente> clientes;

    public Banco(String nombre, String calle, String numero, String colonia, String estado, String codigoPostal, String rfc, String telefono) {
        this.setNombre(nombre);
        this.domicilio = new Domicilio(calle, numero, colonia, estado, codigoPostal);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.clientes = new TreeSet<>();
    }

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.clientes = new TreeSet<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }


    @Override
    public String toString() {
        return "Banco{" + "nombre='" + nombre + '\'' + ", domicilio=" + domicilio + ", rfc='" + rfc + '\'' + ", telefono='" + telefono + '\'' + '}';
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        Cliente c = consultarCliente(numero);
        if (c != null) {
            clientes.remove(c);
            System.out.println("Cliente número: " + numero + ", fue eliminado.");
            System.out.println(c);
            return true;
        }
        return false;
    }

    @Override
    public Cliente consultarCliente(int numero) {
        for (Cliente c : clientes) {
            if (c.getNumero() == numero) {
                System.out.println("Cliente: " + numero + ", fue encontrado.");
                System.out.println(c);
                return c;
            }
        }
        // Pendiente el manejo de excepciones
        System.out.println("Cliente: " + numero + ", NO fue encontrado.");
        return null;
    }

    @Override
    public Set<Cliente> obtenerClientes() {
        return clientes;
    }

    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        for (Cliente c : clientes) {
            if (c.getRfc() == rfc) {
                System.out.println("Rfc: " + rfc + ", fue encontrado.");
                System.out.println(c);
                return c;
            }
        }
        // Pendiente el manejo de excepciones
        System.out.println("Rfc: " + rfc + ", NO fue encontrado.");
        return null;
    }

    @Override
    public void listarClientes() {
        System.out.println("=".repeat(300));
        //for (Cliente c : clientes) {
        //    System.out.println(c);
        //}
        clientes.forEach(c -> System.out.println(c));
        System.out.println("=".repeat(300));
    }
}

package negocio;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, String calle, String numero, String colonia, String estado, String codigoPostal, String rfc, String telefono) {
        this.setNombre(nombre);
        this.domicilio = new Domicilio(calle, numero, colonia, estado, codigoPostal);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.clientes = new ArrayList<>();
    }

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.clientes = new ArrayList<>();
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }


    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

package negocio;

import java.util.ArrayList;

public class Cliente {
    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    public Cliente(int numero, String nombre, String calle, String numeroDom, String colonia, String estado, String codigoPostal, String rfc, String telefono, String fechaNacimiento) {
        this.setNumero(numero);
        this.setNombre(nombre);
        this.domicilio = new Domicilio(calle, numeroDom, colonia, estado, codigoPostal);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.cuentas = new ArrayList<>();
        this.setFechaNacimiento(fechaNacimiento);
    }

    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.setNumero(numero);
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.cuentas = new ArrayList<>();
        this.setFechaNacimiento(fechaNacimiento);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", nombre='" + nombre + '\'' + ", domicilio=" + domicilio + ", rfc='" + rfc + '\'' + ", telefono='" + telefono + '\'' + ", cuentas=" + cuentas + ", fechaNacimiento='" + fechaNacimiento + '\'' + '}';
    }
}

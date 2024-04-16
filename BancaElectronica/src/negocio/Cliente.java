package negocio;

import java.util.*;

public class Cliente implements ServicioCuentas, Comparable<Cliente> {


    private int numero;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    public Cliente(int numero, String nombre, String apellido, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.setNumero(numero);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDomicilio(domicilio);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.setCuentas(new ArrayList<>());
        this.setFechaNacimiento(fechaNacimiento);
    }

    public Cliente(int num, String nombre, String apellido, String calle, String numero, String colonia, String estado, String codigoPostal, String rfc, String telefono, String fechaNacimiento) {
        this.setNumero(num);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.domicilio = new Domicilio(calle, numero, colonia, estado, codigoPostal);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.setCuentas(new ArrayList<>());
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        return "Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }


    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
        return true;
    }

    @Override
    public boolean cancelarCuenta(int numero) {
        return false;
    }

    @Override
    public void abonarCuenta(int numero, double abono) {

    }

    @Override
    public void retirar(int numero, double retiro) {

    }

    @Override
    public ArrayList<Cuenta> obtenerCuentas() {
        return cuentas;
    }

    @Override
    public void listarCuentas() {
        System.out.println("=".repeat(300));
        for (Cuenta c : cuentas) {
            System.out.println(c);
        }
        System.out.println("=".repeat(300));
    }

    //Ordenar por NOMBRE
    //public int compareTo(Cliente o) {
    //    return this.nombre.compareTo(o.nombre);
    //}


    @Override
    //El método debe regresar -1 si va antes, 0 si son iguales y +1 si va después
    public int compareTo(Cliente o) {
        if (this.numero < o.numero) {
            return -1;
        } else {
            if (this.numero == o.numero) {
                return 0;
            } else {
                return +1;
            }
        }
    }

}

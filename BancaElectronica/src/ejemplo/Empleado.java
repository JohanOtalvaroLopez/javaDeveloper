package ejemplo;

public class Empleado extends Persona {
    private int clave;
    private String puesto;
    private double sueldo;
    private double sueldoMinimo = 200;

    public Empleado(String nombre, String domicilio, int edad, int clave, String puesto, double sueldo) {
        super(nombre, domicilio, edad);//construye la parte ejemplo.Persona que es el ejemplo.Empleado
        this.setClave(clave);
        this.setPuesto(puesto);
        this.setSueldo(sueldo);
    }

    public Empleado(String nombre, String domicilio, int edad, int clave, String puesto) {
        super(nombre, domicilio, edad);
        this.clave = clave;
        this.puesto = puesto;
        this.sueldo = this.sueldoMinimo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo(String clave) {
        if (clave == "abc123") {
            return sueldo;
        } else {
            System.out.println("No estas autorizado para ver el sueldo!!!");
            return 0;
        }
    }



    @Override
    public String toString() {
        return super.toString() + " ejemplo.Empleado{" +
                "clave=" + clave +
                ", puesto='" + puesto + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public void hablar() {
        System.out.println("Jefe: subame el sueldo!!!");
    }
}

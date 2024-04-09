package ejemplo;

public abstract class Persona extends Object implements Comunicarse {
    // variables de instancia-campos (atributos)
    private String nombre;
    private String domicilio;
    private int edad;

    public Persona(String nombre, String domicilio, int edad) {
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setEdad(edad);
    }




// métodos (operaciones)

    public void cumpleAnios(){
        setEdad(getEdad() +1);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>0) {
            this.edad = edad;
        }else{
            System.out.println("La edad asignada es erronea!!!");
        }
    }

    @Override
    public String toString() {
        return "ejemplo.Persona{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", edad=" + edad +
                '}';
    }
}

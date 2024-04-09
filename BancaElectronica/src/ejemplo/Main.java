package ejemplo;

public class Main {
    public static void main(String[] args) {
//        ejemplo.Persona p1 = new ejemplo.Persona("Wiston","Bogota",31);
//        p1.setEdad(20);
//        p1.nombre="Wiston";
//        p1.domicilio="Carrera 23, 700 Bogota";
//        System.out.println("Nombre:"+ p1.getNombre());
//        System.out.println("Edad:"+ p1.getEdad());
//        System.out.println(p1);
        Empleado e1 = new Empleado("Angie","Medellin",25,222,"Programador A",1200);
        System.out.println(e1);
        // Polimorfismo
        Persona p2 = new Empleado("Juan","Mexico",25,111,"Consultor",5000);
        System.out.println("El sueldo del empleado es:"+((Empleado)p2).getSueldo("abc123"));


    }
}
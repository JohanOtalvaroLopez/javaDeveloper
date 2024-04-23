package ejemplo.Fechas;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class FechasYTiempo {
    public static void main(String[] args) {
        //Date fecha = new Date();
        //System.out.println(fecha);
        //fecha.setDate(-1);
        //System.out.println(fecha);

        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);//Formato ISO AAA-MM-DD

        LocalDate fechaNueva = fecha.plusDays(10);
        System.out.println(fechaNueva);

        LocalDate tiempo = LocalDate.now();
        System.out.println(tiempo);

        LocalDate findeanio = LocalDate.of(2024,12,31);
        System.out.println(findeanio);
        System.out.println(findeanio.getDayOfWeek());
        System.out.println(findeanio.isLeapYear());



    }
}

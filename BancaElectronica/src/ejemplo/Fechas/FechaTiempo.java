package ejemplo.Fechas;

import java.time.*;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class FechaTiempo {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("Fecha:"+fecha);
        LocalDate hoy = LocalDate.now();
        System.out.println("Dia del año:"+hoy.getDayOfYear());
        System.out.println(hoy);
//        LocalDate pasadoManana=hoy.plusDays(2);
//        System.out.println(pasadoManana);
//        System.out.println("Fecha hace 5 dias: "+hoy.minusDays(5));
//        LocalTime tiempo = LocalTime.now();
//        System.out.println(tiempo);
//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
//        LocalDate otraFecha = LocalDate.of(1989,5,18);
//        System.out.println(otraFecha);
        LocalDate antigua = LocalDate.parse("1989-04-20");
        System.out.println(antigua);
//        System.out.println(hoy.getDayOfWeek().getValue());
        Period periodo = Period.between(antigua,hoy);
        System.out.println("Periodo: "+periodo);
//        System.out.println("Dias entre dos fechas: "+periodo);
        Duration duracion =Duration.between(antigua.atStartOfDay(),hoy.atStartOfDay());
        System.out.println("Duración en dias: "+duracion.toDays());
        long dias = ChronoUnit.YEARS.between(antigua,hoy);
        System.out.println("Dias que han pasado:"+dias);
    }
}

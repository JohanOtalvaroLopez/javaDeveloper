package ejemplo.Fechas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class EjemploFechaTiempoZona {
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println(hoy);
        //        ZoneId zona = ZoneId.of("Europe/Madrid");
        ZoneId zona = ZoneId.of("America/Bogota");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss z");
        ZonedDateTime colombia = ZonedDateTime.now(zona);
        String formattedTime = formatter.format(colombia);
        System.out.println(formattedTime);
        String [] zonas = TimeZone.getAvailableIDs();
        for (String s:zonas){
            System.out.println(s);
        }
    }
}

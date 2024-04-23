package ejemplo.Fechas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EjemploFechaTiempoZona {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);

        ZoneId zona = ZoneId.of("America/Bogota");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss z");
        ZonedDateTime colombia = ZonedDateTime.now(zona);
        String formattedTime = formatter.format(colombia);
        System.out.println(formattedTime);

    }
}

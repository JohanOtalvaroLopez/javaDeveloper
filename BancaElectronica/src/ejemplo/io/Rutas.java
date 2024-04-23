package ejemplo.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.UUID;
import java.util.stream.Stream;

public class Rutas {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.forEach((p,v)-> System.out.println(p+": "+v));
        String user_home = System.getProperty("user.home");
        System.out.println("User home: " + user_home);
        Path ruta_casa = Paths.get(user_home);
        System.out.println("User path: " + ruta_casa);
        System.out.println("Existe user_home? " + Files.exists(ruta_casa));
        UUID uuid_1 = UUID.randomUUID();
        UUID uuid_2 = UUID.randomUUID();

        try {
            Path archivo = ruta_casa.resolve(uuid_1.toString()+".txt");
            Files.createFile(archivo);
            Path directorio = ruta_casa.resolve(uuid_2.toString());
            Files.createDirectories(directorio);
            Files.copy(archivo, ruta_casa.resolve("copia.txt"));
            //Files.move();
            //Files.delete();
            Path r = Paths.get("datos.txt");
            System.out.println("RUTA:"+ r.toString());
            Stream<String> lineas = Files.lines(Paths.get("datos.txt"));
            lineas.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Hubo un error al crear el archivo: "+e.getMessage());
        }

        Path rutaBase = Paths.get("/ruta/base");
        Path rutaRelativa = Paths.get("../otro/archivo.txt");
        Path rutaResultante = rutaBase.resolve(rutaRelativa);

        System.out.println("Resolve (concatena rutas): "+rutaResultante); // Salida: /otro/archivo.txt
        System.out.println("Normalize (resuelve rutas): "+rutaResultante.normalize());
    }
}
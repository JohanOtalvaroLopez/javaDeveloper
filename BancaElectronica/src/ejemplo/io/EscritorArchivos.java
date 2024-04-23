package ejemplo.io;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorArchivos {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("datos.txt");
            fw.write("Hoy es un buen día para tomar el curso de Java\n");
            fw.write("Esta es la continuación de la cadena anterior...\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Hubo problemas en el manejo del archivo" + e.getMessage());
        }
    }
}

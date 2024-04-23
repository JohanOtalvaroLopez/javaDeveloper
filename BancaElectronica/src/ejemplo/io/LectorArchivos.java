package ejemplo.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorArchivos {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("datos.txt");
            //Lectura de una sola letra
            //System.out.println((char)fr.read());

            //Lectura en Grupo
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            //System.out.println(br.readLine());
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problema al leer el archivo: " + e.getMessage());
        }
    }
}

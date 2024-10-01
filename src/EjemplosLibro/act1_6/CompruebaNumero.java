package EjemplosLibro.act1_6;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CompruebaNumero {
    public static void main(String[] args) {
        try {
            // Crear el proceso para ejecutar el primer programa (SumarDosNumeros)
            ProcessBuilder pb = new ProcessBuilder("java", "SumarDosNumeros");

            // Iniciar el proceso
            Process proceso = pb.start();

            // Leer la salida del programa ejecutado
            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            // Esperar a que el proceso termine
            int exitCode = proceso.waitFor();
            System.out.println("El programa terminó con el código de salida: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}


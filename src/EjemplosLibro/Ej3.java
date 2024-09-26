package EjemplosLibro;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ej3 {
    public static void main(String[] args) throws IOException {
        File directorio = new File("./bin");
        ProcessBuilder pb = new ProcessBuilder("java", "Ejemplo 2");
        pb.directory(directorio);
        System.out.println("Directorio de trabajo: %s%n" + pb.directory());
        Process p = pb.start();

        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.println((char) c);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

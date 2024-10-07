package pack.ejLibro;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ej3 {
    public static void main(String[] args) throws IOException {
        File directorio = new File("/home/usuario/PSP/out/production/PSP");
        ProcessBuilder pb = new ProcessBuilder("/home/usuario/.jdks/openjdk-23/bin/java", "EjemplosLibro.ejLibro.Ej2", "Me llamo Olalla");
        pb.directory(directorio);
        System.out.println("Directorio de trabajo: \n" + pb.directory());
        Process p = pb.start();

        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

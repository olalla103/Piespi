package EjemplosLibro.act1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Act6 {
    public static void main(String[] args) {
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(lector);
        int n1, n2;
        try {
            System.out.println("Introduce un número:");
            n1 = Integer.parseInt(br.readLine());
            System.out.println("Introduce un número:");
            n2 = Integer.parseInt(br.readLine());
            System.out.println("Suma de los números: " +(n1 + n2));
            lector.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

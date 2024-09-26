package Actividad1_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();
        // args = nombre;

        if (args.length > 0) {
            System.exit(1);
        } else {
            System.exit(-1);
        }
    }
}

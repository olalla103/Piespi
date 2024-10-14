package main.hilosActividades.Act2_2;

import java.applet.Applet;
import java.awt.*;

public class TransformaAct1 implements Runnable {
    String palabra;

    public TransformaAct1(String palabra) throws HeadlessException {
        this.palabra = palabra;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(Thread.currentThread().getId() * 100);
            System.out.println("Hola Mundo " + this.getPalabra() + " " + Thread.currentThread().getId());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String getPalabra() {
        return palabra;
    }
}

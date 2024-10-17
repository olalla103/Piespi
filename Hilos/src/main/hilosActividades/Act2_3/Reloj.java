package main.hilosActividades.Act2_3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reloj extends Applet implements Runnable, ActionListener {
    class HiloContador extends Thread {
        // atributos y métodos
    }// fin de la clase

    private Thread hilo;
    long CONTADOR = 0;
    private boolean parar;
    private Font fuente;
    private Button b1, b2; // botones del applet


    public void start() {
    }

    public void init() {
        setBackground(Color.yellow);
        add(b1 = new Button("Iniciar contador"));
        b1.addActionListener(this);
        add(b2 = new Button("Finalizar contador"));
        b2.addActionListener(this);
        fuente = new Font("Verdana", Font.BOLD, 26);
        setFont(fuente);
    }

    @Override
    public void run() {
        parar = false;
        Thread hiloActual = Thread.currentThread();
        while (hilo == hiloActual && !parar) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            repaint();
            CONTADOR++;
        }
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, 400, 400);
        setFont(fuente);
        g.drawString(Long.toString((long) CONTADOR), 80, 100); // muestra la hora
    }

    // para controlar que se pulsan los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            b1.setLabel("Continuar");
            if (hilo != null && hilo.isAlive()) {
                // no hago nada
            } else {
                hilo = new Thread(this);
                hilo.start();
            }
        } else if (e.getSource() == b2) {
            parar = true;
        }
    }

    public void stop() {
        hilo = null;
    }


}

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraGUI {
    static float memoria = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JPanel pantallaPanel = new JPanel();
        pantallaPanel.setLayout(new BorderLayout());
        JTextField pantalla = new JTextField("0", 12);
        pantalla.setEditable(false);
        pantallaPanel.add(pantalla, BorderLayout.NORTH);

        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new GridLayout(5, 4));

        String[] nombresBotones = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String nombre : nombresBotones) {
            JButton boton = new JButton(nombre);
            botonesPanel.add(boton);
            boton.addActionListener(new BotonActionListener(pantalla, nombre));
        }

        JPanel memoriaPanel = new JPanel();
        JButton memoriaButton = new JButton("M");
        memoriaPanel.add(memoriaButton);
        memoriaButton.addActionListener(new Memoria(pantalla));

        frame.getContentPane().add(pantallaPanel, BorderLayout.NORTH);
        frame.getContentPane().add(botonesPanel, BorderLayout.CENTER);
        frame.getContentPane().add(memoriaPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}


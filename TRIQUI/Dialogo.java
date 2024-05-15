package juego.ui;

import java.util.Scanner;

public class Dialogo {
    private static Scanner scanner = new Scanner(System.in);

    public static int obtenerEntrada(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }
}

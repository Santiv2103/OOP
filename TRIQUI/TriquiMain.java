import juego.triqui.Triqui;
import juego.ui.Dialogo;

public class TriquiMain {
    public static void main(String[] args) {
        do {
            Triqui juego = new Triqui();
            juego.jugar();

            // Preguntar al usuario si desea volver a jugar
            System.out.print("¿Desea jugar nuevamente? (0 = Si / 1 = No): ");
            int opcion = Dialogo.obtenerEntrada("");
            if (opcion != 0) {
                break; // Salir del bucle si el usuario elige salir
            } 
        } while (true); 

        System.out.println("¡Gracias por jugar! Hasta luego.");
    }
} 
  
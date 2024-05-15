package juego.triqui;
import juego.ui.Dialogo;

import juego.excepciones.MovimientoInvalidoException;

public class Humano implements Jugador {
    @Override
    public void realizarMovimiento(char[][] tablero, char jugador) throws MovimientoInvalidoException {
        // Implementación del método realizarMovimiento para el jugador humano
        int posicion;
        boolean movimientoValido = false;
        while (!movimientoValido) {
            posicion = Dialogo.obtenerEntrada("Tu turno. Ingresa la posición (1-9): ");
            int fila = (posicion - 1) / 3;
            int columna = (posicion - 1) % 3;
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugador;
                movimientoValido = true;
            } else {
                throw new MovimientoInvalidoException("Movimiento inválido. Intenta de nuevo.");
            }
        }
    }
}

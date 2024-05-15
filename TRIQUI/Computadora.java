package juego.triqui;

import juego.excepciones.MovimientoInvalidoException;

public class Computadora implements Jugador {
    @Override
    public void realizarMovimiento(char[][] tablero, char jugador) throws MovimientoInvalidoException {
        // Implementación del método realizarMovimiento para la computadora
        // Estrategia simple: la computadora siempre gana
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    tablero[i][j] = jugador;
                    return;
                }
            }
        }
    }
}
